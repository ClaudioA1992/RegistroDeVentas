<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Índice</title>
</head>

<body>

	<h1>Bienvenido a menú</h1>

	<a href="/usuario/"+ {userId}>Ver tus registros</a>
	<form:form>
		<select>
			<c:forEach item="{registros.getRegistroId()}" var="reg" name="idRegistro">
				<option value="{reg}">{reg}</option>
			</c:forEach>
		</select>
	</form:form>
	<a href="/editar/" + idRegistro>Editar registro</a>
</body>
</html>