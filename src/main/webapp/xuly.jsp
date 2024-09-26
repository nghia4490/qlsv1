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
<script type="text/javascript">

function doDelete(id) {
	if(confirm("ban co xac nhan xoa thanh vien co id="+id)){
		window.location="delete?id="+id;
	}
	
}


</script>
<h1 style="text-align: center;">Quan ly thanh vien</h1>
<h2>Bn muon them moi thanh vien nhan vao <a href="them.jsp">Day</a></h2>

<table border="1px">

<tr>
<th>Id</th>
<th>ma</th>
<th>ten</th>
<th>email</th>
<th>date</th>
<th>dia chi</th>
<th>Lua chon</th>


</tr>

<c:forEach items="${applicationScope.data}" var="tv">
<c:set var="id" value="${tv.id }"></c:set>
<tr>
<td>  ${id }  </td>
<td>   ${tv.ma }  </td>
<td>  ${tv.ten }   </td>
<td>  ${tv.email }   </td>
<td>    ${tv.date } </td>
<td>   ${tv.dc }  </td>
<td> 
<a href="update?id=${id }">Update</a> |
<a href="#" onclick="doDelete('${id}')">delete</a>

   </td>
</tr>
</c:forEach>





</table>






</body>
</html>