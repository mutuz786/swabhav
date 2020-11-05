angular.module("incr", [])
    .controller("IncreamentController", function ($scope, $rootScope, CounterFactory) {
        $rootScope.count = 0;
        $scope.increament = function () {
            $rootScope.count = CounterFactory.inc($rootScope.count);
        }
    })
    .controller("DecreamentController", function ($scope, $rootScope, CounterFactory) {
        $rootScope.count = 0;
        $scope.decreament = function () {
            $rootScope.count = CounterFactory.dec($rootScope.count);
        }
    })
    .factory("CounterFactory", function () {
        var CounterFactory = {};
        CounterFactory.inc = function (count) {
            return count + 1;
        }
        CounterFactory.dec = function (count) {
            return count - 1;
        }
        return CounterFactory;
    })