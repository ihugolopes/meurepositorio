<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body class="p-3 mb-2 bg-white text-dark">
	

	 <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">BEM VINDO - LOGIN</h5>
	
	<s:actionerror />
	
	<s:form action="login.action" method="post" theme="simple" cssClass="form-label-group">
		  <label  class="label">Email:</label>
		<s:textfield name="username" key="label.username" size="20" placeholder="Login"  class="form-control" tooltip="Enter your Name here" />
		<br><br>
		 <label  class="label">Senha:</label>
		<s:password name="password" key="label.password" size="20"  placeholder="Password" tooltip="Entre com sua senha" />
		<br><br>
	    <s:submit method="execute" key="label.login" align="center" cssClass="btn btn-primary"/>
	</s:form>
	   </div>
        </div>
      </div>
    </div>
  </div>

</body>
</html>
