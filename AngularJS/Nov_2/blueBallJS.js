angular.module("game", [])
    .controller("gameCtrl", function ($scope) {
        $scope.gameDisplay = true;
        $scope.init = function () {
            $scope.randomNum = Math.floor(Math.random() * 50) + 1;
            $scope.turns = 5;
            $scope.tried = [];
            $scope.result = "";
            $scope.option = "";
            $scope.buttons = [];
            $scope.setButtons();
            $scope.ruleSet = true;
            $scope.gameDisplay = false;
        }

        $scope.setButtons = function () {
            for (var i = 1; i <= 50; i++) {
                $scope.buttons.push(i);
                angular.element(document.getElementById(i)).css({
                    'background-color': 'white'
                });
            }
        }
        $scope.restart = function () {
            $scope.ruleSet = false;
            $scope.gameDisplay = true;
        }
        $scope.end = function (mssg) {
            $scope.result = mssg;
            angular.element(document.getElementById($scope.randomNum)).css({
                'background-color': 'blue'
            });
            $scope.option = "Click here to Restart"
        }

        $scope.isRepeat = function (x) {
            for (i of $scope.tried) {
                if (x == i)
                    return true;
            }
            return false;
        }

        //$scope.init($scope);
        $scope.check = function (x) {
            if (!$scope.isRepeat(x)) {
                $scope.tried.push(x);
                $scope.turns--;
            }

            if ($scope.turns >= 0) {
                if (x < $scope.randomNum) {
                    angular.element(document.getElementById(x)).css({
                        'background-color': 'red',
                    });
                }

                else if (x > $scope.randomNum) {
                    angular.element(document.getElementById(x)).css({
                        'background-color': 'green',
                    });
                }

                else {
                    angular.element(document.getElementById(x)).css({
                        'background-color': 'blue',
                    });
                    $scope.end("You Win")
                    return;
                }
                if ($scope.turns == 0) {
                    $scope.end("You Lose");
                    return;
                }
            }
        };
    });