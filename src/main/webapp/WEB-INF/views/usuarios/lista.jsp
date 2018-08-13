<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Só mina foda</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>E-mail</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${usuarios}" var="usuario">
				<tr>
					<td><c:out value="${usuario.id}" /></td>

					<td><c:out value="${usuario.nome}" /></td>

					<td><c:out value="${usuario.email}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href="<c:url value='/usuarios/form' />">Novo Usuário</a>
</body>
</html>