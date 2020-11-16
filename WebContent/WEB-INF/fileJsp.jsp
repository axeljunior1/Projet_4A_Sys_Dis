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
		</a><label for="login"> Nom:</label> 
		<input type="text" name="login" id="nom">
		</p>
		<p>
		</a><label for="password"> Password:</label> 
		<input type="password" name="password" id=""password"">
		</p>
		<input type="submit">
	</form>
</body>
</html>