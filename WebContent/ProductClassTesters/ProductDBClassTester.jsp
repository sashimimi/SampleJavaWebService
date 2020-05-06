<!DOCTYPE HTML>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="db_emulator.*" %>

<html>
<head>
<title>ProductDB Class Tester</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
ProductDB Class Tester: <br /><br />
<%
		 
	//call the ProductDB static getProduct(String productCode) method
	//& display returned object's properties using toString( ) method
	Product aProduct = ProductDB.getProduct("mcb2");
		out.print("<br />Output from toString() after calling the static method "
		+ " getProduct(String) which returns a Product object <br />"
		 + aProduct.toString());	 
	
 %>

</body>
</html>