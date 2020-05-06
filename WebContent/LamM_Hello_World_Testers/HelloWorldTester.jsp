<!DOCTYPE HTML>
<%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="lamm_hello_world.*" %>

<html>
<head>
<title>HelloWorldTester</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<%
	//create a product object using the default constructor method
	LamM_HelloWorld hello = new LamM_HelloWorld();
	out.print("Output from toString() after creating an object using "
		+ " the default constructor method: <br />"
		 + hello.toString());
		 
	//create a product object using a parameterized constructor method
	LamM_HelloWorld world = new LamM_HelloWorld("java");
	out.print("<br /><br />"
		+ "Output from toString() after creating an object using "
		+ " the parameterized constructor method: <br />"
		 + world.toString());	 
	
	

 %>

</body>
</html>