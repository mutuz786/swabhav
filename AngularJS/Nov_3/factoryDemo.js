angular.module("factory", [])
    .controller("factoryCtrl", function ($scope,operation) {
        $scope.add = function () {
            $scope.result = operation.add($scope.a, $scope.b);
        }
        $scope.sub = function () {
            $scope.result = operation.sub($scope.a, $scope.b);
        }
        $scope.div = function () {
            $scope.result = operation.div($scope.a, $scope.b);
        }
        $scope.mul = function () {
            $scope.result = operation.mul($scope.a, $scope.b);
        }
    })
    .factory("operation", function () {
        var operation = {};
        operation.add = function (a, b) {
            return a + b;
        }
        operation.sub = function (a, b) {
            return a - b;
        }
        operation.div = function (a, b) {
            return a / b;
        }
        operation.mul = function (a, b) {
            return a * b;
        }
        return operation;
    });