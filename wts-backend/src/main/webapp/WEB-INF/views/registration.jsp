<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


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
 
    <h2>Registration Form</h2>
  
    <form:form action="save" method="post" modelAttribute="userForm">
        <form:hidden path="id"/>
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/></td>
            </tr>
            
            <tr>
                <td>Age:</td>
                <td><form:input path="age"/></td>
            </tr>
            
            <tr>
                <td>Email:</td>
                <td><form:input path="email"/></td>
            </tr>
     
            <tr>
            	<td></td>
            	<td><button type="Submit">Save</button></td>
            </tr>
        </table>
    </form:form>
    <a href="<c:url value='/list' />">List of All Users</a>
</body>
</html>