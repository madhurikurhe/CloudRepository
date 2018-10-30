// store (contains the products)
function store() {
    this.products = [
        new product("red6", "mobile1", "Red mi 6 Pro", 10000, 3),
        new product("a2", "mobile2", "Mi A2", 9000, 7),
        new product("a5", "mobile3", "Vivo 11.", 8000, 4),
        new product("a2", "mobile4", "Nokia 105 feature phone.", 3000, 2),
        new product("a4", "mobile5", "Nokia 105 feature phone.", 3000, 2),
        new product("a5", "mobile6", "Nokia 105 feature phone.", 3000, 2),

        new product("e2", "saree2", "Navy blue Anarkali", 4000, 2),
        new product("e3", "saree3", "Black straight kurti", 6000, 2),
        new product("e4", "saree4", "Brown party wear gown", 8000, 2),
        new product("e5", "saree5", "Pink silk saree", 6000, 2),
        new product("e6", "saree6", "Banarasi saree", 4000, 2),
        new product("e1", "saree1", "Silk Kanjivaram", 3000, 2),
        new product("e1", "saree1", "Silk Kanjivaram", 3000, 2),
        new product("e1", "saree1", "Silk Kanjivaram", 3000, 2),


        new product("m2", "Dress2", "Item2", 2000, 2),
        new product("m3", "Dress3", "Item3", 3000, 2),
        new product("m2", "Dress4", "Item4", 4000, 2),
        new product("m5", "Dress5", "Item5", 5000, 2),
        new product("m6", "Dress6", "Item6", 6000, 2),
        new product("m1", "Dress1", "Item1", 1000, 2)

    ];


}
store.prototype.getProduct = function (id) {
    for (var i = 0; i < this.products.length; i++) {
        if (this.products[i].id == id)
            return this.products[i];
    }
    return null;
}


