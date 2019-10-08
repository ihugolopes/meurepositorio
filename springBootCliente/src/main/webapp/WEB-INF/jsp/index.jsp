<%@ page language="java" contentType="text/html; charset=UTF-8" 
  pageEncoding="UTF-8" %>
  <!DOCTYPE HTML>
  <html>
  <head>
  </head>
  <body>
  <%@ taglib prefix="spring"  uri="http://www.springframework.org/tags" %>
  <%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core"  %>
    <form action="/cliente"  method="post">
    <br/>Nome<br/>
  <input type="text"   name="nome" id="nome" required="required" placeholder="Nome ..." />
  <br/>Email<br/>
  <input type="email" name="email" id="email" required="required" placeholder="Email ..." />
  <br/>Foto<br/>
  <input type="text"    name="foto" id="foto"  required="required" placeholder="Foto..." />
  <br/>
  <button type="submit">Enviar os Dados</button>
  </form>
  ${msg}
  <br/><br/>
    <a href="/listarservice">Listar Cliente</a>
  
    </body>
   </html>
  
  
  
  