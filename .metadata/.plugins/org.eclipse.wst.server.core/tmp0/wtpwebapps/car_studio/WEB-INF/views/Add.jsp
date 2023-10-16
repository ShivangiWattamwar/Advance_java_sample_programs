<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List" %>
     <%@page import="com.jspiders.car_studio.pojo.CarPOJO" %>
        <%
    List<CarPOJO> cars = (List<CarPOJO>) request.getAttribute("cars");
	String msg= (String) request.getAttribute("msg");
%>
   
      <jsp:include page="NavigationBar.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	margin-top: 10px;
}

form table {
	margin: auto;
	width: 100%;
}

tr {
	text-align: center;
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
			<legend>Add Car Details</legend>
			<form action="./add" method="post">
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Model</td>
						<td><input type="text" name="model"></td>
					</tr>
					<tr>
						<td>Fuel_Type</td>
						<td><input type="text" name="fuel_type"></td>
					</tr>
					<tr>
						<td>Price</td>
						<td><input type="price" name="price"></td>
					</tr>
				</table>
				<input type="submit" value="ADD">
			</form>
		</fieldset>
		
		<%
		if(msg !=null) {
		%>
		<h2><%=msg %></h2>
		<%} %>
		
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