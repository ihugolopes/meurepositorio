<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<body>
	<form method="post" action="/ControllerCalculo">

		<br/>NÚMERO 1<br/> <input type="number" name="numero1" id="numero1" />
<br/>
		<br/>NÚMERO 2<br/> <input type="number" name="numero2" id="numero2" />
<br/>
		<br/>OPERAÇÃO<br/> <input type="text" name="operacao" id="operacao" />

		<button id="btn1" type="submit">Calcular</button><br/>
		
		<div id="resposta1">${msg1}</div>
	</form>
</body>
</html>