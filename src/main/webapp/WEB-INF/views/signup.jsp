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
	
	<div class="signup-form">
		<form name="userForm" method="POST" action="addUser">
			<h2 class="text-center">Sign Up</h2>
			<div class="form-group">
				<label>Name</label>
				<input type="text" name="name" class="form-control" required="required"
					placeholder="Please input your full name:"></input>
			</div>
			
			<div class="form-group">
				<label>Age (Optional)</label>
				<input type="number" name="age" class="form-control" 
					placeholder="Please input your age:"></input>
			</div>
			
			<div class="form-group">
				<label>Email</label>
					<input type="email" name="email" class="form-control" required="required"
						placeholder="Please input your email:"></input>
			</div>
			
			<div class="form-group">
				<div class="form-actions floatRight">
					<input type="submit" value="Sign Up" class="btn btn-primary btn-sm">
				</div>
			</div>
		</form>
	</div>
</body>
</html>