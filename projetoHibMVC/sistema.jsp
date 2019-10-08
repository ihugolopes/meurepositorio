<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css"/>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.js"  ></script>
<script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.min.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
	

<script>
$(document).ready(function(){
	var d = new Date();
   //   alert(d);
	 $("#datepicker").datepicker(d);
});

</script>	
	
</head>
<body>
<div  class="container">
  <h2>Logar Usuario</h2>
   <form name="form1" method="post" action="ControlleUsuario?cmd=logar">
       <div class="form-group">
             <label for="email">Email</label>
            <input type="email" name="email" id="email" size="50" class="form-control" />
       </div>
       <div class="form-group">
             <label for="senha">Senha</label>
            <input type="password" name="senha" id="senha" size="50" class="form-control" />
       </div>
       <br/><br/>
       <button class="btn btn-danger" type="submit">Logar</button>
   </form>
   <br/><br/>
   ${msg}
   
   
     <h2>Gravar Usuario</h2>
   <form  name="form2" method="post" action="ControlleUsuario?cmd=gravar">
       <div class="form-group">
             <label for="nome">Nome</label>
            <input type="text" name="nome" id="nome" size="50" class="form-control" />
       </div>
       <div class="form-group">
             <label for="email2">Email</label>
            <input type="email" name="email" id="email2" size="50" class="form-control" />
       </div>
       <div class="form-group">
             <label for="senha2">Senha</label>
            <input type="password" name="senha" id="senha2" size="50" class="form-control" />
       </div>
           <div class="form-group">
             <label for="data">Data Cadastro</label>
            <input type="text" name="data" id="datepicker" size="20" class="form-control" />
       </div>
       <br/><br/>
       <button class="btn btn-danger" type="submit">Gravar</button>
   </form>
   <br/><br/>
   ${msg2}
   
</div>


</body>
</html>