// the route provides parses the URL and injects the appropriate partial page

var storeApp = angular.module('AngularStore', []).
  config(['$routeProvider', function ($routeProvider) {
    $routeProvider.
      when('/store', {
        templateUrl: 'partials/store.htm',
        controller: storeController
      }).
     when('/products/:productId', {
        templateUrl: 'partials/product.htm',
        controller: storeController
      }).
    
      when('/fashion', {
        templateUrl: 'partials/ethnicStore.html',
        controller: storeController
      }).
      when('/cart', {
        templateUrl: 'partials/shoppingCart.htm',
        controller: storeController
      }).

      when('/kids', {
        templateUrl: 'kids.html',
        controller: storeController
      }).

      
      otherwise({
        redirectTo: '/kids'
      });
  }]);

//common shopping cart and store for all views
storeApp.factory("DataService", function () {
  var myStore = new store();
  var myCart = new shoppingCart("AngularStore");

  // enable PayPal checkout
  myCart.addCheckoutParameters("PayPal", "madhuriunde123@gmail.com");

  // return data object with store and cart
  return {
    store: myStore,
    cart: myCart
  };
});