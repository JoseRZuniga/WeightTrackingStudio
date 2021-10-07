<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
      	<meta name="viewport" content="width=device-width, initial-scale=1">
      	
      	<link rel="stylesheet"
			href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
			integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
			crossorigin="anonymous">
		<link href="<c:url value='resources/static/css/style.css' />" rel="stylesheet"></link>
		
		<style>
		</style>	
<head>
<meta charset="ISO-8859-1">
<title>Log In</title>
</head>
<body>
	<div class="login-form">
	    <form>
	        <h2 class="text-center">Log in</h2>       
	        <div class="form-group">
	            <input type="text" class="form-control" placeholder="Username" required="required">
	        </div>
	        <div class="form-group">
	            <input type="password" class="form-control" placeholder="Password" required="required">
	        </div>
	        <div class="form-group">
	            <button type="submit" class="btn btn-primary btn-block">Log in</button>
	        </div>    
	    </form>
	   	<p class="text-center">Need an account?<a href="signup"> Sign Up</a></p>	    
	</div>
</body>
</html>