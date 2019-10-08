<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- %@	page import="java.util, entity.Proprietario ,persistence.ProprietarioDao"%-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car X | Lista de Proprietários</title>
<%@	page import="java.util.*, entity.Proprietario.* ,persistence.ProprietarioDao.*"%>
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
						Novo Login</a> <a class="nav-item nav-link" href="login.jsp">Sair</a>
				</li>
			</ul>
		</div>
	</nav>

	<br>

	<div class="container">

	<table>
		<%
			ProprietarioDao ProprietarioDao = new ProprietarioDao();
			List<Proprietario> proprietarios = ProprietarioDao.findAll();
			for (Proprietario proprietario : proprietarios) {
		%>
		<tr>
			<td><%=proprietario.getNome()%></td>
			<td><%=proprietario.getEmail()%></td>
			<td><%=proprietario.getCpf()%></td>
			<td><%=proprietario.getRg()%></td>
			<td><%=proprietario.getDataNascimento()%></td>
		</tr>
		<%
			}
		%>
	</table>

	</div>
</body>
</html>