<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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