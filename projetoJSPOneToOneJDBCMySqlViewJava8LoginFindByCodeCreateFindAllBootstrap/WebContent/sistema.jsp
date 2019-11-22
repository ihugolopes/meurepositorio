<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="mb" class="manager.ManagerBean" scope="page"></jsp:useBean>



</head>
<body>

<div class="container-fluid">
	<div class="row">
		<div class="col-md-4 offset-md-1">
			<div class="card mt-3 shadow border-primary">
				<div class="card-header bg-info text-white text-center">
					Formulario de Cadastro
				</div>
				<div class="card-body">
				<form role="form" method="post" action="ControllerAlunoCadastro">
						<input type="text" name="nome" id="nome"
						placeholder="Digite o Nome" required="required"
						class="form-control mb-2"
						pattern="[a-z A-Z]{2,50}"
						>
						
						<input type="email" name="email" id="email"
						placeholder="Digite o Email" required="required"
						class="form-control mb-2"
						>
						
						<input type="password" name="senha" id="senha"
						placeholder="Digite a Senha" required="required"
						class="form-control"
						pattern="[a-z A-Z0-9]{3,15}"
						>
						
						<button type="submit" 
						class="btn btn-primary btn-sm mt-2">
						Gravar</button>
						
					</form>
				</div>
				<div class="card-footer" id="resgate">
                   ${msg}
				</div>
			</div>	
		</div>
		
		<div class="col-md-4 offset-md-1">
			<div class="card mt-3">
				<div class="card-header">
					Formulário de Login
				</div>
				
				<div class="card-body">
					<form role="form" method="post" action="#">
						<input type="email" name="email" 
						placeholder="Digite o Email" required="required"
						class="form-control mb-2">
				
						<input type="password" name="senha"
						placeholder="Digite a Senha" required="required"
						class="form-control mb-2">
						
						<button type="submit" class="btn btn-success">
						Logar </button>
					</form>
				</div>
				
			</div>
		</div>
		
	</div>
	
	
	
	
	<div class="card">
		<div class="card-body">
			<table class="table table-border table-hover">
				<thead>
					<tr>
						<th>Nome</th>
						<th>Email</th>
					</tr>
				</thead>
				
				<tbody>
				<c:forEach var="linha" items="${mb.lista}">
					<tr>
						<td>${linha.nome}</td>
						<td>${linha.email}</td>
					</tr>
			     </c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	
	
	
</div>


</body>
</html>