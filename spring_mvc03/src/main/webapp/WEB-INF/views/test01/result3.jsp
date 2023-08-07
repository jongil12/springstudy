<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과보기</h2>
	<h2>
	<li>올린사람 : ${name}</li>
	<li>파일원본이름 : ${f_name}</li>
	<li>파일저장이름 : ${f_name2}</li>
	<li>파일타입 ${file_type}</li>
	<li>파일크기 : ${size}</li>
	<li>마지막수정날짜 : ${lastday}</li>
	<li><img src="resources/images/${f_name2}" style="width: 150px;"></li>
	
	</h2>
</body>
</html>