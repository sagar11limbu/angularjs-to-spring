
app.factory('dataService',['$http',function($http){
	return{
		
		addUser:function(user){
			var url="http://localhost:8080/sampleProject/user/save";
			$http.post(url,user);
		}
	}
}]);
