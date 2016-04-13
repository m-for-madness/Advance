<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<table id="person_table" class="table default_table">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
			</tr>
		</thead>
		<c:forEach items="${personList}" var="person">
			<tr>
				<td><a href="${context}/users/${person.id}">${person.id }</a></td>
				<td><a href="${context}/users/name/${person.name}">${person.name }</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
