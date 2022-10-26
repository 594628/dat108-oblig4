<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>

    <title>Logout V2</title>
</head>
<body>
<h4>You are now logged out</h4>
<form action="loginAgain" method="get" name="loginAgain">
    <input type="submit" value="Login"/>
</form>
</body>
</html>