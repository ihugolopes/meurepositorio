<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>


	<nav class="navbar navbar-dark bg-primary">
		<span class="navbar-brand mb-0 h1">CAR X | TESTE DE PERFORMANCE</span>
	</nav>

	<div class="container">
		<br><h3>BEM VINDO | LOGIN</h3><br>
		<form method="post" action="ControllerLogando" name="form1">
			<div class="form-group">
				<label for="exampleInputEmail1">Email:</label> <input required type="email" class="form-control" name="email" id="email" title="Entre com o Email" aria-describedby="emailHelp" placeholder="Digite o email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1">Senha</label> 
				<input required type="password" class="form-control" id="senha" name="senha" title="Entre com o Senha" placeholder="Digite a senha"> 
				<small id="senha" class="form-text text-muted">Nunca compartilhe sua senha com terceiros.</small>
			</div>
			<div class="form-group form-check">
				<input required type="checkbox" class="form-check-input" id="exampleCheck1"> <label class="form-check-label" for="exampleCheck1">Confirmar dados</label>
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form>

		<br> <br> ${msg} <br> <br>
	</div>
</body>
</html>