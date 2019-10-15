var app = angular.module("admin", []);

app.controller("AdminCtrl", function ($http) {
    var controller = this;
    controller.users = [];

    controller.loadCon = function () {
        controller.getAllUsers();
    };

    controller.getAllUsers = function () {
        $http.get("/getAllUsers").then(function (value) {
            controller.users = value.data;
        }, function (reason) {
            window.alert("Error");
        })
    };

    controller.delUser = function (id) {
        $http.put("/delUser/" + id).then(function () {
            controller.loadCon();
        }, function (reason) {
            window.alert("Error");
        })
    };

    controller.changeStatus = function (id) {
        $http.put("/changeStatus/" + id).then(function () {
            controller.loadCon();
        }, function (reason) {
            window.alert("Error");
        })
    };

    controller.changeRole = function (id) {
        $http.put("/changeRole/" + id).then(function () {
            controller.loadCon();
        }, function (reason) {
            window.alert("Error");
        })
    };
});