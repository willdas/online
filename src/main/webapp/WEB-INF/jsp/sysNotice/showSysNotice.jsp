<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>展示网站公告</title>
<link rel="stylesheet" href="../resources/css/bootstrap/bootstrap.css">
<style type="text/css">
.caption-class {
	width: 20%;
	height: 30%;
	margin: 0 auto;
	margin-top: 15px;
	font-size: 25px;
	color:black;
}
#addBtn{
	margin-bottom: 1%;
	margin-left: 1%;
}
</style>
</head>
<body>
	<h1 class="caption-class">网站公告</h1>
	<button type="button" id="addBtn" class="btn btn-default" onclick="addSysNotice();">添加</button>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>编号</th>
				<th>类型</th>
				<th>发布者</th>
				<th>发布日期</th>
				<th>内容</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${sysNoticeList}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.type}</td>
					<td>${item.publisher}</td>
					<td><fmt:formatDate value="${item.releaseTime}" type="date" /></td>
					<td>${item.noticeContent}</td>
					<td>
						<a href="<%=basePath%>sys/intoUpdateSysNotice/${item.id}.html">修改</a> 
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
<script src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="../resources/js/getProjectRootPath.js"></script>
<script type="text/javascript">
	/* 添加网站公告 */  
	function addSysNotice(){
		window.location.href = getRootPath()+"/sys/intoAddSysNotice.html";
	}
</script>
</html>