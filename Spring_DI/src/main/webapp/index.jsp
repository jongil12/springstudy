<%@page import="ex08_web_annotation.MyCalc2"%>
<%@page import="ex07_web_DI.MyCalc"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="ex06_web_DI.HelloImpl"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
		// 자바 main 에서 사용한 내용 그대로 코딩 
		ApplicationContext context =
			new GenericXmlApplicationContext("ex06_web_DI/config.xml");
	 // 컨피스에서 이미 메서드를 만들어서 그안에 실행할것을 불러온다
	 HelloImpl hello = (HelloImpl)context.getBean("hello");
	 String msg =  hello.sayHello();
	 out.println("<h2>" + msg + "</h2>");
	 
	 
	 톰켓이 올라올때 이미 만들어져있기 때문에 생성자에 문제가 있으면 처음부터 안된다.
	--%>
	<!-- 실제 Web용 으로 만들어보자  -->
	<%
	//	config.xml => 환경 설정 파일 
	//	=> Web에서는 /WEB-INF/spring/root-context.xml => application 으로 정해져있다.
	
	WebApplicationContext context =
		WebApplicationContextUtils.getWebApplicationContext(application);
	 HelloImpl hello = (HelloImpl)context.getBean("hello");
	 String msg =  hello.sayHello();
	 out.println("<h2>" + msg + "</h2>");
	 
	 
	 MyCalc mc = (MyCalc)context.getBean("myCalc");
	 int result = mc.plus(10, 20);
	 out.println("<h2> 결과 : 10 + 20 = " + result + "</h2>");
	 pageContext.setAttribute("result", result);
	 
	 mc.minus(20, 10);
	 int result2 = mc.getResult();
	 out.println("<h2> 결과 : 10 + 20 = " + result2 + "</h2>");
	 pageContext.setAttribute("result2", result2);
	 
	 
	 MyCalc2 mc2 = (MyCalc2)context.getBean("myCalc2");
	 int result3 = mc2.mul(10, 20);
	 out.println("<h2> 결과 : 10 * 20 = " + result3 + "</h2>");
	 pageContext.setAttribute("result3", result3);
	 
	%>
	<hr>
	
	<h2>결과 : 10 + 20 = ${result}</h2>
	<h2>결과 : 20 - 10 = ${result2}</h2>
	<h2>결과 : 20 * 10 = ${result3}</h2>
	<!-- el 을 쓰려면 리퀘스트, 컨텍스트, 세션, 어플리케이션 네군대에 저장해야지 쓸수 있다. -->
	
</body>
</html>