<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 19/05/2025
  Time: 4:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Movie Form</h3>
<form:form action="movie-save" method="post">
    <label for="title">Title:</label>
    <input type="text" id="title" name="title" required><br>
    <br>
    <label for="title">Email:</label>
    <input type="email" id="title" name="title" required>
    <br>
    <label for="title">Quantity:</label>
    <input type="number" id="title" name="title" required>
    <br>
    <label for="title">Birthday:</label>
    <input type="date" id="title" name="title" required>
    <br>
    <label for="title">Event Date:</label>
    <input type="datetime-local" id="title" name="title" required>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
