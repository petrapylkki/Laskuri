<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8" />

<link href="styles.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
<title>Uusi lasku</title>
</head>

<body>
	<h1>Lis‰‰ uusi lasku</h1>
		<form action="lisaalasku" method="post">
			<table>
				<tr>
					<td>Nimi </td>
					<td><input type="text" 
					value=""
					name="nimi" size="50"  />
					</td>
				</tr>
				<tr>
					<td>Saaja </td>
					<td><input type="text" 
					value=""
					name="saaja" size="50"  />
					</td>
				</tr>	
				<tr>
					<td>Tilinumero </td>
					<td><input type="text" 
					value=""
					name="tilinro" size="50"  />
				</td>
				</tr>
				<tr>
					<td>Viitenumero </td>
					<td><input type="text" 
					value=""
					name="viitenro" size="50"  />
				</td>
				</tr>
				<tr>
					<td>Viesti </td>
					<td><input type="text" 
					value=""
					name="viesti" size="50"  />
				</td>
				</tr>
				<tr>
					<td>Er‰p‰iv‰ </td>
					<td><input type="text" 
					value=""
					name="erapvm" size="50"  />
				</td>
				</tr>
				<tr>
					<td>
						<div class="button"><a href="laskulistaus">Peruuta</a></div></td>
					<td>
						<input type="submit" name="submit-button" class="btn btn-success" value="Tallenna" />
					</td>
				</tr>	
			</table>
			</form>
		
</body>
</html>