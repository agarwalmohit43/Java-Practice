<html>
<head>
<title>Welcome MOHIT</title>
</head>
<body>
The Student name is: ${param.firstname} <%= request.getParameter("lastname") %><br><br>
Country: ${param.country}<br><br>
Favourite Language: ${param.rlanguage} <br><br>
Favourite Language:
<ul><%
String[] langs= request.getParameterValues("clanguage");
for (String lang : langs )
{
	out.println("<li>" + lang + "</li>");
}
%>
</ul>

</body>
</html>