<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- saved from url=(0032)http://localhost:8080/innlogging -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="simple.css">
<title>Logg inn</title>
</head>
<body>
	<h2>Logg inn</h2>
	<p style="color:red;"></p>
	<form method="post">
		<fieldset>
			<label for="mobil">Mobil:</label> <input type="text" name="mobil">
			<label for="passord">Passord:</label> <input type="password" name="passord">
			<br><br><button type="submit">Logg inn</button>
		</fieldset>
	</form>


</body></html>