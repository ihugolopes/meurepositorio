<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.css"/>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.js"  ></script>
<script type="text/javascript" src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script>
 $(document).ready(function(){
	   $("#cep").on('blur', function(){
            var vcep =   $("#cep").val();
                $.getJSON("http://api.postmon.com.br/v1/cep/" + vcep,
                          function(retorno){
                              if (retorno!=null){
                                  $("#logradouro").val(retorno.logradouro);
                            	  $("#bairro").val(retorno.bairro);
                            	  $("#cidade").val(retorno.cidade);
                            	  $("#estado").val(retorno.estado);
                            	  $("#tela").html("CEP  Encontrado");
                              }
               });
     });
 });

</script>

</head>
<body>
<div class="container">
<form method="post" action="ControllerAluno">
<h2>Gravar Cliente</h2>
<br/>Nome<br/>
<input type="text" name="nome" id="nome" value="" size="50" />
<br/>Email<br/>
<input type="email" name="email" id="email" value="" size="50" />
<br/>Cep<br/>
<input type="text" name="cep" id="cep" value="" size="10" />
<br/>Logradouro<br/>
<input type="text" name="logradouro" id="logradouro" value="" size="50" />
<br/>bairro<br/>
<input type="text" name="bairro" id="bairro" value="" size="50" />
<br/>cidade<br/>
<input type="text" name="cidade" id="cidade" value="" size="50" />
<br/>Estado<br/>
<input type="text" name="estado" id="estado" value="" size="10" />
<button type="submit">Enviar os Dados</button>

</form>
<div id="tela"></div>
<br/><br/>
${msg}

</div>
</body>
</html>