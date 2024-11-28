<%@ page language="java" contentType="text/html; charset=US-ASCII"
       pageEncoding="US-ASCII"%>
       <%@ page isELIgnored="false" %>
       <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
    table {
      font-family: arial, sans-serif;
      border-solid: black;
      width: 100%;
    }

    td, th {
      border: 4px solid #dddddd;
      text-align: center;
      padding: 8px;
    }

    tr:nth-child(even) {
      background-color: #dddddd;
    }
    </style>
</head>
<body>
<table >
<tr>
<th>Sl.No</th>
<th>User First Name</th>
</tr>
<c:forEach   var="dto" items="${ listOfUsers }">
<tr>
<td>${ dto.getId() }</td>
<td>${ dto.getFirstName() }</td>
</tr>
</c:forEach>
</table>
</body>
</html>