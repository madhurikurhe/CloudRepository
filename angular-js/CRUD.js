var app=angular.module("myApp",[]);
app.controller("PDController", function ($scope, PDService, $rootScope) {
    $scope.Title = "Personal Details List";
    $rootScope.loading = true;
    $scope.GetPersonalDetails = PDService.GetAll().then(function (d) {
        $scope.PersonalDetails = d;
        $rootScope.loading = false;
    });
});

// PD - Create - PersonalDetails controller
app.controller("PDControllerCreate", function ($scope, PDService, $rootScope) {
    $scope.Title = "Create - Personal Details";

    $scope.Create = function () {
        $rootScope.loading = true;
        PDService.Insert($scope.firstName, $scope.lastName, $scope.age, $scope.active).then(function (d) {
            $scope.CreateMessage = d;
            $rootScope.loading = false;
        });
    };
});

// PD - Edit - PersonalDetails controller
app.controller("PDControllerEdit", function ($scope, PDService, $routeParams, $rootScope) {
    $scope.Title = "Edit - Personal Details";
    $scope.RecordToEdit = $routeParams.id; // get the parameter

    $rootScope.loading = true;
    $scope.GetSingle = PDService.GetSingle($routeParams.id).then(function (d) {
        $scope.firstName = d.FirstName;
        $scope.lastName = d.LastName;
        $scope.age = d.Age;
        $scope.active = d.Active;
        $rootScope.loading = false;
    });

    $scope.Update = function () {
        $rootScope.loading = true;
        PDService.Update($scope.RecordToEdit, $scope.firstName, $scope.lastName, $scope.age, $scope.active).then(function (d) {
            $scope.UpdateMessage = d;
            $rootScope.loading = false;
        });
    };
});
app.factory("PDService", function ($http) {
    var thisPDService = {};

    // get all data from database
    thisPDService.GetAll = function () {
        var promise = $http({
            method: 'GET',
            url: '/api/PersonalDetails'
           })
            .then(function (response) {
                return response.data;
            },
            function (response) {
                return response.data;
            });
        return promise;
    };


    // get single record from database
    thisPDService.GetSingle = function (id) {
        
        var promise = $http({
            method: 'GET',
            url: '/api/PersonalDetails/'+ id
        })
            .then(function (response) {
                return response.data;
            },
            function (response) {
                return response.data;
            });
        return promise;
    };


    // post the data from database
    thisPDService.Insert = function (firstName, lastName, age, active) {
        var personalDetail = {
            FirstName: firstName,
            LastName: lastName,
            Age: age,
            Active: active,
        };
        
        var promise = $http({
            method: 'POST',
            url: '/api/PersonalDetails',
            data: personalDetail
        })
        .then(function (response) {
            return response.statusText;
        },
        function (response) {
            return response.statusText;
        });

        return promise;
    };

    // put the data from database
    thisPDService.Update = function (autoId, firstName, lastName, age, active) {
        var personalDetail = {
            AutoId : autoId,
            FirstName: firstName,
            LastName: lastName,
            Age: age,
            Active: active,
        };

        var promise = $http({
            method: 'PUT',
            url: '/api/PersonalDetails/'+ autoId,
            data: personalDetail
        })
        .then(function (response) {
            return "Updated";
            // return response.statusText + ' ' + response.status + ' ' + response.data;
        },
        function (response) {
            return response.statusText + ' ' + response.status + ' ' + response.data;
        });

        return promise;
    };

    // delete the data from database
    thisPDService.Remove = function (autoId) {
        var promise = $http({
            method: 'DELETE',
            url: '/api/PersonalDetails/' + autoId
        })
        .then(function (response) {
            // return "Deleted";
            return response.statusText + ' ' + response.status + ' ' + response.data;
        },
        function (response) {
            return response.statusText + ' ' + response.status + ' ' + response.data;
        });

        return promise;
    };

    return thisPDService;
});
