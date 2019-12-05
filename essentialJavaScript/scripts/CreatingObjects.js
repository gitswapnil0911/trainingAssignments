var app = (function () {
    var Product={};

    Product.id=101;
    Product.name="Sony TV";

    Product.toString = function () {

        return this.id +","+this.name;

    }

    return{
        prod:Product
    }

})();

console.log(app.prod.toString());