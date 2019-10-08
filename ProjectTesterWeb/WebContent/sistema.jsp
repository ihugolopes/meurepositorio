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
		<span class="navbar-brand mb-0 h1">CAR X | TESTE DE PERFORMANCE</span>
		
		<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-item nav-link" href="home.jsp">Home</a> 
					<a class="nav-item nav-link" href="sistema.jsp">Cadastrar Cliente</a> 
					<a class="nav-item nav-link" href="veiculo.jsp">Cadastrar Veículo</a>
					<a class="nav-item nav-link" href="cadastralogin.jsp">Cadastrar Novo Login</a>
					<a class="nav-item nav-link" href="login.jsp">Sair</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="container">


		<br>
		<div class="card-header p-3 mb-2 bg-dark text-white">FORMULÁRIO DE CADASTRO</div>
		<form method="post" action="ControllerTeste" name="ControllerTeste">
			<br>
			<div class="form-group">
				<label for="nome">Nome</label> 
				<input type="text" required name="nome" id="nome" title="Entre com o Nome" placeholder="Digite o Nome" class="form-control" pattern="[a-z A-Z Ã-Ç àü]{2,50}" />
			</div>
			
			<div class="form-group">
				<label for="cpf">Email</label> 
				<input type="email" required name="email" id="email" title="Entre com o email" placeholder="Digite o email" class="form-control" />
			</div>
			
			<div class="form-group">
				<label for="cpf">CPF (11 Dígitos)</label> 
				<input type="text" required name="cpf" id="cpf" title="Entre com o Cpf" placeholder="Digite o Cpf (11 Dígitos)" class="form-control" pattern="[0-9]{11}"  />
			</div>

			<div class="form-group">
				<label for="rg">RG (9 Dígitos)</label> 
				<input type="text" required name="rg" id="rg" title="Entre com o rg" placeholder="Digite o rg (9 Dígitos)" class="form-control" pattern="[0-9]{9}"  />
			</div>

			<div class="form-group">
				<label for="nome">Data de Nascimento (ex: 01/01/2019)</label> 
				<input required type="text" name="dataNascimento" id="dataNascimento" title="Entre com a Data de Nascimento" placeholder="Digite a Data de Nascimento" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Rua</label> 
				<input required  type="text" name="rua" id="rua" title="Entre com a rua" placeholder="Digite a rua" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Complemento</label> 
				<input required  type="text" name="complemento" id="complemento" title="Entre com o complemento" placeholder="Digite o complemento" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Bairro</label> 
				<input required  type="text" name="bairro" id="bairro" title="Entre com o bairro" placeholder="Digite o bairro" class="form-control" />
			</div>

			<div class="form-group">
				<label  for="nome">Cidade</label> 
				<input required  type="text" name="cidade" id="cidade" title="Entre com a cidade" placeholder="Digite a cidade" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">Estado</label> 
				<input required  type="text" name="estado" id="estado" title="Entre com o estado" placeholder="Digite o estado" class="form-control" />
			</div>

			<div class="form-group">
				<label for="nome">CEP</label> 
				<input required  type="text" required name="cep" id="cep" title="Entre com o cep" placeholder="Digite o cep" class="form-control" />
			</div>

			<input type="hidden" name="token" value="a13b21" /> <br>

			<button type="submit" class="btn btn-danger">Enviar os Dados</button>
		</form>

		<br>
		<div class="card-footer btn btn-primary">${msg}</div>

	</div>
</body>
</html>
