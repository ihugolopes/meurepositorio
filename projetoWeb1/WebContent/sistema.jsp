<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-
8">
<title>Sistema</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/boo
tstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T
"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/fontawesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-
q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo
"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd
/popper.min.js"
	integrity="sha384-
UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1
"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/boots
trap.min.js"
	integrity="sha384-
JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM
"
	crossorigin="anonymous"></script>
</head>
<body>
	<h2 class="text-center bg-dark text-white p-3">
		<i class="fa fa-cogs fa-spin"></i> Sistema Filtro e Pattern <i
			class="fa fa-cog fa-spin"></i>
	</h2>
	<div class="container-fluid pt-3">
		<div class="col-md-6 offset-md-3">
			<div class="card shadow border-dark">
				<div class="card-header bg-secondary text-white text-center">
					Formulário de Cadastro</div>
				<div class="card-body">
					<form method="post" action="ControllerUsuario" class="form">
						<label for="nome">Nome:</label> <input type="text" name="nome"
							id="nome" pattern="[a-z A-Z]{2,50}" title="Entre com nome"
							class="form-control" placeholder="Digite o nome"
							required="required" /> <label for="email">Email:</label> <input
							type="email" name="email" id="email" title="Entre com email"
							class="form-control" placeholder="Digite o email"
							required="required" /> <label for="senha">Senha:</label> <input
							type="password" name="senha" id="senha"
							pattern="[a-zA-Z0-9]{3,50}" title="Entre com Senha"
							class="form-control" placeholder="Digite a senha"
							required="required" /> <input type="hidden" name="token"
							value="a13b21" />
						<button class="btn btn-outline-dark mt-2 btn-sm"
							title="clique para enviar">Enviar os Dados</button>
					</form>
				</div>
				<div class="card-footer">Mensagem: ${msg}</div>
			</div>
		</div>
	</div>
</body>
</html>