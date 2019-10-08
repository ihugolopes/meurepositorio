<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
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
<body class="p-3 mb-2 bg-dark text-white">
	
	<nav class="navbar navbar-dark bg-primary"> <span
		class="navbar-brand mb-0 h1">Project | Struts 2 </span>

	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
				<a class="nav-item nav-link" href="Sistema.jsp">Principal</a> 
				<a class="nav-item nav-link"  href="customer">Cadastro</a>
				<a class="nav-item nav-link"  href="fileUploadAction">Upload</a>
				<a class="nav-item nav-link" href="Login.jsp">Sair</a></li>
		</ul>
	</div>
	</nav>
	
	<div class="container">
		<br>
		<h1 class="display-4">
			Bem vindo,
			<s:property value="username" />
			...!
		</h1>
		<br>
		<br>

      <img class="d-block w-100" src="https://media.architecturaldigest.com/photos/5d5d686f7bdbe800088755d4/16:9/w_2560,c_limit/Abstract_S1_Ingels_00802R.jpg" alt="Segundo Slide">
    
</body>
</html>

