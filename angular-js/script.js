
angular.module("myApp", [])
    .controller("myCtrl", ['$scope', function ($scope) {

        $scope.taskList = [];

        $scope.addTask = function (task) {
            $scope.taskList.push({
                done: false,
                task: task
            });
        };

    }
    ]);