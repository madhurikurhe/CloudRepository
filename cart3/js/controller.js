// the storeController contains two objects:
function storeController($scope, $routeParams, DataService) {
    // get store and cart from service
    $scope.store = DataService.store;
    $scope.cart = DataService.cart;

    // apply changes when cart items change
    $scope.cart.itemsChanged = function (e) {
        if (!$scope.$$phase) {
            $scope.$apply();
        }
    }

    // use routing to pick the selected product
    if ($routeParams.productId != null) {
        $scope.product = $scope.store.getProduct($routeParams.productId);
    }
    else if($routeParams.productId!=null){
        $scope.product1=$scope.store.getProduct1($routeParams.productId);
    }
}
