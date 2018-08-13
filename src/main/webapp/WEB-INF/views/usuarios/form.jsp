<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Nova mina foda</title>
</head>
<body>
	<form method="post" action="<c:url value='/usuarios' />">
		<p for="nome">
			Nome: 
			<input id="nome" name="nome" required="required" value="${usuario.nome}">
		</p> 
		
		<p for="email">
			E-mail
			<input id="email" name="email" required="required" value="${usuario.email}">
		</p> 
		
		<input type="submit" value="Gravar">
		<a href="<c:url value='/usuarios' />">Cancelar</a>
	</form>
</body>
</html>