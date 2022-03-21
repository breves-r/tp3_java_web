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
	<form action="/logout" method="get">
			<h3>Usuário autenticado com sucesso!</h3>
			
			
		 	<c:if test="${not empty user}">
			
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			        <th>Nome</th>
			        <th>E-mail</th>
			      </tr>
			    </thead>
			    
			    <tbody>
			      <tr>
			        <td>${user.nome}</td>
			        <td>${user.email}</td>
			      </tr>
			    </tbody>
			</table>
			</c:if>
			<button type="submit">Logout</button> 
			</form>
		
	</div>
</body>
</html>