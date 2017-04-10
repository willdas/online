<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加电子书</title>
<!-- <link rel="stylesheet"href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<link type="text/css" rel="stylesheet" href="../resources/css/bootstrap/bootstrap.css">
<link type="text/css" rel="stylesheet" href="../resources/css/bootstrap/bootstrap-select.css">
<link type="text/css" rel="stylesheet" href="../resources/css/jedate/jedate.css">
<link type="text/css" rel="stylesheet" href="../resources/css/fileInput/fileinput.css">
<style type="text/css">
.h3-class {
	width: 20%;
	height: 30%;
	margin: 0 auto;
	margin-top: 15px;
}
.div-top {
	margin-top: 10px;
	margin-left: 15%;
	margin-right: 0%;
}
</style>
</head>
<body>
	<h3 class="h3-class">添加网站公告</h3>
	<div class="div-top">
		<form class="form-horizontal" role="form" action="<%=basePath%>sys/addSysNotice.do" method="post">
			<div class="form-group">
				  <label class="col-sm-2 control-label">类型</label>
				  <div class="col-sm-10">
					  <select class="selectpicker show-tick form-control" data-live-search="true" id="selectType" name="type">
						      <option>请选择类型</option>
						      <option>普通</option>
						      <option>紧急</option>
					 </select>
				  </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">描述</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="noticeContent" rows="15" name="noticeContent" placeholder="请输入公告内容"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button id="addSysNotice" class="btn btn-default">提交</button>&emsp;
					<input id="reset" type="button" class="btn btn-default" value="清空"/>&emsp;
					<button class="btn btn-default" onclick="javascript:history.back(-1);">返回</button>&emsp;
				</div>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap.js"></script>
<script type="text/javascript" src="../resources/js/getProjectRootPath.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap-select.js"></script>
</html>
