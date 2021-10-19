<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Logged Weight</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
<body>
	<h2 class="text-light">Submitted Review Information</h2>
	<table class="login-form">
		<tr>
			<td>LoggedBody</td>
			<td>
				<p>${submittedWeight.date}</p>
			</td>
		</tr>
		<tr>
			<td>Author</td>
			<td>
				<p>${submittedWeight.weight}</p>
			</td>
		</tr>
	</table>
</body>
</html>