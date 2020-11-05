angular.module("MathDemo", [])
    .factory('MathFactory', function () {
        var MathFactory = {};
        MathFactory.getSquare = function (num) {
            return num * num;
        }
        MathFactory.getCube = function (num) {
            return num * num * num;
        }
        return MathFactory;
    })
    .controller('SquareController', function ($scope, $rootScope, MathFactory) {
        $rootScope.getSquare = function () {
            $scope.result = MathFactory.getSquare($rootScope.data);
        }
    })
    .controller('CubeController', function ($scope, $rootScope, MathFactory) {
        $rootScope.getCube = function () {
            $scope.result = MathFactory.getCube($rootScope.data);
        }

    });