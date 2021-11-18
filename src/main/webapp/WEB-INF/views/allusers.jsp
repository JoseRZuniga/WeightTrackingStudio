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
	<h2>List of Users</h2>
	<div>
		<div class="tablecontainer">
    	<table class="table table-borderless">
	    	<thead>
		        <tr>
		        	<td>Id</td>
		            <td>Name</td>
		            <td>Age</td>
		            <td>Email</td>
		            <td colspan="2">Action</td>
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
		          		<a href="update-${list.id}">Update</a>
		          	</td>
		          	<td>
		          		<a href="delete-${list.id}">Delete</a>
		          	</td>
	            </tr>
	        	</c:forEach>
		    </tbody>
   	 	</table>
   	 	</div>
	</div>
    <a href="add">Add New User</a>
</body>
</html>