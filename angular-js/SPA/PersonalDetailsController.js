 var app = angular.module("app", ['ngRoute']);

 app.config(function ($routeProvider) {
    $routeProvider
    .when('/',
    {
        templateUrl: 'home.html',
        controller: 'HomeController'
    })
    .when('/about',
    {
        templateUrl: 'about.html',
        controller: 'AboutController'
    })
    .when('/contact',
    {
        templateUrl: 'contact.html',
        controller: 'ContactController'
    })
    .when('/PD',
    {
        templateUrl: '/SPA/PD/Index.html',
        controller: "PDController"
    })
    .when('/PD/Create',
    {
        templateUrl: '/SPA/PD/create.html',
        controller: "PDControllerCreate"
    })
    .when('/PD/Edit/:id',
    {
        templateUrl: '/SPA/PD/edit.html',
        controller: "PDControllerEdit"
    })
    .when('/PD/Details/:id',
    {
        templateUrl: '/SPA/PD/details.html',
        controller: "PDControllerDetails"
    })
    .when('/PD/Delete/:id',
    {
        templateUrl: '/SPA/PD/delete.html',
        controller: "PDControllerDelete"
    })
});

app.controller('myController', function ($scope, studentService) {
    $scope.Person = studentService.GetAll();
});

app.factory('studentService', function () {
    return {
        GetAll: function () {
            return [

                { rollNo: 101, firstName: 'Madhuri', lastName: 'Unde' },
                { rollNo: 102, firstName: 'Rupali', lastName: 'Kanade' },
                { rollNo: 103, firstName: 'Trisha', lastName: 'Kurhe' },
                { rollNo: 104, firstName: 'Prasad', lastName: 'Kurhe' }

            ];

        }
    };
});


app.controller("SPAController", function ($scope, $rootScope) {
    $scope.Title = "Single Page Application";
    $rootScope.loading = false;
});

app.controller("HomeController", function ($scope) {
    $scope.Title = "Single Page Application (SPA)";
});

app.controller("AboutController", function ($scope) {
    $scope.Title = "About us";
});

app.controller("ContactController", function ($scope) {
    $scope.Title = "Contact us";
});