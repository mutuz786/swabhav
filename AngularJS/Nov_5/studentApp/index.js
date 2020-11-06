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
    .controller("HomeController", ["$scope", "$rootScope", "DataFactory", "$location", function ($scope, $rootScope, DataFactory, $location) {
        DataFactory.getStudent()
            .then(function (response) {
                $scope.data = response.data;
            }, function (response) {
                $scope.data = response.data || "request failed";
            });
        $scope.edit = function (student) {
            $rootScope.editTarget = student;
            $location.path("/edit");
        }
        $scope.delete = function (student) {
            DataFactory.deleteStudent(student.id)
                .then(function (response) {
                    $location.path("/");
                });
        }
    }])

    .controller("AddController", ["$scope", "DataFactory", "$location", function ($scope, DataFactory, $location) {
        $scope.addStudent = function () {
            DataFactory.addStudent($scope.student)
                .then(function (response) {
                    $scope.data = response.data;
                    $location.path("/home");
                }, function (response) {
                    $scope.data = response.data || "request failed";
                });
        }
    }])

    .controller("EditController", ["$scope", "$rootScope", "DataFactory", "$location", function ($scope, $rootScope, DataFactory, $location) {
        $scope.editStudent = function () {
            console.log($rootScope.editTarget)
            DataFactory.editStudent($rootScope.editTarget)
                .then(function (response) {
                    $scope.data = response.data;
                    $location.path("/home");
                }, function (response) {
                    $scope.data = response.data || "request failed";
                });
        }
    }])

    .factory("DataFactory", ["$http", function ($http) {
        var url = 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/';
        var DataFactory = {};

        DataFactory.getStudent = function () {
            return $http.get(url);
        };

        DataFactory.addStudent = function (student) {
            return $http.post(url, student);
        };

        DataFactory.editStudent = function (student) {
            return $http.put(url + student.id, student)
        };

        DataFactory.deleteStudent = function (id) {
            return $http.delete(url + id);
        };

        return DataFactory;
    }])

    .filter("genderFilter", function () {
        return function (isMale) {
            if (isMale)
                return "M";
            return "F"
        };
    })
