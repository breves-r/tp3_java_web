<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Cadastre-se</title>
</head>
<body>

	
	<div class="container">	
		 <form action="/login" method="get">
			<h3>Cadastramento realizado com sucesso!</h3>
			
			
		 	<c:if test="${not empty usuario}">
			
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Nome</th>
			        <th>E-mail</th>
			      </tr>
			    </thead>
			    
			    <tbody>
			      <tr>
			        <td>${usuario.nome}</td>
			        <td>${usuario.email}</td>
			      </tr>
			    </tbody>
			</table>
			
			</c:if>
			
			<c:if test="${empty usuario}">
	  		<p>Não existem usuários cadastrados!!!</p>            
	  	</c:if>
			
			<button type="submit">Login</button> 
		</form>	
	</div>
</body>
</html>