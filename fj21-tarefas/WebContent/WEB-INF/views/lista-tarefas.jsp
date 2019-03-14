<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Lista de tarefas</h3>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Descricao</th>
				<th>Finalizada?</th>
				<th>Data de Finalização</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${tarefas}" var="tarefa">
				<tr>
					<td>${tarefa.id }</td>
					<td>${tarefa.descricao}}</td>

					<c:if test="${tarefa.finalizado eq true }">

						<td>Sim</td>
					</c:if>
					<c:if test="${tarefa.finalizado eq false }">

						<td>Não</td>
					</c:if>

					<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}" pattern="dd/mm/yyyy"	/></td>
					<td><a href="removeTarefa?id=${tarefa.id }">Remover</a></td>
					<td><a href="mostraTarefa?id=${tarefa.id }">Alterar</a></td>

				</tr>
			</c:forEach>


		</tbody>


	</table>
</body>
</html>