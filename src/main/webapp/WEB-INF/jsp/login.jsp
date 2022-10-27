<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>

    <title>Login V2</title>
</head>
<body>
<h4>Login V2</h4>

<%--<c:forEach var="melding" items="${param.message}">--%>

<%--</c:forEach>--%>

<form:form action="login" method="post">
    <fieldset>
        <legend>Login</legend>
        <c:out value="${message}"/>
        <p>Passord: <input type="password" name="password"/></p>
        <p><input type="submit" value="Login"></p>
    </fieldset>
</form:form>
</body>
</html>