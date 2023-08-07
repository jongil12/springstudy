<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function f_up(f) {
		f.submit();
	}
</script>
</head>
<body>
	<h1>결과보기</h1>
	<h2>메세지 : ${msg}</h2>
	<hr>
	
	<form action="/calc.do" method="post">
	<p>수1 : <input type="number" size="15" name="s1" required></p>
        <p>수2 : <input type="number" size="15" name="s2" required></p>
        <p>연산자 :
            <input type="radio" name="op" value="+" checked > + 
            <input type="radio" name="op" value="-"  > - 
            <input type="radio" name="op" value=""  > 
            <input type="radio" name="op" value="/"  > / 
        </p> 
        <p> 취미 : 
             <input type="checkbox" name="hobby" value="축구"> 축구
             <input type="checkbox" name="hobby" value="야구"> 야구
             <input type="checkbox" name="hobby" value="농구"> 농구
             <input type="checkbox" name="hobby" value="배구"> 배구
        </p>
        <input type="hidden" name="cPage" value="2">
        <input type="submit" value="결과보기">
	</form>
	<hr>
	
	<h2>이미지 보기</h2>
	
	<img src="/resources/images/java1.png" style="width: 100px;"><br>
	권장사항 : <img src="resources/images/java1.png" style="width: 100px;"><br>	
	<img src='<c:url value="/resources/images/java1.png"/>' style="width: 100px;"><br>
	권장사항 : <img src='<c:url value="resources/images/java1.png"/>' style="width: 100px;"><br>
	
	<hr>
	<%-- 이미지 업로드 : cos 라이브러리 사용, (MultipartRequest), spring 자체 지원 --%>
	<form action="/f_up.do" method="post" enctype="multipart/form-data">
		<p>올린사람 : <input type="text" name="name"></p>
		<p>파일 : <input type="file" name="f_name"></p>
		<p><input type="submit" value="업로드"></p>		
	</form>
	
	<form action="/f_up2.do"  method="post" enctype="multipart/form-data">
		<p>올린사람 : <input type="text" name="name"></p>
		<p>파일 : <input type="file" name="f_name"></p>
		<p><input type="button" value="업로드" onclick="f_up(this.form)"></p>		
	</form>
	
</body>
</html>