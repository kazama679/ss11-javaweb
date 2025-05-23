<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng ký Bai3</title>
</head>
<body>
<h2>Form Đăng Ký Bai3</h2>
<form:form modelAttribute="userRegisterBai3" method="post">
    Tên: <form:input path="name" />
    <form:errors path="name" cssClass="error" /><br/>

    Email: <form:input path="email" />
    <form:errors path="email" cssClass="error" /><br/>

    Mật khẩu: <form:password path="password" />
    <form:errors path="password" cssClass="error" /><br/>

    <input type="submit" value="Đăng ký" />
</form:form>
</body>
</html>