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
 
    <h2>Registration Form</h2>
  
    <form method="POST" modelAttribute="user">
        <input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="name">Name: </label> </td>
                <td><input path="name" id="name"/></td>
            </tr>
            
            <tr>
                <td><label for="age">Age: </label> </td>
                <td><input path="age" id="age"/></td>
            </tr>
            
            <tr>
                <td><label for="email">Email: </label> </td>
                <td><input path="email" id="email"/></td>
            </tr>
     
            <tr>
                <td colspan="3">
                    <c:choose>
                        <c:when test="${edit}">
                            <input type="submit" value="Update"/>
                        </c:when>
                        <c:otherwise>
                            <input type="submit" value="Register"/>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </table>
    </form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/list' />">List of All Users</a>
</body>
</html>