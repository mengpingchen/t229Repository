<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table width="800">
	    <tr>
	        <td>ID</td>
	        <td>名称</td>
	        <td>密码</td>
	        <td>EMAIL</td>
	    </tr>
	    <c:forEach items="${userList}" var="u">
	       <tr>
		        <td>${u.id }</td>
		        <td>${u.userName}</td>
		        <td>${u.userPassword }</td>
		        <td>${u.email}</td>
		    </tr>
	    </c:forEach>
	</table>
</body>
</html>