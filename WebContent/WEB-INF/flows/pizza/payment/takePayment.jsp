<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Pizza - payment</title>
</head>
<body>
	<script type="text/javascript">
		function hideCreditCardField()
		{
			var ccNumberStyle = document.paymentForm.creditCardNumber.style;
			ccNumberStyle.visibility = "hidden";
		}
	
		function showCreditCardField()
		{
			var ccNumberStyle = document.paymentForm.creditCardNumber.style;
			ccNumberStyle.visibility = "visible";
		}
	</script>
	
	<form:form commandName="paymentDetails" name="paymentForm">
		<input 
			type="hidden" 
			name="_flowExecutionKey" 
			value="${flowExecutionKey}" />
		
		<form:radiobutton
			value="CASH"
			label="Cash"
			path="paymentType"
			onclick="hideCreditCardField()" /><br />
	
		<form:radiobutton
			value="CHECK"
			label="Check"
			path="paymentType"
			onclick="hideCreditCardField()" /><br />

		<form:radiobutton
			value="CREDIT_CARD"
			label="Credit Card"
			path="paymentType"
			onclick="showCreditCardField()" /><br />

		<form:input 
			path="creditCardNumber"
			cssStyle="visibility:hidden;" /><br/><br/>
		
		<input type="submit" name="_eventId_paymentSubmitted" value="Pay" />
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</form:form>
</body>
</html>