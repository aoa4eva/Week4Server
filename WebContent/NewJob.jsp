<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action="JobServlet">
	<input type="text" name ="jtitle" placeholder="Enter the job title"/>
	<input type="text" name = "jcompany" placeholder="Enter companyname"/>
	<input type="text" name = "startyear" placeholder="Enter start year"/>
	<input type="text" name = "endyear" placeholder="Enter end yar"/>
	<input type="submit" value="Add Job">
</form>
</body>
</html>