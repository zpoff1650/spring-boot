'use strict';

// Declare app level module which depends on views, and core components
var app = angular.module('BaseAppExample', ['ngRoute',
    "ui.router", /* Control States */
    "ngResource", /* Control API Support */


    'BaseAppExample.view1',
    'BaseAppExample.view2',
    'BaseAppExample.version'
]);


app.config(['$locationProvider', '$routeProvider', function ($locationProvider, $routeProvider) {
    $locationProvider.hashPrefix('!');

    $routeProvider.otherwise({redirectTo: '/view1'});
}]);
