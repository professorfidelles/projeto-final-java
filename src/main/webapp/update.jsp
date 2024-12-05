<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página de atualização</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link rel="stylesheet" href ="./css/estilo.css">
</head>
<body>
	<form action="executa-update.jsp" method="post">
		<h2>Atualização</h2>
		<label>Id</label>
		<input type="number" name="id" class="form-control" value="<%=request.getParameter("id")%>">
		<label>Nome Completo</label>
		<input type="text" name="nome" class="form-control" value="<%=request.getParameter("nome")%>">
		<label>Cpf</label>
		<input type="text" name="cpf" class="form-control" value="<%=request.getParameter("cpf")%>">
		<label>E-mail</label>
		<input type="email" name="email" class="form-control" value="<%=request.getParameter("email")%>">
		<button class="btn btn-primary">Atualizar</button>
	
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>