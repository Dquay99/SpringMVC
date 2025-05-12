<%--
  Created by IntelliJ IDEA.
  User: eganp
  Date: 5/13/2025
  Time: 1:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> // toàn bộ tính năng phải bắt đầu từ prefix

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Home Page</h1>
<c:forEach items="${allProduction}" var="production"> // item là attribute của httpRequest hoặc httpResponse , và var là đại diện cho từng phần tử trong list của attribute
    <h1>${production.title}</h1>
    <p>${production.description}</p>
    <p>${production.author}</p>
    <p>${production.price}</p>
</c:forEach>
</body>
</html>