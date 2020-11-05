angular.module("HttpDemo", [])
    .controller("HttpController", function ($scope, $http) {
        $scope.fetch = function () {
            $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
                .then(function (response) {
                    $scope.status = response.status;
                    $scope.data = response.data;
                }, function (response) {
                    $scope.status = response.status;
                    $scope.data = response.data || "request failed";
                });
        }
    });