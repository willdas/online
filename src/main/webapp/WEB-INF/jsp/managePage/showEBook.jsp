<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"> 
<title>Bootstrap 实例 - 边框表格</title>
<link rel="stylesheet" href="../resources/css/bootstrap/bootstrap.css">
<style type="text/css">
.caption-class {
	width: 20%;
	height: 30%;
	margin: 0 auto;
	margin-top: 15px;
	font-size:20px;
}
}
</style>
</head>
<body>
<table class="table table-bordered">
	<caption class="caption-class">电子书</caption>
	<thead>
		<tr>
			<th>编号</th>
			<th>书名</th>
			<th>类型</th>
			<th>作者</th>
			<th>价格</th>
			<th>出版日期</th>
			<th>描述</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${eBookList}" var="item">  
			<tr>
				<td style="display: none">${item.id}</td>
				<td>${item.id}</td>
				<td>${item.bookName}</td>
				<td>${item.type}</td>
				<td>${item.author}</td>
				<td>${item.price}</td>
				<td>${item.publishDate}</td>
				<td>${item.describes}</td>
				<td>
					<a href="<%=basePath%>bussinessIndustry/editBusineIndusry.do?busineIndusryId=${item.id}">修改</a>
					<a href="javascript:if(confirm('确定要删除吗？并且该行业下的所有字典也会被删除并且不可恢复')){window.location.href='<%=basePath%>bussinessIndustry/delBusineIndusry.do?busineIndusryId=${item.id}'}">
						删除
					</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
<script src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script src="../resources/js/bootstrap/bootstrap.js"></script>
</html>