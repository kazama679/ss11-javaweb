<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Form Người Dùng</title>
</head>
<body>
<h2>Nhập Thông Tin Người Dùng</h2>
<form:form modelAttribute="user" method="post">
    Name: <form:input path="name" />
    <form:errors path="name" /><br/>

    Email: <form:input path="email" />
    <form:errors path="email" /><br/>

    Phone: <form:input path="phone" />
    <form:errors path="phone" /><br/>

    Password: <form:password path="password" />
    <form:errors path="password" /><br/>

    Status: <form:checkbox path="status" /> Active<br/>

    <input type="submit" value="Submit" />
</form:form>
</body>
</html>