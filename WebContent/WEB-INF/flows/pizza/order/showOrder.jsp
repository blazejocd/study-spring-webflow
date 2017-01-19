<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Spring Pizza - your order</title>
</head>
<body>
	<h2>Your Order</h2>
	<h3>Delivery address:</h3>
	<b>Name: ${order.customer.name}</b><br />
	<b>Address: ${order.customer.city}, ${order.customer.state},
	${order.customer.zipCode}</b><br />
	<b>Phone number: ${order.customer.phoneNumber}</b><br />
	<h3>Order total: </h3>
	<c:if test="${fn:length(order.pizzas) eq 0}">
		<b>Order empty.</b>
	</c:if>
	<c:forEach items="${order.pizzas }" var="pizza">
		<li>${pizza.size }:
			<c:forEach items="${order.toppings}" var="topping">
				<c:out value="${topping }" />
			</c:forEach>
		</li>
	</c:forEach>
	<form:form>
		<input type="hidden" name="_flowExecutionKey"
			value="${flowExecutionKey }" />
		<input type="submit" name="_ebentId_createPizza" value="Create Pizza" />
		<c:if test="${fn:length(order.pizzas) gt 0 }">
			<input type="submit" name="_eventId_checkout" value="Checkout" />
		</c:if>
		<input type="submit" name="_eventId_cancel" value="Cancel" />
	</form:form>
</body>
</html>