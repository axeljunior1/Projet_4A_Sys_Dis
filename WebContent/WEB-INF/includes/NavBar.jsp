
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="#" style="margin-right: 50px">E-buy</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link" href="#">Home
					<span class="sr-only">(current)</span>
			</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Features</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
			<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
		</ul>
		<span class="navbar-text">

			<form class="form-inline" method="post" action="Acceuil">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search" style="width: 500px">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				<c:if test="${50>10 }" var="variable">

					<label class="btn btn-outline-success my-2 my-sm-0"
						style="border: 0px; color: white">Non du connecté
						(${!variable })</label>

				</c:if>
				<a href="/Acceuil">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit"
						style="margin-left: 10px">
						<!--  <img src="user_icon_176933.png" style=" width: auto ; height: auto;"/>-->
						Mon Compte
					</button>
				</a>

			</form>
		</span>
	</div>
	<div>
	
	</div>
</nav>