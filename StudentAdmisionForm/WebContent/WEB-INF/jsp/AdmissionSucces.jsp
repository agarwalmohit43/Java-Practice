<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>

	<h1>Student Admission</h1>
	<h2>${msg}</h2>
	
	<table>
		<tr>
			<th>
				Name
			</th>
			<th>
				Hobby
			</th>
		</tr>
		<tr>
			<td>
				${student.studentname}
			</td>
			<td>
				${student.studenthobby}
			</td>
		</tr>
	</table>
</body>
</html>