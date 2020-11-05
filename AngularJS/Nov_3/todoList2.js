angular.module("todo", []).controller("todoCtrl", ["$scope", function (t) { if ("undefined" != typeof Storage) { var s = localStorage.getItem("tasks"); t.tasks = null != s ? JSON.parse(s) : [] } t.updateTasks = function () { localStorage.setItem("tasks", JSON.stringify(t.tasks)) }, t.addTask = function () { t.tasks.push({ task: t.task, checked: !1, date: "", stroke: "" }), t.updateTasks(), t.task = "" }, t.deleteTask = function (s) { for (var a = 0; a < t.tasks.length; a++)t.tasks[a] == s && (t.tasks.splice(a, 1), t.updateTasks()) }, t.arrange = function (s) { for (var a = 0; a < t.tasks.length; a++)t.tasks[a] == s && s.checked && (t.tasks[a].date = new Date, t.tasks[a].stroke = { "text-decoration-line": "line-through" }, t.updateTasks()) } }]);