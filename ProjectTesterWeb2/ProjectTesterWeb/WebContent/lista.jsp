<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="persistence.ClienteDao" />
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
<sx:head />
</head>

<body class="p-3 mb-2 bg-white text-dark">
	<nav class="navbar navbar-dark bg-danger">
		<span class="navbar-brand mb-0 h1">Bradesco Seguros</span>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-item nav-link"
					href="Sistema.jsp">Principal</a> <a class="nav-item nav-link"
					href="customer">Cadastro</a> <a class="nav-item nav-link"
					href="upload.jsp">Upload</a> <a class="nav-item nav-link"
					href="lista">Lista</a> <a class="nav-item nav-link"
					href="Login.jsp">Sair</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="container">
		<br>
		<h1 class="display-4">Lista de Segurados</h1>
		<p>
		<table>
			<s:iterator value="Clientes">
				<li>Id: <s:property value="item" /></li>
				<li>nomeSegurado: <s:property value="nomeSegurado" /></li>
				<li>cpfCnpjSegurado: <s:property value="cpfCnpjSegurado" /></li>
				<li>tipoDocumento: <s:property value="tipoDocumento" /></li>
				<li>dataEmissao: <s:property value="dataEmissao" /></li>
				<li>sucursal: <s:property value="sucursal" /></li>
				<li>placa: <s:property value="placa" /></li>
				<li>ramo: <s:property value="ramo" /></li>
				<li>companhia: <s:property value="companhia" /></li>
				<li>cpdCorretor: <s:property value="cpdCorretor" /></li>
				<li>chassi: <s:property value="item" /></li>
				<li>numeroApolice: <s:property value="numeroApolice" /></li>
				<li>numeroEndosso: <s:property value="numeroEndosso" /></li>
				<li>idarquivo: <s:property value="idarquivo" /></li>
			</s:iterator>
		</table>
		</p>

	</div>
</body>


</html>