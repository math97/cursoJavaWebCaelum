<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de tarefas</title>
</head>
<body>
	<h3>Nova Tarefa</h3>
	<form:errors path="tarefa.descricao"/>
	<form action="salvarNova" method="post">
		<label for="descricao">Descrição</label>
		<textarea rows="5" cols="100" id="descricao" name="descricao"></textarea>
		<input type="submit" value="Salvar" />
	</form>
	

</body>
</html>