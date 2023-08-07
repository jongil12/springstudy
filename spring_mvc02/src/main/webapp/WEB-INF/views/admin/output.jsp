<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Views/admin/output.jsp</h1>
	<c:forEach var="k" items="${dogName}">
		<li>${k}</li>
	</c:forEach>
	<hr>

</body>
</html>