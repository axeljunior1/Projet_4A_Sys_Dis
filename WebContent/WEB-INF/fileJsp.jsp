
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<%@ include file="NavBar.jsp"%>

	<div></div>


	<div class="container">
		<div class="jumbotron">
		<div class="card-header bg-transparent border-success"> 
			<h1 class="display-4">Hello, world! (Header)</h2>
		</div>
			<p class="lead">This is a simple hero unit, a simple
				jumbotron-style component for calling extra attention to featured
				content or information.</p>


			<c:if test="${!empty cf.res }">
				<c:out value="${cf.res }"></c:out>
			</c:if>
			<form action="fileJsp" method="post">
				<p>
					<label for="nom"> Nom:</label> <input type="text" name="nom"
						id="nom">
				</p>
				<p>
					<label for="prenom"> prenom:</label> <input type="text"
						name="prenom" id="prenom">
				</p>
				<p>
					<label for="age"> age:</label> <input type="text" name="age"
						id="age">
				</p>
				<input type="submit">
			</form>

			<c:forEach items="${etudiants}" var="etudiant">
				<p>${etudiant.nom }</p>
			</c:forEach>
			<p>Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's standard
				dummy text ever since the 1500s, when an unknown printer took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged. It was popularised in
				the 1960s with the release of Letraset sheets containing Lorem Ipsum
				passages, and more recently with desktop publishing software like
				Aldus PageMaker including versions of Lorem Ipsum.</p>
				
				<p>Lorem Ipsum is simply dummy text of the printing and
				typesetting industry. Lorem Ipsum has been the industry's standard
				dummy text ever since the 1500s, when an unknown printer took a
				galley of type and scrambled it to make a type specimen book. It has
				survived not only five centuries, but also the leap into electronic
				typesetting, remaining essentially unchanged. It was popularised in
				the 1960s with the release of Letraset sheets containing Lorem Ipsum
				passages, and more recently with desktop publishing software like
				Aldus PageMaker including versions of Lorem Ipsum.</p>


			<hr class="my-4">
			<p>It uses utility classes for typography and spacing to space
				content out within the larger container.</p>
			<p class="lead">
				<a class="btn btn-primary btn-lg" href="#" role="button">Learn
					more</a>
			</p>
			
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>