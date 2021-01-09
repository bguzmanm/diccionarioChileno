<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edición Palabra</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Crear nueva palabra</h1>
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
						<li class="nav-item">
							<a class="nav-link" aria-current="page" href="Inicio">Home</a></li>
						<li class="nav-item">
							<a class="nav-link active" href="crearPalabra">Nueva Palabra</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
		<form action="crearPalabra" method="POST">
			<div class="mb-3">
				<label for="id" class="form-label">ID</label> 
				<input type="number" class="form-control" id="id" name="id" placeholder="101">
			</div>
			<div class="mb-3">
				<label for="nombre" class="form-label">Palabra</label> 
				<input type="text" class="form-control" id="nombre" name="nombre" placeholder="chipamogli">
			</div>
			<div class="mb-3">
				<label for="significado" class="form-label">Significado</label> 
				<input type="text" class="form-control" id="significado" name="significado" placeholder="cabro chico flaite">
			</div>
			<div class="mb-3">
				<label for="referencia" class="form-label">Referencia</label> 
				<input type="text" class="form-control" id="referencia" name="referencia" placeholder="que pasa chipamogli">
			</div>
			
			 <div class="col-12">
    			<button type="submit" class="btn btn-primary">Guardar</button>
  			</div>
		</form>
	</div>
</body>
</html>