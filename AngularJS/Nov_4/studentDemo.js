angular.module("HttpDemo", [])
    .controller("HttpController", function ($scope, $http) {
        $scope.fetch = function () {
            $http.get("http://localhost:8080/api/v1/students")
                .then(function (response) {
                    $scope.status = response.status;
                    $scope.data = response.data;
                }, function (response) {
                    $scope.status = response.status;
                    $scope.data = response.data || "request failed";
                });
        }
    });