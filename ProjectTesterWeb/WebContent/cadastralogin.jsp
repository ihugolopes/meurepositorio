<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
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
		<span class="navbar-brand mb-0 h1">CAR X | TESTE DE PERFORMANCE
		</span>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-item nav-link"
					href="home.jsp">Home</a> <a class="nav-item nav-link"
					href="sistema.jsp">Cadastrar Cliente</a> <a
					class="nav-item nav-link" href="veiculo.jsp">Cadastrar Veículo</a>
					<a class="nav-item nav-link" href="cadastralogin.jsp">Cadastrar
						Novo Login</a>
						<a class="nav-item nav-link" href="login.jsp">Sair</a>
						
		</div>
	</nav>

	<div class="container">
		<br>
		<h3>CADASTRO DE LOGIN</h3>
		<br>
	</div>
	<div class="container">
		<form method="post" action="ControllerCadastro"
			name="ControllerCadastro">

			<div class="form-group">
				<label for="nome">ID</label> <input type="text" name="id" id="id"
					required title="Entre com o id" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Nome</label> <input type="text" name="nome"
					id="nome" required title="Entre com o Nome"
					pattern="[a-z A-Z]{2,50}" class="form-control" />
			</div>

			<div class="form-group">
				<label for="email">Email</label> <input type="email" name="email"
					id="email" required title="Entre com o email" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Senha</label> <input type="password" name="senha"
					id="senha" required title="Entre com a senha" class="form-control" />
			</div>
			<input type="hidden" name="token" value="a13b21" /> <br> <br />
			<br />
			<button type="submit" class="btn btn-danger">Cadastrar</button>

		</form>
		<br /> ${msg}
	</div>
</body>
</html>
