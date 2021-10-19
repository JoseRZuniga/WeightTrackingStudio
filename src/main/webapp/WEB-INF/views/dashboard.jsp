<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<script src="<c:url value='resources/static/js/app.js' />"></script>
	<script src="<c:url value='resources/static/js/service/user.service.js' />"></script>
	<script src="<c:url value='resources/static/js/controller/user.controller.js' />"></script>
	
	<title>Dashboard</title>
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	<link href="<c:url value='resources/static/css/style.css' />"rel="stylesheet"></link>
</head>

	<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
		<div class="container">
			<a class="navbar-brand" href="/">Weight Tracking Studio (Trial)</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item active"><a class="nav-link" href="/dashboard">Dashboard
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="nav-item"><a class="nav-link" href="settings">Settings</a></li>
					<li class="nav-item"><a class="nav-link" href="/">Log Out</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	
	<header class="jumbotron jumbotron-fluid">
		<div id="weightSubmission" class="container">
			<br>
			<form name="weightForm" method="POST" action="addWeight">
				<table class="table table-hover">
					<tr>
						<td><label>Weight Log Date</label></td>
						<td><input type="text" name="date" class="form-control"
							placeholder="Please input date of weight logging:"></input>
						</td>
					</tr>
					<tr>
						<td><label>Weight</label></td>
						<td><input type="number" name="weight" class="form-control"
							placeholder="Please input your weight:"></input>
						</td>
					</tr>
						<td><input type="submit"></td>
					</tr>
				</table>
			</form>
		</div>
	</header>

</body>
</html>