<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="login_check" method="post">
		<c:if test="${param.error != NULL}">
			<p>
				Login Error!<br>
			</p>
		</c:if>
		ID : <input name="username">
		PWD : <input type="password" name="password">
		 <input type="submit" value="로그인">

	</form>
</body>
</html>