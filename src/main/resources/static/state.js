var app = angular.module('state', ['ui.router']);

app.config(function ($stateProvider, $urlRouterProvider) {

    $urlRouterProvider.otherwise("/home");

    $stateProvider
        .state('home', {
            url: "/home",
            templateUrl: "home/home.html"
        })
        .state('test', {
            url: "/test",
            templateUrl: "test/test.html"
        })
        .state('admin', {
            url: "/admin",
            templateUrl: "admin/admin.html"
        })
});