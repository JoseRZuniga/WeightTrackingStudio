<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

<title>All Users</title>
</head>
<body>
    <h2>List of Users</h2>  
    <table>
        <tr>
            <td>Name</td>
            <td>Age</td>
            <td>Email</td><td></td>
        </tr>
        <c:forEach items="${list}" var="list">
            <tr>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>${list.email}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="registration">Add New User</a>
</body>
</html>