<%--
  Created by IntelliJ IDEA.
  User: eganp
  Date: 5/13/2025
  Time: 1:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- toàn bộ tính năng phải bắt đầu từ prefix --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/Style.css">
</head>
<body>
<h1>Home Page</h1>
<c:forEach items="${response}" var="production">  <%-- item là attribute của httpRequest hoặc httpResponse , và var là đại diện cho từng phần tử trong list của attribute --%>
    <div class="production-card">
        <h2>${production.title}</h2>
        <p><strong>Description:</strong> ${production.description}</p>
        <p><strong>Author:</strong> ${production.author}</p>
        <p><strong>Price:</strong> ${production.price}</p>
    </div>
</c:forEach>
</body>
</html>