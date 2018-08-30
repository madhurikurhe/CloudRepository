var app = angular.module('plunker', []);

app.controller('MainCtrl', function ($scope) {
    $scope.backgroundColors = [
        { name: "Red", hex: "#F21B1B" },
        { name: "Blue", hex: "#0099CC" },
        { name: "Green", hex: "#07BA16" },
        { name: "Yellow", hex: "#FFFF99" }];

    $scope.foregroundColors = [
        { name: "Red", hex: "#F21B1B" },
        { name: "Blue", hex: "#0099CC" },
        { name: "Green", hex: "#07BA16" },
        { name: "Yellow", hex: "#FFFF99" }];

    $scope.fontSize = ["10px", "30px", "50px"];

    $scope.fontStyle = ["arial", "tahoma", "Serif","Georgia"];

});
