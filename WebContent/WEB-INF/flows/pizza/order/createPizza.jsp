<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Pizza - pizza</title>
</head>
<body>
	<form:form commandName="pizza">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		<form:radiobutton 
			path="size"
			label="Small"
			value="SMALL" /><br />
		<form:radiobutton 
			path="size"
			label="Medium"
			value="MEDIUM" /><br />
		<form:radiobutton 
			path="size"
			label="Large"
			value="LARGE" /><br />
		<form:radiobutton 
			path="size"
			label="Extra large"
			value="GINORMOUS" /><br />
		<b>Toppings</b>
		<form:checkboxes items="${toppingsList}" path="toppings" delimiter="<br/>" /><br/><br/>
		
		<input type="submit" name="_eventId_addPizza" value="Continue" />
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</form:form>
</body>
</html>