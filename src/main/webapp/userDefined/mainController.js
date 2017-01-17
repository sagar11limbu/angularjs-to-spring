var app = angular.module('myApp',[]);

app.controller('myCtrl',['$scope','dataService',function($scope,dataService){
	$scope.user={id:1,username:'',email:'',password:''};
	$scope.submitData = function(user){
		dataService.addUser(user);
	}
}]);



