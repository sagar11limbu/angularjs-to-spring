<html>
<head>
<title>insert data</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body ng-app="myApp">
<div class="container" ng-controller="myCtrl">
	<div class="row">
		<div class="col-md-6">
			<form class="form-horizontal" method="POST">
			  <fieldset>
			    <div id="legend">
			      <legend class="">Register</legend>
			    </div>
			    <div class="control-group">
			      <!-- Username -->
			      <label class="control-label"  for="username">Username</label>
			      <div class="controls">
			        <input type="text" id="username" name="username" ng-model="user.username" class="form-control">
			        <p class="help-block">Username can contain any letters or numbers, without spaces</p>
			      </div>
			    </div>
			 
			    <div class="control-group">
			      <!-- E-mail -->
			      <label class="control-label" for="email">E-mail</label>
			      <div class="controls">
			        <input type="text" id="email" name="email" ng-model="user.email" class="form-control">
			        <p class="help-block">Please provide your E-mail</p>
			      </div>
			    </div>
			 
			    <div class="control-group">
			      <!-- Password-->
			      <label class="control-label" for="password">Password</label>
			      <div class="controls">
			        <input type="password" id="password" name="password" ng-model="user.password" class="form-control">
			      </div>
			    </div>
			    <div class="control-group">
			      <!-- Button -->
			      <div class="controls">
			        <button class="btn btn-success" ng-click="submitData(user)">Register</button>
			      </div>
			    </div>
			  </fieldset>
			</form>
		</div>
	</div>

</div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="userDefined/mainController.js"></script>
<script type="text/javascript" src="userDefined/mainService.js"></script>
<script type="text/javascript">
</script>
</body>
</html>
