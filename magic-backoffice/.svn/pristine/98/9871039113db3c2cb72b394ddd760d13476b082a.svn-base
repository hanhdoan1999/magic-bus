<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>sample運用管理者</h1>
<table>
	<tr>
		<th>サンプルID</th>
		<th>サンプル名</th>
	</tr>
	<c:forEach items="${sampleDtos}" var="dto">
	<tr>
		<td><c:out value="${dto.sampleId}"/></td>
		<td><c:out value="${dto.sampleName}"/></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>