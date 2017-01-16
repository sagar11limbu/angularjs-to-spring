app.factory('dataService',['$http',function($http){
	$scope.addUser=function(user){
		var url="http://localhost:8080/sampleProject/user/save";
		$http.post(url);
	}
}]);
