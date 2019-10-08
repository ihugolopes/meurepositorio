<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<c:set var="caminho" value="${pageContext.request.contextPath}" />
<c:out value="${caminho}" /><br/>
<br/>
 <form method="post" action="${caminho}/gravar.html">
 
  Nome<br/>
  <input type="text" name="nome"  id="nome" size="50"  required/>
 <br/>Email<br/>
  <input type="email" name="email"  id="email" size="50" required />
 <br/>Logradouro<br/>
  <input type="text" name="endereco.logradouro"  id="logradouro" size="50" required />
  <br/>Bairro<br/>
  <input type="text" name="endereco.bairro"  id="bairro" size="50" required /> 
 <br/>Cidade<br/>
  <input type="text" name="endereco.cidade"  id="cidade" size="50" required /> 
 <br/>Estado<br/>
  <input type="text" name="endereco.estado"  id="estado" size="2" required /> 
 <br/>
 <br/>Cep<br/>
  <input type="text"  name="endereco.cep"  id="cep" size="10" required /> 
 <br/>
 <button type="submit">Enviar os Dados</button>
 <br/>
 ${msg}
  </form> 
  <hr/>
<h2>Consultar os Dados</h2>
<c:forEach items="${lista}" var="item">
   <li> ${item.idUsuario}, ${item.nome}, ${item.email}, ${item.endereco.logradouro}, ${item.endereco.bairro}, 
   ${item.endereco.cidade}, ${item.endereco.estado}, ${item.endereco.cep}</li>
   <a href="${caminho}/excluir/${item.idUsuario}">Apagar</a>
</c:forEach>  





</body>
</html>