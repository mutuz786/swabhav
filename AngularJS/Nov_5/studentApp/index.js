angular.module("StudentApp", ["ngRoute"])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "resource/home.html",
                controller: "HomeController"
            })
            .when("/home", {
                templateUrl: "resource/home.html",
                controller: "HomeController"
            })
            .when("/add", {
                templateUrl: "resource/addStudent.html",
                controller: "AddController"
            })
            .when("/edit", {
                templateUrl: "resource/editStudent.html",
                controller: "EditController"
            })
    }])
    .controller("HomeController", ["$scope", "$rootScope", "$http", "$location", function ($scope, $rootScope, $http, $location) {
        $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
            .then(function (response) {
                $scope.data = response.data;
            }, function (response) {
                $scope.data = response.data || "request failed";
            });
        $scope.edit = function (student) {
            $rootScope.editTarget = student;
            console.log($scope.editTarget);
            $location.path("/edit");
        }
        $scope.delete = function (student) {
            $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + student.id)
                .then(function (response) {
                    $location.path("/");
                });
        }
    }])

    .controller("AddController", ["$scope", "$http", "$location", function ($scope, $http, $location) {
        $scope.addStudent = function () {
            $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students", $scope.student)
                .then(function (response) {
                    $scope.data = response.data;
                    $location.path("/home");
                }, function (response) {
                    $scope.data = response.data || "request failed";
                });
        }
    }])

    .controller("EditController", ["$scope", "$rootScope", "$http", "$location", function ($scope, $rootScope, $http, $location) {
        console.log($rootScope.editTarget);
        $scope.editStudent = function () {
            $http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/" + $rootScope.editTarget.id, $rootScope.editTarget)
                .then(function (response) {
                    $scope.data = response.data;
                    $location.path("/home");
                }, function (response) {
                    $scope.data = response.data || "request failed";
                });
        }
    }])

    .filter("genderFilter", function () {
        return function (isMale) {
            if (isMale)
                return "M";
            return "F"
        };
    })
