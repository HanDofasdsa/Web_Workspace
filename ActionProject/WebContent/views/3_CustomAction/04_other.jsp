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
	<h3>c:import</h3>
	<p>
		페이지에서 다른 페이지를 불러오는 기능<br>
		var : 페이지를 저장하는 변수명<br>
		url : 불러올 페이지의 위치<br>
	</p>
	
	<c:import var="header" url="https://www.google.com"/>
	
	<%-- ${header } --%>
	<%-- <c:out value="${header }" escapeXml="false"/> --%>
	<h3>c:redirect태그 이용하기</h3>
	<%-- <c:redirect url="https://search.naver.com/search.naver">
		<c:param name="query">코로나</c:param>
	</c:redirect> --%>
	
	<h4>c:catch 태그 이용해보기</h4>
	<%
		String test = null;
		request.setAttribute("test", null);
	%>
	<c:catch var="e">
		<%= test.charAt(0) %>
	</c:catch>
	
	${e }
	
	<jsp:useBean id="p" class="com.kh.model.vo.Person" scope="request"/>
	
	<jsp:setProperty name="p" property="name" value="민"/><br>
	<jsp:setProperty name="p" property="gender" value="남" /><br>
	<jsp:setProperty name="p" property="job" value="요" /><br>
	
	이름 : <jsp:getProperty property="name" name="p"/><br>
	성별 : <jsp:getProperty property="gender" name="p"/><br>
	직업 : ${p.job }<br>
</body>
</html>