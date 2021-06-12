<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:url value="/Business" var="linkLogin"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="${ linkLogin }?action=Login" method="post">
	Login<br/>
	<input type="text" name="login"/><br/>
	Password<br/>
	<input type="password" name="password"/><br/>
	<button>Login</button>
</form>
</body>
</html>