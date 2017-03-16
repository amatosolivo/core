<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Citas Medicas | Inicio</title>

<link href="/static/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="/static/css/style.css" rel="stylesheet" type="text/css" />

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">CITAS MEDICAS</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="nuevaPersona">Agregar</a></li>
					<li><a href="todasPersonas">Ver todos</a></li>
				</ul>
			</div>
		</div>
	</div>

	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Bienvenido a las Citas Medicas</h1>
				</div>
			</div>

		</c:when>
		<c:when test="${mode == 'MODE_PERSONAS'}">
			<div class="container text-center" id="personasDiv">
				<h3>Personas</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Ingreso</th>
								<th>Activo</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="persona" items="${personas}">
								<tr>
									<td>${persona.idPersona}</td>
									<td>${persona.nombre}</td>
									<td>${persona.apellido}</td>
									<td><fmt:formatDate pattern="yyyy-MMM-dd HH:mm:ss" value="${persona.registrado}" /></td>
									<td>${persona.activo}</td>
									<td class="text-center"><a href="actualizaPersona?id=${persona.idPersona}"><span class="glyphicon glyphicon-pencil" /></a></td>
									<td class="text-center"><a href="borrarPersona?id=${persona.idPersona}"><span class="glyphicon glyphicon-trash" /></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Mantenimiento Persona</h3>
				<hr>
				<form class="form-horizontal" method="post" action="guardarPersona">
					<input type="hidden" name="idPersona" value="${persona.idPersona}" />
					<div class="form-group">
						<label class="control-label col-md-3">Nombre</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="nombre"
								value="${persona.nombre}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Apellido</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="apellido"
								value="${persona.apellido}" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Activo</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="activo" value="true"
								checked="checked" />
							<div class="col-sm-1">Si</div>
							<input type="radio" class="col-sm-1" name="activo" value="false" />
							<div class="col-sm-1">No</div>
						</div>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Guardar">
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>

	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
</body>
</html>