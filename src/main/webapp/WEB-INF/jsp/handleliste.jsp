<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>

    <title>Handleliste V2</title>
</head>
<body>

<h4>Handleliste V2</h4>

<form action="add" method="post" name="addVare">
    <fieldset>
        Legg til vare: <br/>
        <input type="text" name="vare">
        <input type="submit" value="legg til" />
        <br/>
    </fieldset>
</form>

<br/><br/>

<table>
    <c:forEach var="vare" items="${handleliste.varer}">
        <tr>
            <td>
                <form action="remove" method="post" name="removeVare">
                    <c:out value="${vare.navn}"/>
                    <input type="hidden" name="slettetVare" value="${vare.navn}"/>
                    <input type="submit" value="Slett"/>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<br/><br/>

<form action="logout" method="get">
    <fieldset>
        <input type="hidden" name="hiddenLogout" value="hiddenLogout"/>
        <p><input type="submit" value="Logg ut" /></p>
    </fieldset>
</form>
</body>
</html>