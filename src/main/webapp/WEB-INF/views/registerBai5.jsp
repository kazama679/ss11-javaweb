<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Form Đăng Ký Bai5</h2>
<form:form modelAttribute="userRegisterBai5" method="post">
    Tên: <form:input path="name" />
    <form:errors path="name" cssClass="error"/><br/>

    Email: <form:input path="email" />
    <form:errors path="email" cssClass="error"/><br/>

    Vai trò:
    <form:select path="role">
        <form:option value="user" label="Người dùng thường" />
        <form:option value="admin" label="Quản trị viên" />
    </form:select>
    <form:errors path="role" cssClass="error"/><br/>

    Mã Admin (chỉ yêu cầu nếu chọn Admin):
    <form:input path="adminCode" />
    <form:errors path="adminCode" cssClass="error"/><br/>

    <input type="submit" value="Đăng ký"/>
</form:form>
</body>
</html>
