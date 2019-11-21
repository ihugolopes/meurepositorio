<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Formulário</title>

</head>
<body class="p-3 mb-2 bg-white text-dark">
<div class="text-dark">
	 <h5 class="card-title text-center ">FORMULÁRIO DE CADASTRO</h5>
</div>

<br>
	<s:form action="customer.action" method="post" validate="true" theme="simple" cssClass="well form-search">
		<s:textfield name="name" placeholder="Nome" key="Nome" size="20" />
		<br><br>
		<s:textfield name="age" key="Idade" placeholder="Idade" size="20" />
		<br><br>
		<s:textfield name="email" key="Email" placeholder="Email" size="20" />
		<br><br>
		<s:textfield name="telephone" key="Telefone" placeholder="Telefone" size="20" />
		<br><br>
		<s:submit method="execute" key="label.add.customer" align="center" cssClass="btn btn-danger" />
	</s:form>
	
</body>
</html>