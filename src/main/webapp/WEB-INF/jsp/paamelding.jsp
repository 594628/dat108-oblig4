<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- saved from url=(0032)http://localhost:8080/paamelding -->
<html lang="no">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="./css/simple.css" rel="stylesheet" type="text/css">
	<script src="PaameldingScript.js"></script>
	<title>Påmelding</title>
</head>

<body>

<h2>Påmelding</h2>

<form:form action="paamelding" method="post">
	<fieldset>
			<%--        <label for="mobil">--%>
		Fornavn: <input type="text" name="fornavn">
			<%--        <label for="passord">--%>
		Etternavn: <input type="password" name="etternavn">

		Mobil: <input type="text" name="mobil">

		Passord: <input type="text" name="passord">

		Repeter passord: <input type="text" name="passord">

		<br><br><button type="submit" value="registerUser">Meld på</button>
	</fieldset>
</form:form>

<%--<c:out value="error"/>

<form:form action="registerUser" method="post" class="pure-form pure-form-aligned" >
	<fieldset>
		<div class="pure-control-group">
			<label for="fornavn">Fornavn:</label> <input type="text"
														 name="fornavn" id="fornavn" value="${skjema.fornavn}"
														 onkeyup="fornavnSjekk()" /> <font color="red" id="fn">${skjema.fornavnFeilmelding}</font>
		</div>
		<div class="pure-control-group">
			<label for="etternavn">Etternavn:</label> <input type="text"
															 name="etternavn" id="etternavn" value="${skjema.etternavn}"
															 onkeyup="etternavnSjekk()" /> <font color="red" id="en">${skjema.etternavnFeilmelding}</font>
		</div>
		<div class="pure-control-group">
			<label for="mobil">Mobil (8 siffer):</label> <input type="text"
																name="mobil" id="mobil" value="${skjema.telefon}"
																onkeyup="mobilSjekk()" /> <font id="mob" color="red">${skjema.telefonFeilmelding}</font>
		</div>
		<div class="pure-control-group">
			<label for="passord">Passord:</label> <input type="password"
														  name="passord" id="passord" value="${skjema.passord}"
														  onkeyup="passordSjekk()" /> <font id="pass" color="red">${skjema.passordFeilmelding}</font>
		</div>
		<div class="pure-control-group">
			<label for="passordRep">Repeter Passord:</label> <input
				type="password" id="passordRep" name="passordRepetert"
				value="${skjema.passordKopi}" onkeyup="passordRepSjekk()" /> <font
				color="red" id="passRep">${skjema.passordKopiFeilmelding}</font>
		</div>
		<div class="pure-control-group">
			<label for="kjonn">Kjønn:</label> <input type="radio" name="kjonn" id="kjonn"
													 value="mann" ${skjema.kjonn.equals("mann") ? "checked" : ""} />mann
			<input type="radio" name="kjonn" value="kvinne"
			${skjema.kjonn.equals("kvinne") ? "checked" : ""} />kvinne
			<font color="red">${skjema.kjonnFeilmelding}</font>
		</div>
		<div class="pure-controls">
			<button type="submit" value="Meld på">Meld på</button>
		</div>
	</fieldset>
</form:form>--%>
</body>
</html>
