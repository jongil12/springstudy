<%@page import="ex09_db.VO"%>
<%@page import="java.util.List"%>
<%@page import="ex09_db.DAO"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 리스트를 불러와야해서 라이브러리가 필요하다 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 자바랑 html 이랑 따로구분해놨다 -->
<%
		WebApplicationContext context =
		WebApplicationContextUtils.getWebApplicationContext(application);
		DAO dao = (DAO)context.getBean("dao"); // root context 에서 dao 를꺼내온다
		List<VO> list = dao.getList();
		pageContext.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{width: 800px; border-collapse: collapse; text-align: center;}
	table, th, td{border: 1px solid red; padding: 3px}
</style>
</head>
<body>
	<h2>회원정보</h2>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>아이디</th><th>패스워드</th><th>이름</th><th>나이</th><th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty list}">
					<tr><td colspan="6""><h2>자료가 존재하지 안습니다.</h2></td></tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="k" items="${list}">
					<tr>
						<td>${k.m_idx}</td>
						<td>${k.m_id}</td>
						<td>${k.m_pw}</td>
						<td>${k.m_name}</td>
						<td>${k.m_age}</td>
						<td>${k.m_reg.substring(0,10)}</td>
					</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</body>
</html>