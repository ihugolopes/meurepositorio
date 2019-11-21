<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.10/css/all.css">
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.3.1.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitterbootstrap/4.1.1/css/bootstrap.css">
<script type="text/javascript"
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/boots trap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1 .4.1/jquery.maskedinput.js"></script>
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

		<div class="card-header p-3 mb-2 bg-dark text-white">FORMULÁRIO DE CADASTRO DE VEÍCULOS</div>

		<form method="post" action="ControllerCarro" name="ControllerCarro">
			<br>
			<div class="form-group">
				<label for="nome">Modelo</label> <input type="text" name="modelo"
					id="rg" title="Entre com o modelo do veículo"
					placeholder="Digite o modelo" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Cor</label> <input type="text" name="cor" id="cpf"
					title="Entre com a cor do veículo" placeholder="Digite a cor"
					class="form-control" />
			</div>
			<div class="form-group">
				<label for="nome">Ano</label> <input type="text" name="ano" id="ano"
					title="Entre como ano do veículo"
					placeholder="Digite o ano do veículo" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Chassi</label> <input type="text" name="chassi"
					id="chassi" title="Entre com o nº do chassi"
					placeholder="Digite o nº do chassi" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Nome da marca</label> <input type="text"
					name="nomedamarca" id="nomedamarca"
					title="Entre com o nome da marca"
					placeholder="Digite o nome da marca" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Velocidade máxima do veículo</label> <input
					type="text" name="velocidademax" id="velocidademax"
					title="Entre com a elocidade máxima do veículo"
					placeholder="Digite a velocidade máxima do veículo"
					class="form-control" />
			</div>


			<div class="form-group">
				<label for="nome">Número de marchas</label> <input type="text"
					name="nrmarchas" id="nrmarchas"
					title="Entre com o número de marchas"
					placeholder="Digite o número de marchas" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Número de portas</label> <input type="text"
					name="nport" id="nport" title="Entre com o número de portas"
					placeholder="Digite o número de portas" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Quantidade de combustível em Litros</label> <input
					type="text" name="volumedecombustivel" id="volumedecombustivel"
					title="Entre com a quantidade de combustível em Litros"
					placeholder="Digite a quantidade de combustível em Litros"
					class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Tem câmbio automático?</label> <br> <input
					type="radio" name="cambioautomatico" id="cambioautomatico"
					value="true">Sim<br> <input type="radio"
					name="cambioautomatico" id="cambioautomatico" value="false">Não<br>

			</div>

			<div class="form-group">
				<label for="nome">Tem teto solar?</label> <br> <input
					type="radio" name="tetosolar" id="tetosolar" value="true">Sim<br>
				<input type="radio" name="tetosolar" id="tetosolar" value="false">Não<br>
				<br>
			</div>

			<br>
			<button type="submit" class="btn btn-danger">Enviar os Dados</button>
		</form>

		<br>
		<div class="card-footer btn btn-primary">${msg}</div>
	</div>
</body>
</html>
