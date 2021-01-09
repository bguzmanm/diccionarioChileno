<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Diccionario de Palabras chilenizadas</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Lista de palabras en BD</h1>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Menú</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="Inicio">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="crearPalabra">Nueva Palabra</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Palabra</th>
					<th scope="col">Significado</th>
					<th scope="col">Referencia</th>
					<th scope="col">Acción</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${palabras}">
					<tr>
						<td><c:out value="${p.getId()}"></c:out></td>
						<td><c:out value="${p.getNombre()}"></c:out></td>
						<td><c:out value="${p.getSignificado()}"></c:out></td>
						<td><c:out value="${p.getReferencia()}"></c:out></td>
						<td><a href="EditPalabra?id=${p.getId()}">Editar</a> | <a href="deletePalabra?id=${p.getId()}">Borrar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>