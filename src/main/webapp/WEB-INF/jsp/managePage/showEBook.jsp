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
<title>展示电子书</title>
<link rel="stylesheet" href="../../resources/css/bootstrap/bootstrap.css">
<style type="text/css">
.caption-class {
	width: 20%;
	height: 30%;
	margin: 0 auto;
	margin-top: 0px;
	font-size: 25px;
	color:black;
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
				<th>日期</th>
				<th>描述</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${eBookList}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.bookName}</td>
					<td>${item.type}</td>
					<td>${item.author}</td>
					<td>${item.price}</td>
					<td><fmt:formatDate value="${item.publishDate}" type="date" /></td>
					<td>${item.describes}</td>
					<td>
						<a href="<%=basePath%>eBook/intoUpdateEBookPage/${item.id}.html">修改</a> 
						<a href="javascript:if(confirm('确定要删除吗？删除后不可恢复')){window.location.href='<%=basePath%>eBook/delEBook/${item.id}.html'}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<ul class="pagination" id="pagination"></ul>
</body>
<script src="../../resources/js/jquery/jquery-2.1.0.js"></script>
<script src="../../resources/js/jqPaginator/jqPaginator.js"></script>
<script type="text/javascript">
$(function(){
	/* 分页 */
	$.jqPaginator('#pagination',{ 
        totalPages:   <%=request.getAttribute("totalPages")%>,
        visiblePages: <%=request.getAttribute("visiblePages")%>,
        currentPage:  <%=request.getAttribute("pageNum")%>,
        first: '<li class="first"><a id="firstPage" href="<%=basePath%>eBook/page/getEBooks?pageNum=<%=request.getAttribute("firstPage")%>">首页</a></li>',
        prev: '<li class="prev"><a id="upPage" href="<%=basePath%>eBook/page/getEBooks?pageNum=<%=request.getAttribute("upPage")%>">上一页</a></li>', 
        next: '<li class="next"><a id="nextPage" href="<%=basePath%>eBook/page/getEBooks?pageNum=<%=request.getAttribute("nextPage")%>">下一页</a></li>',
        last: '<li class="last"><a id="lastPage" href="<%=basePath%>eBook/page/getEBooks?pageNum=<%=request.getAttribute("lastPage")%>">最后一页</a></li>',
        page: '<li class="page"><a href="<%=basePath%>eBook/page/getEBooks?pageNum={{page}}">{{page}}</a></li>',
        onPageChange: function (num, type) {
        	if(<%=request.getAttribute("nextPage")%> == 0){
        		$("#nextPage").attr('href','javascript:;');
        		$("#lastPage").attr('href','javascript:;');
        	}
        	if(<%=request.getAttribute("upPage")%> == 0 || <%=request.getAttribute("pageNum")%> == 1){
        		$("#upPage").attr('href','javascript:;');
        		$("#firstPage").attr('href','javascript:;');
        	}
        }
    });
});
</script>
</html>