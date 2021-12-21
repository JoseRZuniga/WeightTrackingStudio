<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<script type="text/javascript"></script>
	<script src="resources/static/app.js"></script>
	<script src="resources/static/js/service/user.service.js"></script>
	<script src="resources/static/js/controller/user.controller.js"></script>
	
	<title>Create Account</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
	<p><a href="/">Return to Homepage</a></p> 
	
	<div class="signup-form" ng-controller="UserController as ctrl">
		<h2 class="text-center">Sign Up</h2>
			<form name="userForm"  class="signup-form" ng-submit="ctrl.submit()" action="services">
			
			<input type="hidden" ng-model="ctrl.user.id" />
			<div class="form-group">
				<label>Name</label> 
				<input type="text" ng-model="ctrl.user.name" id="age" class="name form-control input-sm"  placeholder="Enter your name:" required="required">
			</div>
			
			<div class="form-group">
				<label>Age</label> 
				<input type="number" ng-model="ctrl.user.age" id="age" class="age form-control input-sm" placeholder="Enter your age:">
			</div>
			
			<div class="form-group">
				<label>Email</label> 
				<input type="email" ng-model="ctrl.user.email" id="email" class="email form-control input-sm" placeholder="Enter your email:">
			</div>
			
			<div class="row">
                <div class="form-actions floatRight">
                	<input type="submit"  value="Sign Up" class="btn btn-primary btn-sm">
                    <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="userForm.$pristine">Reset Form</button>
            	</div>
            </div>
		</form>
	</div>
</body>
</html>