<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Đăng ký người dùng</title>
</head>
<body>
<h2>Form Đăng Ký</h2>
<form:form method="post" modelAttribute="userRegister">
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