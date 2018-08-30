var studentData=[

    { RollNo: 101, firstName: 'Madhuri', lastName: 'Unde', CGPA: 9, gender: "female" },
    { RollNo: 102, firstName: 'Keisha', lastName: 'Kanade', CGPA: 8, gender: "male" },
    { RollNo: 103, firstName: 'Trisha', lastName: 'Kurhe', CGPA: 9, gender: "female" },
    { RollNo: 104, firstName: 'Prasad', lastName: 'khh', CGPA: 6, gender: "male" }

];

var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope) {
    $scope.users = studentDatabaseService.getAllUsers(studentData);
    console.log($scope.users);
});


app.service('StudentDatabaseService', function () {
    const obj = {};

    obj.getAllUsers = function (studentData) {
        return $q(function (resolve, reject) {

            if ((resolve)) {
                resolve('resolve');
            } else {
                reject('Error');
            }
            
        });
        
    }
    return obj;
});

