var app = angular.module('studentdata', []);

app.controller('main', function ($scope) {


    $scope.visible = false;
    $scope.students = [];

    $scope.newStudent = function () {

        $scope.students.push({
            fname: $scope.fname,
            lname: $scope.lname,
            rollno: $scope.rollno,
            cgpa: $scope.cgpa,
            gender: $scope.gender
        });

        $scope.fname = '';
        $scope.lname = '';
        $scope.rollno = '';
        $scope.cgpa = '';
        $scope.gender = '';

    };


    $scope.remove = function (item) {
        var index = $scope.students.indexOf(item)
        $scope.students.splice(index, 1);
    }
});