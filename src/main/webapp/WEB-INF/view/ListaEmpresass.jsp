<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.henricker.models.Empresa,  java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:import url="logout.jsp"></c:import>
	
	Usu?rio logado: ${ user.login }
	<h1>Empresas cadastradas</h1>
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			<li>
				${ empresa.nome} - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciado/Business?action=RemoveBusiness&id=${empresa.id}"><button>Remover</button></a>
				<a href="/gerenciado/Business?action=ShowBusiness&id=${empresa.id}"><button>Alterar</button></a>		
			</li>
		</c:forEach>
	</ul>
</body>
</html>