<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Sua thong tin cho thanh vien</h1>

<form action="update" method="post">
<c:forEach var="tv" items="${requestScope.data_new }">
id:<input type="text" name="id" value="${tv.id }" > <br>
ma:<input type="text" name="ma" value="${tv.ma }"> <br>
ten:<input type="text" name="ten" value="${tv.ten }"> <br>
eamil:<input type="text" name="email" value="${tv.email }"> <br>
date:<input type="text" name="date" value="${tv.date }"> <br>
dia chi:<input type="text" name="dc" value="${tv.dc }"> <br>
</c:forEach>
<br>
<input type ="submit" value="them">







</form>


</body>
</html>