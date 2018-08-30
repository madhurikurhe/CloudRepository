angular
  .module('myApp', [])
  .controller('AppCtrl', AppCtrl)
  .factory('SchoolService', SchoolService);

function AppCtrl($scope, SchoolService) {
  $scope.students = SchoolService.students;
  $scope.addStudent = function() {
    SchoolService.students.push($scope.newStudent);
    $scope.newStudent = {};
  }
}

function SchoolService() {
  var service = {
    students: []
  };

  return service;
}
