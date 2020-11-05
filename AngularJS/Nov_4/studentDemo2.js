angular.module("HttpDemo", [])
    .controller("HttpController", function ($scope, DateFormat, DataFactory) {
        $scope.data = DataFactory.display();
        $scope.addStudent = function () {
            $scope.data = DataFactory.display();
        }
    })

    .factory("DataFactory", function ($http) {
        var DataFactory = {};
        DataFactory.url = 'http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/';

        DataFactory.add = function (student) {
            $http.post(DataFactory.url, student)
                .then(function (response) {
                    console.log("data added");
                    DataFactory.display();
                })
        }

        DataFactory.display = function () {
            $http.get('http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students')
                .then(function (response) {
                    console.log("data fetched");
                    return response.data;
                })
        }

        DataFactory.update = function (student) {
            $http.put(DataFactory.url + student.id, student)
                .then(function (response) {
                    console.log("data updated");
                    DataFactory.display();
                })
        }
        return DataFactory;
    })

    .factory("DateFormat", function () {
        var DateFormat = {};
        DateFormat.format = function (date) {
            month = '' + (date.getMonth() + 1),
                day = '' + date.getDate(),
                year = date.getFullYear();

            if (month.length < 2)
                month = '0' + month;
            if (day.length < 2)
                day = '0' + day;

            return [year, month, day].join('-');
        }
        return DateFormat;
    });