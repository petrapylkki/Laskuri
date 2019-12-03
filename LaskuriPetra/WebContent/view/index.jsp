<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="utf-8" />

<title>Laskuri</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" />

</head>
<body>

	<h1>Laskut</h1>
	<a href="lisaalasku" class="btn btn-primary">+ Lis‰‰ lasku</a>
	<table class="table table-hover" >
		<thead class="thead-dark">
			<tr>
				<th>Nimi</th>
				<th>Saaja</th>
				<th>Tilinumero</th>
				<th>Viitenumero</th>
				<th>Viesti</th>
				<th>Er‰p‰iv‰m‰‰r‰</th>
			</tr>
		</thead>
		<c:forEach items="${laskut}" var="lasku">
			
			<tr>
				<td><c:out value="${lasku.nimi}" /></td> 
				<td><c:out value="${lasku.saaja}" /></td> 
				<td><c:out value="${lasku.tilinro}"/></td>
				<td><c:out value="${lasku.viitenro}"/></td>
				<td><c:out value="${lasku.viesti}"/></td>
				<td><c:out value="${lasku.erapvm}"/></td>
				<!-- <td><a href="#" class="btn btn-danger"></a></td> -->
			</tr>
		</c:forEach>
	</table>
	<p><c:out value="${param.viesti}" /></p>
</body>
</html>