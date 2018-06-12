'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'myApp.home',
  'myApp.reservas',
  'myApp.version',
  'ngMaterial', 
  'ngMessages'
]).
config(['$locationProvider', '$routeProvider', function($locationProvider, $routeProvider) {
  $locationProvider.hashPrefix('!');

  $routeProvider.otherwise({redirectTo: '/home'});
}]);


angular.module('myApp')

.controller('IndexCtrl', ['$scope',function($scope) {

}]);
