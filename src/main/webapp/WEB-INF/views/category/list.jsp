<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 23/05/2025
  Time: 11:01 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh mục sản phẩm</h2>
<a href="${pageContext.request.contextPath}/categories/add">Thêm mới</a>
<table border="1" cellpadding="5" cellspacing="0">
  <thead>
  <tr><th>ID</th><th>Tên danh mục</th><th>Trạng thái</th><th>Hành động</th></tr>
  </thead>
  <tbody>
  <c:forEach var="cat" items="${categories}">
    <tr>
      <td>${cat.id}</td>
      <td>${cat.categoryName}</td>
      <td><c:choose>
        <c:when test="${cat.status}">Hoạt động</c:when>
        <c:otherwise>Không hoạt động</c:otherwise>
      </c:choose></td>
      <td>
        <a href="${pageContext.request.contextPath}/categories/edit/${cat.id}">Sửa</a> |
        <a href="${pageContext.request.contextPath}/categories/delete/${cat.id}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
