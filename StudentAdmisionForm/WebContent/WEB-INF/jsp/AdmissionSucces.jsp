<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
 <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
            border-spacing: 0;
            border: 1px solid #ddd
        }
        td, th {
            border: none;
            text-align: left;
            padding: 8px;
        }
        th{
            background-color: #f7f7f9;
            font-family: "Lato", "Segoe UI", Frutiger, "Frutiger Linotype", "Dejavu Sans", "Helvetica Neue", Arial, sans-serif;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover
        {
            background-color: cornflowerblue;
        }
    </style>
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
			<th>
				Mobile
			</th>
			<th>
				DOB
			</th>
			<th>
				Skills
			</th>
		</tr>
		<tr>
			<td>
				${student.studentname}
			</td>
			<td>
				${student.studenthobby}
			</td>
			<td>
				${student.studentmobile}
			</td>
			<td>
				${student.studentdob}
			</td>
			<td>
				${student.studentskills}
			</td>
		</tr>
	</table>
</body>
</html>