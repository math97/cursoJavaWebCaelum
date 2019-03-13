 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="css/jquery.css" rel="stylesheet"/>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
</head>
<body>
<c:import url="cabecalho.jsp"/>

	<%-- <caelum:formfor name="{\"campos\": [{\"id\":\"nome\",\"tipo\":\"text\"}]}"></caelum:formfor>--%>
	<form action="AdicionaContato">

		<caelum:campoLabel name="nome"/>
		<%-- Nome:<input type="text" name="nome"/><br/>--%>
		E-mail::<input type="text" name="email"/><br/>
		Endereço:<input type="text" name="endereco"/><br/>
		Data Nascimento:<caelum:campoData id="dataNascimento"/><br/>
		<input type="submit" value="Gravar" />
		

		
	
	</form>
	<c:import url="rodape.jsp"/>
</body>
</html>