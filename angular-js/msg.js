var myModule = angular.module('myModule', []);


myModule.factory('HelloWorld', function($timeout) {

    var getMessages = function(callback) {
      $timeout(function() {
        callback(['Hello', 'world!']);
      }, 2000);
    };

    return {
      getMessages: getMessages
    };

  });


  
  myModule.controller('HelloCtrl', function($scope, HelloWorld) {

    HelloWorld.getMessages(function(messages) {
      $scope.messages = messages;
    });

});
  