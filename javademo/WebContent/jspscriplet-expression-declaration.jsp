<html>
<head>
<title>Welcome MOHIT</title>
</head>
<body>
<h1>Welcome Mohit</h1>
Your current time is <%= new java.util.Date() %><br>

<%! String makeitlower(String data){
return data.toLowerCase();	
}

%>

Lower case: <%= makeitlower("MOHIT") %>
<br>

<% for(int i=1;i<=5;i++){
	out.println("<br/>" + i);
}%>

</body>
</html>