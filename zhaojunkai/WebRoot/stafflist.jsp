<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>入场考试</title>
	
  </head>
  
  <body>
  <h1>考试</h1>
     	<table border="1">
		<tr>
			<th>ENAME</th>
			<th>JOB</th>
			<th>SAL</th>
			<th>DNAME</th>
			<th>LOC</th>
		</tr>
		<c:forEach var="staff" items="${staffs }">
			<tr>
				<td>${staff.ename }</td>
				<td>${staff.job }</td>
				<td>${staff.sal }</td>
				<td>${staff.dname }</td>
				<td>${staff.loc }</td>
			</tr>
		</c:forEach>
		  		<tr>
  			<td colspan="5">
  				当前页：${page }|
  				<a href="staffController_pager?page=${page-1 }&&rows=5">上一页</a>|
  				<a href="staffController_pager?page=${page+1 }&&rows=5">下一页</a>|
  				总共：${total }条记录
  				
  			</td>
  		</tr>
	</table>	
  </body>
 
</html>
