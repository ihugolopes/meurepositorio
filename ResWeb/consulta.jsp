<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/jquery.dataTables.min.css">
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.18/css/dataTables.bootstrap4.min.css">
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.18/js/jquery.dataTables.min.js"></script>
</head>


<body>
<%@ page import="entity.*, persistence.*, java.util.*" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container  p-5">
<h2>Consultar Todos os Produtos</h2>

<form method="GET" action="ControllProduto">
 <button type="submit" class="btn btn-danger">Consultar Produto</button>
</form>


<%
if (   request.getAttribute("msg")!=null   ){
%>
<table class="table table-striped" >
<thead>
  <tr>
     <th>Id</th>
     <th>Nome Produto</th>
     <th>Preco</th>
     <th>Imagem</th>
  </tr>
 </thead> 
 
 <tbody>
  <c:forEach  items="${msg}"  var="linha">
  <tr>
     <th>${linha.id}</th>
     <th>${linha.nomeProduto}</th>
     <th>${linha.preco}</th>
     <th><img src="${linha.imagem}" width="150px" /></th>
  </tr>
  </c:forEach>
 </tbody> 
  </table>  
<%
}
%>
<h2>Buscar Pelo Código o Produto</h2>
<form method="post"  action="ControllProduto">
Codigo<br/>
<Input type="text" name="codigo" id="codigo"/>
<button type="submit"  class="btn btn-danger">Enviar Codigo</button>
</form>
<%
if (   request.getAttribute("linha")!=null   ){
%>
<table class="table table-striped" >
<thead>
  <tr>
     <th>Id</th>
     <th>Nome Produto</th>
     <th>Preco</th>
     <th>Imagem</th>
  </tr>
 </thead> 
 
 <tbody>
   <tr>
     <th>${linha.id}</th>
     <th>${linha.nomeProduto}</th>
     <th>${linha.preco}</th>
     <th><img src="${linha.imagem}" width="150px" /></th>
  </tr>
 </tbody> 
  </table>  
<%
}
%>
${msg2}












</html>

</div>
</body>
</html>







