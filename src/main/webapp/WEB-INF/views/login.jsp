<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
	
	<title>Log In</title>
</head>
<body>
	<p><a href="/">Return to Homepage</a></p> 
	<div class="login-form">
		<form action="dashboard">
			<h2 class="text-center">Log in</h2>
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Username"
					required="required">
			</div>
			<div class="form-group">
				<input type="password" class="form-control" placeholder="Password"
					required="required">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Log in</button>
			</div>
		</form>
		<p class="text-center">
			Need an account?<a href="signup"> Sign Up</a>
		</p>
	</div>
</body>
</html>