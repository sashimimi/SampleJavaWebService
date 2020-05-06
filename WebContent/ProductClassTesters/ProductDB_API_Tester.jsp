<!DOCTYPE HTML>
<%@page import="db_emulator.*"%>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>ProductDB_API Tester</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<% 
	ProductDB_API o1 = new ProductDB_API(); //create object o1 from Product DB API class
	o1.createProductDB_Object(); //create a static ProductDB object using method in o1
	String strProduct = o1.getProduct("mcb2"); //get the properties of a product object & store in a String 
	out.print("Output from ProductDB_API getProduct(mcb2) method: <br />" + strProduct); //display the String returned by getProduct( ) method

	//try to get properties from a product not in DB table
	Product aProduct = o1.getProductObject("xxxx"); //get the properties of a product object & store in a String
	aProduct.setDescription("This is the Description of Product xxxx"); 
	out.print("<br /><br />Output from ProductDB_API getProduct(xxxx).getDescription( ) method: <br />" + aProduct.getDescription()); //display the String returned by getProduct( ) method

%>


</body>
</html>