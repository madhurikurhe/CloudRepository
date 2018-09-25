
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
