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
<body ng-app="myApp" >
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/">Weight Tracking Studio (Trial)</a>
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
	<br>
	
	<div class="signup-form" ng-controller="LogController as ctrl">
	
		<form ng-submit="ctrl.addLog()" name="logForm">
			<h2 class="text-center">Weight Logger</h2>
			
			<input type="hidden" ng-model="ctrl.log.id" />
			<div class="form-group">
				<label for="date">Date</label> 
				<input type="text" ng-model="ctrl.log.date" id="date" class="date form-control input-sm"  placeholder="Enter log date:" required="required">
			</div>
			
			<div class="form-group">
				<label for="weight">Weight</label> 
				<input type="number" ng-model="ctrl.log.weight" id="weight" class="weight form-control input-sm" placeholder="Enter your weight:">
			</div>
			
			<div class="form-group">
				<div class="form-actions floatRight">
					<input type="submit" value="Log" class="btn btn-primary btn-sm">					
				</div>
			</div>
		</form>

		<div>
			<div class="panel-heading"><span class="lead">Logs</span></div>
			<div class="tablecontainer">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>Date</th>
							<th>Weight</th>
							<th width="20%"></th>
						</tr>
					</thead>
					<tbody>
						<tr ng-repeat="u in ctrl.logs">
							<td><span ng-bind="u.id"></span></td>
							<td><span ng-bind="u.date"></span></td>
							<td><span ng-bind="u.weight"></span></td>
						</tr>
					</tbody>
				</table>
			</div>	
		</div>
	</div>
</body>
</html>