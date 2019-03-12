<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%--Comentário ej jsp aqui:nossa primeira página jsp --%>

<%
String mensagem = "Bem vindo ao sistema do FJ-21";
%>
<% out.print(mensagem); %>
</br>
<%
	String desenvolvido = "Desenvolvido por Matheus";
%>
</br>
<%=desenvolvido %>
</br>
<% System.out.print("Tudo foi executado");%>

</body>
</html>