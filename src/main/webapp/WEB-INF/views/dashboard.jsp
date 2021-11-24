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
	<script src="resources/static/js/service/log.service.js"></script>
	<script src="resources/static/js/controller/log.controller.js"></script>
	
	<title>Dashboard</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
</head>
<body>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/">Weight Tracking Studio</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link" href="/dashboard">Dashboard
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="settings">Settings</a></li>
					<li class="nav-item"><a class="nav-link" href="/">Log Out</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<header class="jumbotron jumbotron-fluid">
		<div class="container-fluid text-center">
			
			<p class="lead pb-4">
				Some of our services.
			</p>
			<p>
				<a href="logger" class="btn btn-primary btn-lg" role="button">Go to Logger</a>
				<a href="list" class="btn btn-primary btn-lg" role="button">Go to List of all Users</a>
			</p>
		</div>
	</header>
	
</body>
</html>