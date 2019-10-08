<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css">
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.1/css/bootstrap.css">
	<script type="text/javascript" src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.maskedinput/1.4.1/jquery.maskedinput.js"></script>
</head>


<body>
<div class="container">

 <h2>Cadastro Cliente</h2>
 
 <form method="post" action="ControllerCliente">
   
   <div class="form-group">
   <label for="nome">Nome</label>
    <input type="text" name="nome" id="nome" required
       title="Entre com o Nome" pattern="[a-z A-Z]{2,50}" 
        class="form-control"        />
 </div>
 
   <div class="form-group">
   <label for="email">Email</label>
    <input type="email" name="email" id="email" required
       title="Entre com o email"  
        class="form-control"        />
 </div>
 <br/><br/>
 <button type="submit" class="btn btn-dark">Gravar</button> 
  </form>
  <br/>
  ${msg}
</div>
</body>
</html>


















