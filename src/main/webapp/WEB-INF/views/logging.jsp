<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Weight Logging</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
<body>
	<h2 class="text-center">Submitted Log Information</h2>
	<table class="login-form">
		<tr>
			<td>Submitted Date:</td>
			<td>
				<p>${submittedWeight.date}</p>
			</td>
		</tr>
		<tr>
			<td>Submitted Weight:</td>
			<td>
				<p>${submittedWeight.weight}</p>
			</td>
		</tr>
	</table>
</body>
</html>