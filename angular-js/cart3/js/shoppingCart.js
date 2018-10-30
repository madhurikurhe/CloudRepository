﻿// shopping cart
function shoppingCart(cartName) {
    this.cartName = cartName;
    this.clearCart = false;
    this.checkoutParameters = {};
    this.items = [];

    //load items from localstorage
    this.loadItems();
    var self = this;

    //load items into localstorage
    $(window).on('storage', function (e) {
        if (e.originalEvent.key == self.cartName + '_items' && !self.savingItems) {
            self.loadItems();
        }
    });
}

//reload items onchange

shoppingCart.prototype.loadItems = function () {
    this.items.splice(0, this.items.length);

    // load from local storage
    var items = localStorage != null ? localStorage[this.cartName + "_items"] : null;
    if (items != null && JSON != null) {
        try {
            var items = JSON.parse(items);
            for (var i = 0; i < items.length; i++) {
                var item = items[i];
                if (item.id != null && item.name != null && item.price != null && item.quantity != null) {
                    item = new cartItem(item.id, item.name, item.price, item.quantity);
                    this.items.push(item);
                }
            }
        }
        catch (err) {

        }
    }

    if (this.itemsChanged) {
        this.itemsChanged();
    }
}

// save items to local storage
shoppingCart.prototype.saveItems = function () {
    if (localStorage != null && JSON != null) {
        localStorage[this.cartName + "_items"] = JSON.stringify(this.items);
    }
}

// adds an item to the cart
shoppingCart.prototype.addItem = function (id, name, price, quantity) {
    quantity = this.toNumber(quantity);
    // update quantity for existing item
    if (quantity != 0) {
        var found = false;
        for (var i = 0; i < this.items.length && !found; i++) {
            var item = this.items[i];
            if (item.id == id) {
                found = true;
                item.quantity = this.toNumber(item.quantity + quantity);
                if (item.quantity <= 0) {
                    this.items.splice(i, 1);
                }
            }
        }
        // new item, add now
        if (!found) {
            var item = new cartItem(id, name, price, quantity);
            this.items.push(item);
        }

        this.saveItems();
    }
}

// get the total price for all items currently in the cart
shoppingCart.prototype.getTotalPrice = function (id) {
    var total = 0;
    for (var i = 0; i < this.items.length; i++) {
        var item = this.items[i];
        if (id == null || item.id == id) {
            total += this.toNumber(item.quantity * item.price);
        }
    }
    return total;
}

// get the total price for all items currently in the cart
shoppingCart.prototype.getTotalCount = function (id) {
    var count = 0;
    for (var i = 0; i < this.items.length; i++) {
        var item = this.items[i];
        if (id == null || item.id == id) {
            count += this.toNumber(item.quantity);
        }
    }
    return count;
}

// clear the cart
shoppingCart.prototype.clearItems = function () {
    this.items = [];
    this.saveItems();
}

// define checkout parameters
shoppingCart.prototype.addCheckoutParameters = function (serviceName, merchantID, options) {
    // check parameters
    if (serviceName != "PayPal") {
        throw "serviceName must be 'PayPal'";
    }
    if (merchantID == null) {
        throw "A merchantID is required in order to checkout.";
    }

    this.checkoutParameters[serviceName] = new checkoutParameters(serviceName, merchantID, options);
}

shoppingCart.prototype.checkout = function (serviceName, clearCart) {
    if (serviceName == null) {
        var p = this.checkoutParameters[Object.keys(this.checkoutParameters)[0]];
        serviceName = p.serviceName;
    }

    if (serviceName == null) {
        throw "Use the 'addCheckoutParameters' method to define at least one checkout service.";
    }

    var parms = this.checkoutParameters[serviceName];
    if (parms == null) {
        throw "Cannot get checkout parameters for '" + serviceName + "'.";
    }
    switch (parms.serviceName) {
        case "PayPal":
            this.checkoutPayPal(parms, clearCart);
            break;

        default:
            throw "Unknown checkout service: " + parms.serviceName;
    }
}

// check out using PayPal
shoppingCart.prototype.checkoutPayPal = function (parms, clearCart) {

    var data = {
        cmd: "_cart",
        business: parms.merchantID,
        upload: "1",
        rm: "2",
        charset: "utf-8"
    };


    for (var i = 0; i < this.items.length; i++) {
        var item = this.items[i];
        var ctr = i + 1;
        data["item_number_" + ctr] = item.id;
        data["item_name_" + ctr] = item.name;
        data["quantity_" + ctr] = item.quantity;
        data["amount_" + ctr] = item.price.toFixed(2);
    }


    var form = $('<form/></form>');
    form.attr("action", "https://www.paypal.com/cgi-bin/webscr");
    form.attr("method", "POST");
    form.attr("style", "display:none;");
    this.addFormFields(form, data);
    this.addFormFields(form, parms.options);
    $("body").append(form);

    this.clearCart = clearCart == null || clearCart;
    form.submit();
    form.remove();
}

shoppingCart.prototype.addFormFields = function (form, data) {
    if (data != null) {
        $.each(data, function (name, value) {
            if (value != null) {
                var input = $("<input></input>").attr("type", "hidden").attr("name", name).val(value);
                form.append(input);
            }
        });
    }
}
shoppingCart.prototype.toNumber = function (value) {
    value = value * 1;
    return isNaN(value) ? 0 : value;
}

function checkoutParameters(serviceName, merchantID, options) {
    this.serviceName = serviceName;
    this.merchantID = merchantID;
    this.options = options;
}

// items in the cart
function cartItem(id, name, price, quantity) {
    this.id = id;
    this.name = name;
    this.price = price * 1;
    this.quantity = quantity * 1;
}
