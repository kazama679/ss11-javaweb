<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 23/05/2025
  Time: 10:58 SA
  To change this template use File | Settings | File Templates.
--%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Category List</h2>
<a href="${pageContext.request.contextPath}/categories/add">Add New</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Category Name</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="category" items="${categories}">
        <tr>
            <td>${category.id}</td>
            <td>${category.categoryName}</td>
            <td>${category.status ? 'Active' : 'Inactive'}</td>
            <td>
                <a href="${pageContext.request.contextPath}/categories/edit/${category.id}">Edit</a>
                |
                <a href="${pageContext.request.contextPath}/categories/delete/${category.id}" onclick="return confirm('Are you sure?')">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
