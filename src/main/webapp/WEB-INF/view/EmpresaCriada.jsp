<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout.jsp"></c:import>
	
	<c:if test="${ not empty empresa }">
		<h1>${ empresa } criada com sucesso!</h1>
	</c:if>
	<c:if test="${ empty empresa }">
		<marquee> Erro seu arrombado! </marquee>
	</c:if>

</body>
</html>