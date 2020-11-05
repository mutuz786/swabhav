angular.module("todo", [])
    .controller("todoCtrl", function ($scope) {
        if (typeof (Storage) !== "undefined") {
            var tasks = localStorage.getItem("tasks");
            if (tasks != null)
                $scope.tasks = JSON.parse(tasks);
            else
                $scope.tasks = [];
        }

        $scope.updateTasks = function () {
            localStorage.setItem("tasks", JSON.stringify($scope.tasks));
        }

        $scope.addTask = function () {
            $scope.tasks.push({ task: $scope.task, checked: false, date: '', stroke: '' });
            $scope.updateTasks();
            $scope.task = "";
        }

        $scope.deleteTask = function (x) {
            for (var i = 0; i < $scope.tasks.length; i++) {
                if ($scope.tasks[i] == x) {
                    $scope.tasks.splice(i, 1);
                    $scope.updateTasks();
                }
            }
        }

        $scope.arrange = function (task) {
            for (var i = 0; i < $scope.tasks.length; i++) {
                if ($scope.tasks[i] == task) {
                    if (task.checked) {
                        $scope.tasks[i].date = new Date();
                        $scope.tasks[i].stroke = {
                            'text-decoration-line': 'line-through'
                        }
                        $scope.updateTasks();
                    }
                }
            }
        }

    });