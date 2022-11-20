<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- saved from url=(0032)http://localhost:8080/paamelding -->
<html lang="no" html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link th:href="@{/CSS/simple.css}" rel="stylesheet" type="text/css">
	<script th:src="@{/JS/validation.js}" defer></script>
	<title>Påmelding</title>
</head>

<body>
	<h2>Påmelding</h2>
	
	<form id="deltagerFormBean" action="http://localhost:8080/paamelding" method="post">
		<fieldset>
		
			<label for="fornavn">Fornavn</label>
			<!-- NB! Spring sin (form:input)-tag støtter ikke required alene, 
			     men greit med required="noe"! -->
			<input id="fornavn" name="fornavn" title="..." pattern=".*" placeholder="Fyll inn fornavn" required="required" type="text" value="">
            
            
            <label for="etternavn">Etternavn</label> 
            <input id="etternavn" name="etternavn" title="..." pattern=".*" placeholder="Fyll inn etternavn" required="required" type="text" value="">
            
            
            <label for="mobil">Mobil (8 siffer)</label>  
            <input id="mobil" name="mobil" title="..." pattern=".*" placeholder="Fyll inn telefonnummer" required="required" type="text" value="">
            

            <label for="passord">Passord</label> 
            <input id="passord" name="passord" title="..." pattern=".*" placeholder="Velg et passord" type="password" required="required" value="">
            
            
            <label for="passordRepetert">Passord repetert</label> 
            <input id="passordRepetert" name="passordRepetert" title="..." pattern=".*" placeholder="Gjenta passord" type="password" required="required" value="">
            
            
<%--			<label for="kjonn">Kjønn:</label> --%>
<%--			<input id="kjonn1" name="kjonn" checked="checked" type="radio" value="mann">mann--%>
<%--			<input id="kjonn2" name="kjonn" type="radio" value="kvinne">kvinne--%>

			<p>Kjønn:
				<input type="radio" id="man" name="gender" value="Mann"/> <label for="man">Mann</label>
				<input type="radio" id="woman" name="gender" value="Kvinne"> <label for="woman">Kvinne</label>
			</p>
			     
			<br><br><p><input type="submit" value="Meld meg paa"></p>
		</fieldset>
	</form>


</body></html>