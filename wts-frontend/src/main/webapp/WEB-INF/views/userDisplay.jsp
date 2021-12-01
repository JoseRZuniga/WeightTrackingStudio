<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	
	<title>New User Display</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
</head>
<body>
	
	<div>
		<form>
			<p><strong>New User Created</strong></p>
			<p>Name: ${submittedUser.name}</p>
			<p>Age: ${submittedUser.age}</p>
			<p>Email: ${submittedUser.email}</p>
			<a href="dashboard" role="button">Go to Dashboard</a>
			
		</form>
	</div>
</body>
</html>