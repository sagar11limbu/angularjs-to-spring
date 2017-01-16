app.controller('myCtrl',['$scope','dataService',function($scope,dataService){
	init();
	$scope.user={id:1,username:'',email:'',password:''};
	$scope.submitData = function(){
		dataService.addUser(user);
	}
}]);



