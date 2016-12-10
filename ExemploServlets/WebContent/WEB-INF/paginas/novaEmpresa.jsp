<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova Empresa</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
	type="text/javascript"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
	type="text/javascript"></script>

</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<a class="navbar-brand" href="#">@Dextraining - Java Web</a>

			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
		</div>
		</div>
	</nav>
	<br/>
	
	<hr>
	</hr>
	
	
	<div class="alert alert-success">
		<strong>Empresa: ${empresa}</strong> Adicionada com Sucesso!
	</div>
	<br/>
	<div class="alert alert-success">
		<form action="/ExemploServlets/index.html">
			<br/>
			<hr>
			<input type="submit" class="btn btn-danger" value="OK!">
		</form>
	</div>
</body>
</html>