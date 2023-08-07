<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 결과보기 </h2>
	<h2>
	<li>올린사람 : ${name}</li>
	<li>파일이름 : ${f_name} </li>
	<li>파일타입 : ${f_type}</li>
	<li>파일크기 : ${size }</li>
	<li> 
		<a href="/down.do?f_name=${f_name}">
		<img src="resources/images/${f_name}"  style="width: 150px;">
	</a>
	</li>
	</h2>
</body>
</html>