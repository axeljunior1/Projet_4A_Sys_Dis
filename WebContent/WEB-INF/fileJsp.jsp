
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@ include file="NavBar.jsp" %>
<c:if test="${!empty cf.res }"> <c:out value="${cf.res }"></c:out></c:if>
	<form action="fileJsp" method="post">
		<p> 
		<label for="nom"> Nom:</label> 
		<input type="text" name="nom" id="nom">
		</p>
		<p>
		<label for="prenom"> prenom:</label> 
		<input type="text" name="prenom" id="prenom">
		</p>
		<p>
		<label for="age"> age:</label> 
		<input type="text" name="age" id="age">
		</p>
		<input type="submit">
	</form>
	
	<c:forEach  items="${etudiants }" var="etudiant" >
		<p> ${etudiant.nom } </p>
	</c:forEach>
</body>
</html>