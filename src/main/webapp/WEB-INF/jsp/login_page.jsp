<html>
	<head>
		<link href="/webjars/bootstrap/5.3.0/css/bootstrap.min.css" rel="stylesheet" />
		<title>To-do List </title>
	<head>
	
	<body>
		<div class="container">
			<h2>Welcome to Login Page.</h2>
			<pre>${errorMessage }</pre>
			<form method="post" action="login">
				Name: <input type="text" name="name"/>
				Password: <input type="password" name="password"/>
				<input type="submit" class="btn btn-success"/>
			</form>
		</div>
		<script src="/webjars/bootstrap/5.3.0/js/bootstrap.min.js"></script>		
		<script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
	</body>
</html>