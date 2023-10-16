<%@page import="com.jspiders.car_studio.pojo.CarPOJO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <jsp:include page="NavigationBar.jsp"/>
      <%CarPOJO pojo=(CarPOJO)request.getAttribute("car");
      String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}
</style>
</head>
<body>
<div align="center">

<fieldset>
			<legend>Search Car Details</legend>
			<form action="./search" method="post">
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
				<input type="submit" value="SEARCH">
			</form>
		</fieldset>
		<%
		if (msg != null) {
		%>
		<h3><%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (pojo != null) {
		%>
		<table>
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>MODEL</td>
				<td>FUEL_TYPE</td>
				<td>PRICE</td>
			</tr>
			<tr>
				<td><%=pojo.getId()%></td>
				<td><%=pojo.getName()%></td>
				<td><%=pojo.getModel()%></td>
				<td><%=pojo.getFuel_type()%></td>
				<td><%=pojo.getPrice()%></td>
			</tr>
		</table>
		<%
		}
		%>

</div>

</body>
</html>