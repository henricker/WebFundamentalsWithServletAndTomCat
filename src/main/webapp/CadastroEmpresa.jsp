<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/NovaEmpresa" var="linkNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro de empresas</h1>
	<form action="${linkNovaEmpresa}" method="post">
		<label for="empresa">Nome</label>
		<input id="empresa" name="nome"/>
		<br/>
		<br/>
		<label for="aberturaData">Data de abertura</label>
		<input id="aberturaData" name="data" type="date"/>
		<button>Enviar</button>
	</form>
</body>
</html>