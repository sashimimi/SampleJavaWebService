<!DOCTYPE HTML>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="db_emulator.*" %>

<html>
<head>
<title>ProductClassTester</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<%
	//create a product object using the default constructor method
	Product aProduct = new Product();
	out.print("Output from toString() after creating an object using "
		+ " the default constructor method: <br />"
		 + aProduct.toString());
		 
	//create a product object using a parameterized constructor method
	Product newProduct = new Product("test", "tester description", 9999.9876);
	out.print("<br /><br />"
		+ "Output from toString() after creating an object using "
		+ " the parameterized constructor method: <br />"
		 + newProduct.toString());	 
	
	

 %>

</body>
</html>