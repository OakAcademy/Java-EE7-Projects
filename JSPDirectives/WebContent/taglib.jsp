<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="oak" %>
    <oak:set var="name" value="John"  scope="session"/>
    <oak:set var="sport" value="Basketball"  scope="session"/>
    <%@ include file="file1.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/>
<%=session.getAttribute("name") %>
    <oak:set var="name" value="Albert"  scope="session"/>
    <br/>
<%=session.getAttribute("name") %>

</body>
</html>