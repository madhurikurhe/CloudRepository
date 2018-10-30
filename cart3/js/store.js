// store (contains the products)
function store() {
    this.products = [
        new product("red6", "RedMi6", "Red mi 6 Pro", 10000, 3),
        new product("a2", "MiA2", "Mi A2", 9000, 7),
        new product("v11", "Vivo11", "Vivo 11.", 8000, 4),
        new product("a2", "Nokia105", "Nokia 105 feature phone.", 3000, 2),

    ];
    

}
store.prototype.getProduct = function (id) {
    for (var i = 0; i < this.products.length; i++) {
        if (this.products[i].id == id)
            return this.products[i];
    }
    return null;
}



function storeEthnic(){
    this.product2 = [
        new product1("e1", "Sarre1", "Cotton saree", 10000),
        new product1("e2", "Sarre2", "Silk saree", 9000),
        new product1("e3", "Sarre3", "banarasi saree.", 8000),
        new product1("e4", "Sarre4", "Paithani", 3000),
        new product1("e5", "Sarre5", "Paithani", 3000),
        new product1("e6", "saree6", "Paithani", 3000),

    ];
    
}

store.prototype.getEthnic = function (id) {
    for (var i = 0; i < this.product2.length; i++) {
        if (this.product2[i].id == id)
            return this.product2[i];
    }
    return null;
}
