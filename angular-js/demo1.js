var app = angular.module('studentdata', []);

app.controller('main', function ($scope) {


    $scope.visible = false;

    $scope.students = [];

    $scope.newStudent = function () {

        $scope.students.push({ fname: $scope.fname, lname: $scope.lname });

        $scope.fname = '';
        $scope.lname = '';

    };


    $scope.remove = function (item) {
        var index = $scope.students.indexOf(item)
        $scope.students.splice(index, 1);
    }
});