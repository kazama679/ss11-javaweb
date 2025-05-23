<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="user" action="/registerBai6" method="post">
    Tên: <form:input path="name" />
    <form:errors path="name" cssClass="error"/><br/>

    Số điện thoại: <form:input path="phone" />
    <form:errors path="phone" cssClass="error"/><br/>

    <button type="submit">Đăng ký</button>
</form:form>
</body>
</html>