<%@page import="com.jspiders.car_studio.pojo.CarPOJO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavigationBar.jsp" />
<%
List<CarPOJO> cars = (List<CarPOJO>) request.getAttribute("cars");
CarPOJO pojo = (CarPOJO) request.getAttribute("car");
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		<%
		if (pojo == null) {
		%>
		<fieldset>
			<legend>Select Car to Update</legend>
			<form action="./update" method="post">
				<table>
					<tr>
						<td>Enter ID</td>
						<td><input type="text" name="id"></td>
					</tr>
				</table>
				<input type="submit" value="SELECT">
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
			for (CarPOJO student : cars) {
			%>
			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getModel()%></td>
				<td><%=student.getFuel_type()%></td>
				<td><%=student.getPrice()%></td>
			</tr>
			<%
			}
			%>
		</table>
		<%
		}
		} else {
		%>
		<fieldset>
			<legend>Update car</legend>
			<form action="./updateCar" method="post">
				<table>
					<tr>
						<td>ID</td>
						<td><%=pojo.getId()%></td>
						<td><input type="text" name="id" value="<%=pojo.getId()%>" hidden="true"></td>
					</tr>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"
							value="<%=pojo.getName()%>"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="text" name="model"
							value="<%=pojo.getModel()%>"></td>
					</tr>
					<tr>
						<td>Contact</td>
						<td><input type="text" name="fuel_type"
							value="<%=pojo.getFuel_type()%>"></td>
					</tr>
					<tr>
						<td>Address</td>
						<td><input type="text" name="price"
							value="<%=pojo.getPrice()%>"></td>
					</tr>
				</table>
				<input type="submit" value="UPDATE">
			</form>
		</fieldset>
		<%
		}
		%>
	</div>
</body>
</html>