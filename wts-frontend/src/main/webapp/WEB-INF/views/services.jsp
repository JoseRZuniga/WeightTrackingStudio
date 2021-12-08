<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>Services</title>
<style>
	body {
		padding-top: 56px;
	}
</style>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="#">Weight Tracking Studio</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
					<li class="nav-item active"><a class="nav-link"
						href="services">Services <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item"><a class="nav-link" href="contact">Contact</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	
	<p>
		<a href="dashboard" role="button">Go to Dashboard</a>
	</p>
	<p>
		<a href="allusers" role="button">Go to List of all Users</a>
	</p>
</body>
</html>