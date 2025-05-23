<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Đánh giá sản phẩm</h2>

<form:form modelAttribute="review" method="post" action="/reviewBai7">
    Tên: <form:input path="name" />
    <form:errors path="name" cssClass="error"/><br/>

    Email: <form:input path="email" />
    <form:errors path="email" cssClass="error"/><br/>

    Đánh giá (1-5 sao): <form:input path="rating" type="number" />
    <form:errors path="rating" cssClass="error"/><br/>

    Bình luận: <form:textarea path="comment" rows="4" cols="40" />
    <form:errors path="comment" cssClass="error"/><br/>
    <button type="submit">Gửi đánh giá</button>
</form:form>
</body>
</html>