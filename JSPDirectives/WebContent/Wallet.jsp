<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:useBean id="MyWallet" class="beans.MyWallet"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Odd Numbers up to 20: 
<c:forEach var="i" begin="1" end="20" step="3">
${i }&nbsp;

</c:forEach>
<br/>
<p/>
Coins I Have: 
<c:forEach var="coin" items="${MyWallet.coins }" >
${coin }&nbsp;
</c:forEach>
<br/>
<p/>
Currencies I Have: 
<c:forEach var="currency" items="${MyWallet.currencies }" >
${currency }&nbsp;
</c:forEach>
<br/>
<p/>
Receipts I Have: 
<c:forEach var="receipt" items="${MyWallet.receipts }" >
${receipt }&nbsp;
</c:forEach>
</body>
</html>