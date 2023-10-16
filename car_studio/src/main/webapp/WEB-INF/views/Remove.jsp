<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@page import="com.jspiders.car_studio.pojo.CarPOJO" %>
      <jsp:include page="NavigationBar.jsp"/>
    <%
    List<CarPOJO> cars = (List<CarPOJO>) request.getAttribute("cars");
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
#data {
	background-color: white;
	border: 1px solid black;
	width: 100%;
	border: 1px solid black;
}

#data td {
	border: 1px solid black;
	text-align: center;
}
</style>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Remove Car Details</legend>
			<form action="./remove" method="post">
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
				<input type="submit" value="REMOVE">
			</form>
		</fieldset>
		<%
		if (msg != null) {
		%>
		<h3>
			<%=msg%>
		</h3>
		<%
		}
		%>
		<%
		if (cars != null) {
		%>
		<table id="data">
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>MODEL</th>
				<th>FUEL_TYPE</th>
				<th>PRICE</th>
			</tr>
			<%
			for (CarPOJO pojo : cars) {
			%>
			<tr>
				<td><%=pojo.getId()%></td>
				<td><%=pojo.getName()%></td>
				<td><%=pojo.getModel()%></td>
				<td><%=pojo.getFuel_type()%></td>
				<td><%=pojo.getPrice()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		%>
	</div>
</body>
</html>