<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page import="br.com.henricker.models.Empresa" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:url value="/AlterarEmpresa" var="linkNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Empresa</h1>
	<form action="${linkNovaEmpresa}?id=${empresa.id}" method="post">
		<label for="empresa">Nome</label>
		<input id="empresa" name="nome" value="${ empresa.nome }"/>
		<br/>
		<br/>
		<label for="aberturaData">Data de abertura</label>
		<input id="aberturaData" name="data" type="date" value='<fmt:formatDate value="${ empresa.dataAbertura }" pattern="yyyy-MM-dd"/>'/>
		<button>Enviar</button>
	</form>
</body>
</html>