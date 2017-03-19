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
<title>修改电子书</title>
<!-- <link rel="stylesheet"href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<link type="text/css" rel="stylesheet" href="../../resources/css/bootstrap/bootstrap.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/bootstrap/bootstrap-select.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/jedate/jedate.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/fileInput/fileinput.css">
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
	<h3 class="h3-class">修改电子书</h3>
	<div class="div-top">
		<div class="form-horizontal" role="form">
			<div class="form-group">
				<label class="col-sm-2 control-label">编号</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookNum" type="text" name="id" value="${eBook.id}" readonly="readonly"
						placeholder="请输入编号">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">书名</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookName" type="text" name="bookName" value="${eBook.bookName}"
						placeholder="请输入书名">
				</div>
			</div>
			<div class="form-group">
				  <label class="col-sm-2 control-label">类型</label>
				  <div class="col-sm-10">
				  <select class="selectpicker show-tick form-control" data-live-search="true" id="selectType" name="type">
					      <option>请选择类型</option>
					      <option>JAVA</option>
					      <option>HTML</option>
					      <option>CSS</option>
					      <option>JavaScript</option>
					      <option>PHP</option>
				    </select>
				  </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">作者</label>
				<div class="col-sm-10">
					<input class="form-control" id="author" type="text" name="author" value="${eBook.author}"
						placeholder="本书作者">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">价格</label>
				<div class="col-sm-10">
					<input class="form-control" id="price" type="text" name="price" value="${eBook.price}"
						placeholder="本书价格">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">购买地址</label>
				<div class="col-sm-10">
					<input class="form-control" id="buyLink" type="text" name="buyLink" value="${eBook.buyLink}"
						placeholder="购买地址">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">访问地址</label>
				<div class="col-sm-10">
					<input class="form-control" id="fileUrl" type="text" name="fileUrl" value="${eBook.fileUrl}"
						placeholder="访问地址">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">日期</label>
				<div class="col-sm-10">
					<input class="form-control" id="publishDate" type="text" name="publishDate"
						placeholder="请选择出版日期">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">描述</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="describes" rows="3" name="describes" placeholder="请输入本书的简介"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button id="updateEBook" class="btn btn-default">修改</button>&emsp;
					<button class="btn btn-default" onclick="javascript:history.back(-1);">返回</button>&emsp;
					<span style="font-size:14px;color:green" id="message"></span>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="../../resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="../../resources/js/bootstrap/bootstrap.js"></script>
<script type="text/javascript" src="../../resources/js/fileInput/fileinput.js"></script>
<script type="text/javascript" src="../../resources/js/fileInput/zh.js"></script>
<script type="text/javascript" src="../../resources/js/getProjectRootPath.js"></script>
<script type="text/javascript" src="../../resources/js/jedate/jquery.jedate.js"></script>
<script type="text/javascript" src="../../resources/js/bootstrap/bootstrap-select.js"></script>
<script type="text/javascript" src="../../resources/js/eBook.js"></script>
<script type="text/javascript">
	//日期控件
	$("#publishDate").jeDate({
		skinCell : "jedategreen",
		format : "YYYY-MM-DD",
		isTime : false,
		zIndex : 100,
		minDate : "1990-01-01 00:00:00"
	});
</script>
</html>
