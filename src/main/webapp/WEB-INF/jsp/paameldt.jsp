<!DOCTYPE html>
<!-- saved from url=(0030)http://localhost:8080/paameldt -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" href="simple.css">
<title>Påmeldingsbekreftelse</title>
</head>
<body>
	<h2>Påmeldingsbekreftelse</h2>
	<p>Påmeldingen er mottatt for</p>
	<p>
		&nbsp;&nbsp;${deltager.fornavn}<br>
		&nbsp;&nbsp;${deltager.etternavn}<br>
		&nbsp;&nbsp;${deltager.kjonn}<br>
		  ${deltager.mobil}<br>

	</p>
	<form:form action="deltagerliste" method="get">
		<fieldset>
			<input type="hidden" name="hiddenLogout" value="hiddenLogout"/>
			<p><input type="submit" value="Gå til deltagerliste" /></p>
		</fieldset>
	</form:form>
</body>
</html>