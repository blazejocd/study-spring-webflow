<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring pizza - registration</title>
</head>
<body>
	<form:form commandName="customer">
		<input
			type="hidden" 
			name="_flowExecutionKey"
			value="${flowExecutionKey}" />
			
		<b>Phone number: </b><br />
		<form:input path="phoneNumber" /><br />
		
		<b>Name: </b><br />
		<form:input path="name" /><br />
		
		<b>Address:</b><br />
		<form:input path="address" /><br />
		
		<b>City:</b><br />
		<form:input path="city" /><br />
		
		<b>State:</b><br />
		<form:input path="state" /><br />
		
		<b>Zip code:</b><br />
		<form:input path="zipCode" /><br />
		
		<input
			type="submit"
			name="_eventId_submit"
			value="Submit" />
		<input
			type="submit"
			name="_eventId_cancel"
			value="Cancel" />
	</form:form>
</body>
</html>