angular.module("SpaRouteApp", ["ngRoute"])

    .config(["$routeProvider", function ($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl: "resource/home.html",
                controller: "HomeController"
            })
            .when("/home", {
                templateUrl: "resource/home.html",
                controller: "HomeController"
            })
            .when("/about", {
                templateUrl: "resource/about.html",
                controller: "AboutController"
            })
            .when("/career", {
                templateUrl: "resource/career.html",
                controller: "CareerController"
            })
    }])

    .controller("HomeController", ["$scope", function ($scope) {
        $scope.data = "we are inside Home";
    }])
    .controller("AboutController", ["$scope", function ($scope) {
        $scope.data = "we are inside about";
    }])
    .controller("CareerController", ["$scope", function ($scope) {
        $scope.data = "we are inside career";
    }])
