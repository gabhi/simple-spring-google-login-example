<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:c="http://java.sun.com/jsp/jstl/core">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<jsp:text>
		<![CDATA[ <!DOCTYPE html> ]]>
	</jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<title>Tenmarks</title>
<jsp:directive.include file="header.jspf" />
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="span14 columns offset2">
				<h1>Login</h1>
				<form action="signin/google" method="POST">
				    <button type="submit" class="btn large primary">Sign in with Google</button>
				    <input type="hidden" name="scope" value="https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo#email" />		    
				</form>
			</div>
		</div>
	</div>
</body>
</html>
</jsp:root>