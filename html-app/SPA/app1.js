var app = angular.module('myApp', ['ngRoute']);

app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'pages/home.html',
    controller  : 'HomeController'
  })

  .when('/carrier', {
    templateUrl : 'pages/carrier.html',
    controller  : 'carrierController'
  })

  .when('/about', {
    templateUrl : 'pages/about.html',
    controller  : 'AboutController'
  })

  .otherwise({redirectTo: '/'});
});

app.controller('HomeController', function($scope) {
  $scope.message = 'Welcome  on Home';
});

app.controller('carrierController', function($scope) {
  $scope.message = 'Welcome on Carrier';
});

app.controller('AboutController', function($scope) {
  $scope.message = 'Welcome on About us';
});
