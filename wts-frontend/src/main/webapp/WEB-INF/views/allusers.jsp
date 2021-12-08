<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>All Users</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<script type="text/javascript"></script>
	<script src="resources/static/app.js"></script>
	<script src="resources/static/js/service/user.service.js"></script>
	<script src="resources/static/js/controller/user.controller.js"></script>

</head>
<body ng-app="myApp">

	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/">Weight Tracking Studio</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>
	<br>
	
	<div ng-controller="UserController as ctrl">
		<div class="tablecontainer">
		<br>
		<h3>List of Users</h3>
    	<table class="table table-bordered">
	    	<thead>
		        <tr>
		        	<td>Id</td>
		            <td>Name</td>
		            <td>Age</td>
		            <td>Email</td>
		            <td colspan="2">Actions</td>
		        </tr>
		    </thead>
		    <tbody>
		    	<tr ng-repeat="u in ctrl.users">
					<td><span ng-bind="u.id"></span></td>
					<td><span ng-bind="u.name"></span></td>
					<td><span ng-bind="u.age"></span></td>
					<td><span ng-bind="u.email"></span></td>
		          	<td>
		          		<button type="button" ng-click="ctrl.edit(u.id)" class="btn btn-primary btn-sm">Edit</button>  
		          		<button type="button" ng-click="ctrl.remove(u.id)" class="btn btn-primary btn-sm">Remove</button>
		          	</td>
	            </tr>
		    </tbody>
   	 	</table>
   	 	</div>
	</div>
</body>
</html>