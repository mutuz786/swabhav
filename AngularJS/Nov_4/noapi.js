angular.module("NoApi", [])
    .controller("NoApiController", function ($scope, $http) {
        if (localStorage.getItem("num") != null)
            $scope.num = localStorage.getItem("num");

        if (localStorage.getItem("result") != null)
            $scope.result = localStorage.getItem("result");

        $scope.fetch = function () {
            $http.get("http://numbersapi.com/" + $scope.num)
                .then(function (response) {
                    $scope.result = response.data;
                    localStorage.setItem("num", $scope.num);
                    localStorage.setItem("result", $scope.result);
                });
        }
    })