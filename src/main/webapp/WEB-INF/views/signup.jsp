<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<script src="<c:url value='resources/static/js/app.js' />"></script>
	<script src="<c:url value='resources/static/js/service/user.service.js' />"></script>
	<script src="<c:url value='resources/static/js/controller/user.controller.js' />"></script>
	
	<title>Create Account</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
	<p><a href="/">Return to Homepage</a></p> 
	<div class="signup-form" ng-controller="UserController as ctrl">
	
		<form ng-submit="ctrl.addUser()" name="userForm">
			<h2 class="text-center">Sign Up</h2>
			<input type="hidden" ng-model="ctrl.user.id" />
			
			<div class="form-group">
				<label for="name">Name</label> 
				<input type="text" ng-model="ctrl.user.name" id="name" class="name form-control input-sm"  placeholder="Enter your full name" required="required">
				<div class="has-error" ng-show="userForm.$dirty">
					<span ng-show="userForm.name.$error.required">This is a required field</span> 
					<span ng-show="userForm.name.$error.minlength">Minimum length required is 3</span> 
					<span ng-show="userForm.name.$invalid">This field is invalid </span>
				</div>
			</div>
			
			<div class="form-group">
				<label for="age">Age (Optional)</label> 
				<input type="text" ng-model="ctrl.user.age" id="age" class="age form-control input-sm" placeholder="Enter your age">
			</div>
			
			<div class="form-group">
				<label for="email">Email Address</label> 
				<input type="email" ng-model="ctrl.user.email" id="email" class="email form-control input-sm" placeholder="Enter your email address" required="required">
			</div>
					
			<div class="form-group">
				<div class="form-actions floatRight">
					<input type="submit" value="Add" class="btn btn-primary btn-sm">
					<input type="submit" value="Check Trial" class="btn btn-primary btn-sm">
				</div>
			</div>
		</form>
		<p class="text-center">Have an account?<a href="login"> Log In</a></p>
		<p class="text-center">Check Out the <a href="dashboard"> Trial!</a></p>
		<div>
			<div class="panel-heading"><span class="lead">List of Users</span></div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>Name</th>
							<th>Age</th>
							<th>Email</th>
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="u in ctrl.users">
							<td><span ng-bind="u.id"></span></td>
							<td><span ng-bind="u.name"></span></td>
							<td><span ng-bind="u.age"></span></td>
							<td><span ng-bind="u.email"></span></td>
	
						</tr>
					</tbody>
				</table>
			</div>	
		</div>
	</div>
</body>
	<script type="text/javascript"></script>
</html>