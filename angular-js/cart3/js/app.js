
var storeApp = angular.module('AngularStore', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/store', {
        templateUrl: 'partials/store.htm',
        controller: storeController 
      }).
      when('/products/:productId', {
        templateUrl: 'partials/product.htm',
        controller: storeController
      }).
      when('/cart', {
        templateUrl: 'partials/shoppingCart.htm',
        controller: storeController
      }).
      otherwise({
        redirectTo: '/store'
      });
}]);


storeApp.factory("DataService", function () {
    var myStore = new store();
    var myCart = new shoppingCart("AngularStore");

   myCart.addCheckoutParameters("PayPal", "madhuriunde123@gmail.com");
    return {
        store: myStore,
        cart: myCart
    };
});