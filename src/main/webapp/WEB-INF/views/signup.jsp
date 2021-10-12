<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>

<title>Create Account</title>
<style>
</style>
</head>
<body>
	<p><a href="/">Return to Homepage</a></p> 
	<div class="signup-form">
		<form action="dashboard">
			<h2 class="text-center">Sign Up</h2>
			<div class="form-group">
				<label>Name</label> <input type="text" class="form-control"
					placeholder="Enter your full name" required="required">
			</div>
			<div class="form-group">
				<label>Age (Optional)</label> <input type="text"
					class="form-control" placeholder="Enter your age">
			</div>
			<div class="form-group">
				<label>Email Address</label> <input type="email"
					class="form-control" placeholder="Enter your email address"
					required="required">
			</div>
			<div class="form-group">
				<label>Password</label> <input type="password" class="form-control"
					placeholder="Enter a password" required="required">
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-primary btn-block">Submit</button>
			</div>
		</form>
		<p class="text-center">
			Have an account?<a href="login"> Log In</a>
		</p>
	</div>
</body>
	<script>
	setTimeout(() => {
		alert("Please fill in the form. If no longer active in the next 5 minutes, you will be return to home page.");
		}, 10000);
	
	const btn = document.querySelector('button');
    btn.addEventListener('click', () => {
      alert('You have created an account!');
    });
	</script>
</html>