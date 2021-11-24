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

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/">Weight Tracking Studio</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
	</nav>
	<br>
	
	<div>
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
		    	<c:forEach items="${list}" var="list">
	            <tr>
		            <td>${list.id}</td>
		            <td>${list.name}</td>
		            <td>${list.age}</td>
		            <td>${list.email}</td>
		          	<td>
		          		<a href="update-${list.id}">Edit</a>
		          	</td>
		          	<td>
		          		<a href="delete-${list.id}" >Delete</a>
		          	</td>
	            </tr>
	        	</c:forEach>
		    </tbody>
   	 	</table>
   	 	</div>
	</div>
    <a href="add" class="btn btn-primary btn-lg" role="button">Add New User</a>
    
</body>
</html>