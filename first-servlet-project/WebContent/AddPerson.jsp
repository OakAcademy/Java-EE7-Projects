<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This Page is Add Person Page</h1>
<form action="<%= request.getContextPath()%>/AddPerson" method="post" >
<div>

<% 

	Boolean errorState = (Boolean)request.getAttribute("errors");
	if (errorState!=null && errorState){
		out.print("<div>"+request.getAttribute("error")+"</div>");
	}

%>

<label for="name">Name:</label><br>

<input type="text" id="name" name="name" ><br><br>
</div>
<div>

<% 

	errorState = (Boolean)request.getAttribute("errorsSurname");
	if (errorState!=null && errorState){
		out.print("<div>"+request.getAttribute("errorSurname")+"</div>");
	}

%>

<label for="surname">Surname:</label><br>
<input type="text" id="surname" name="surname"  ><br><br>

</div>
<div>


<% 

	errorState = (Boolean)request.getAttribute("errorsJob");
	if (errorState!=null && errorState){
		out.print("<div>"+request.getAttribute("errorJob")+"</div>");
	}

%>
<label for="job">Job:</label><br>
<input type="text" id="job" name="job"  ><br><br>
</div>
<div>


<% 

	errorState = (Boolean)request.getAttribute("errorsAge");
	if (errorState!=null && errorState){
		out.print("<div>"+request.getAttribute("errorAge")+"</div>");
	}

%>
<label for="age">Age:</label><br>
<input type="text" id="age" name="age"  ><br><br>
</div>
<input type="submit" name="submit" value="Save"><br><br>
<button name="redirect">Display Employees</button>
</form>

</body>
</html>