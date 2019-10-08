<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 <div class="container mt-5">
 <h2>Listagem Cliente e do Plano</h2>
 <form method="post" action="ControllerCliente" id="form1">
   <%@ page import="entity.*, persistence.*, manager.* " %>
   <jsp:useBean id="mb" class="manager.ManagerBean" scope="page">
   </jsp:useBean>
   <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
    <table class="table table-striped">
    <thead>
     <tr>
       <th>Id Cliente</th>
       <th>Nome</th>
       <th>Id Pagamento</th>
       <th>Nome Pagamento</th>
       <th>Valor</th>
    </tr>
    </thead>
     <tbody>
     <c:forEach items="${mb.lista}" var="linha">
      <tr>
       <th>${linha.cliente.id}</th>
       <th>${linha.cliente.nome}</th>
       <th>${linha.plano.id}</th>
       <th>${linha.plano.nomePlano}</th>
       <th>${linha.plano.valor}</th>
    </tr>
    </c:forEach>
     </tbody>
    </table>
  </form>
  <!--  Até aqui ele listou, observa o nome e envia o codigo -->
  
  <form method="post" action="ControllerCliente?cmd=buscaCodigo"
   name="form2">
  
  <select name="idCliente" id="idCliente" class="form-control">
       <c:forEach items="${mb.lista}" var="linha">
      <option value="${linha.cliente.id}">${linha.cliente.nome}</option>
     </c:forEach>
  </select>
  <br/><br/>
  <button  type="submit" class="btn btn-danger" >Enviar os Dados</button>
    </form>
   
 </div>


</body>
</html>