<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>

<title>Updating User</title>
</head>
<body>
 	<p><a href="/">Return to Homepage</a></p> 
 
  	<div class="user-form">
  		<form:form action="update" method="post" modelAttribute="userForm">
	        <h2 class="text-center">Update Form</h2>
	        <form:hidden path="id"/>
	        
	        	<div class="form-group">
					<label>Name:</label>
					<form:input path="name" class="form-control" required="required"
					placeholder="Please input your full name:"/>
				</div>
				
				<div class="form-group">
					<label>Age:</label>
					<form:input path="age" class="form-control" 
					placeholder="Please input your age:"/>
				</div>
				
				<div class="form-group">
					<label>Email: </label>
					<form:input path="email" class="form-control" required="required"
						placeholder="Please input your email:"/>
				</div>
				
				<div class="form-group">
					<div class="form-actions floatRight">
						<input type="submit" value="Update" class="btn btn-primary btn-sm">
					</div>
				</div>
	    </form:form>
  	</div>
</body>
</html>