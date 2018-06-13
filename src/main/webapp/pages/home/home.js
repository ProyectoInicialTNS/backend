'use strict';


angular.module('myApp.home', ['ngRoute'])

  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider.when('/home', {
      templateUrl: 'pages/home/home.html',
      controller: 'HomeCtrl'
    });
  }])

  .controller('HomeCtrl', ['$scope', '$mdDialog', 'ApiFlight', function ($scope, $mdDialog, ApiFlight) {
    //define variables
    
    $scope.reservateDialog = reservateDialog;
    $scope.currentNavItem = 'home';
    $scope.currentFlight = null;


    ApiFlight.getAllFlights().then(
      response => {
        var toShow = JSON.parse(JSON.stringify(response.data));
        $scope.flightMatrix = obtainMatrix(toShow.map(formatAllDates), 3);
        $scope.flightList = response.data;
      }
    );

    //functions
    function formatAllDates(item, index) {
      item.flightDay = formatDate(new Date(item.flightDay));
      return item;
    }

    function obtainMatrix(data, n) {
      var grid = [], i = 0, x = data.length, col, row = -1;
      for (var i = 0; i < x; i++) {
        col = i % n;
        if (col === 0) {
          grid[++row] = [];
        }
        grid[row][col] = data[i];
      }
      return grid;
    }

    function formatDate(date) {
      var monthNames = [
        "Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Ocutubre",
        "Noviembre", "Diciembre"
      ];
      return date.getHours() + ':' + date.getMinutes() + ' - ' + date.getDate() + '/' + monthNames[date.getMonth()] + '/' + date.getFullYear();
    }

    function reservateDialog(id, ev) {
      $scope.currentFlight = $scope.flightList.filter(flight => flight.id==id)[0]; //obtengo el vuelo
      $mdDialog.show(
        {
          parent: angular.element(document.body),
          clickOutsideToClose: true,
          scope: $scope.$new(),
          template: '<md-dialog>' +
            '  <md-dialog-content>' +
            '<div layout="row" layout-align="center" style="padding-top:10px;"><md-checkbox ng-model="data.mayorEdad">Eres mayor de edad?</md-checkbox></div>' +
            '<form ng-if="data.mayorEdad" name="dialog.generateReservationForm" ng-submit="reservate()" >'+
              '<div layout="row" layout-align="center">'+
              '<md-input-container class="md-block">'+
                '<label>Numero de cedula</label>'+
                '<input type="number" required md-no-asterisk name="numCedula" ng-model="dialog.generateReservationForm.cedule">'+
                '<div ng-messages="dialog.generateReservationForm.description.$error">'+
                    '<div ng-message="required">Este campo es requerido.</div>'+
                '</div>'+
              '</md-input-container>'+
              '<md-button type="submit" class="md-raised md-primary" style="height: 20px;">Generar reserva</md-button>'+
              '</div>'+
              '</form>'+
            '  </md-dialog-content>' +
            '</md-dialog>',
          locals: {
          },
          controllerAs: 'dialog',
          controller: function($scope,$mdDialog,ApiUser){
            $scope.reservate= reservate;
            function reservate(){
              ApiUser.reservateFlight($scope.dialog.generateReservationForm.cedule,$scope.currentFlight)
              .then(
                response => {
                  $mdDialog.hide();
                  response.data ? alert("Reservacion realizada con exito") : alert("No se puede realizar reservacion");
                  
                }
              );
            }
          }
        })
    }

  }]);