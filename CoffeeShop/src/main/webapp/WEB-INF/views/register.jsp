<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="/styles.css">
</head>
<body>

	<div class="regform">
		<form action="newUser" method="POST">
			<p>
				<label>User Name</label> <input type="text" name="username"
					value="User Name">
			</p>
			<p>
				<label>Password</label> <input type="password" name="password">
			</p>
			<p>
				<label>First Name</label> <input type="text" name="firstname"
					value="First Name">
			</p>
			<p>
				<label>Last Name</label> <input type="text" name="lastname"
					value="Last Name">
			</p>
			<p>
				<label>Email</label> <input type="email" name="email"
					value="Email@website.com">
			</p>
			<label>Gender</label><br> <input type="radio" name="gender"
				value="Male">Male<br> <input type="radio" name="gender"
				value="Female">Female<br>

			<p>
				Birthday (month/day/year): <input type="date" name="bday">
			</p>
			<p>
				<input type="submit" value="submit">
			</p>
		</form>
	</div>

</body>
</html>