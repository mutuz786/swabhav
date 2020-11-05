angular.module("HttpDemo", [])
    .controller("HttpController", function ($scope, $http, Parser) {
        $scope.fetch = function () {
            $http.get("dataFile.txt")
                .then(function (response) {
                    $scope.status = response.status;
                    $scope.data = Parser.parse(response.data);
                }, function (response) {
                    $scope.status = response.status;
                    $scope.data = response.data || "request failed";
                });
        }
    })
    .factory("Parser", function () {
        var Parser = {};

        Parser.parse = function (data) {
            var items = data.split("\n");
            var employees = []
            for (item of items) {
                var entry = item.split(",")
                employees.push({
                    id: entry[0],
                    name: entry[1].replace(/'/g, ""),
                    post: entry[2].replace(/'/g, ""),
                    mid: entry[3],
                    doj: entry[4].replace(/'/g, ""),
                    sal: entry[5],
                    comm: entry[6],
                    deptid: entry[7]
                });
            }
            return employees;
        }

        return Parser;
    })