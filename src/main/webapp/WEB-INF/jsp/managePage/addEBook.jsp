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
	<h3 class="h3-class">添加电子书</h3>
	<div class="div-top">
		<form class="form-horizontal" role="form" action="<%=basePath%>eBook/addEBook.html" method="post" enctype="multipart/form-data">
			<div class="form-group">
				<label class="col-sm-2 control-label">编号</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookNum" type="text" name="id"
						placeholder="请输入编号">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">书名</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookName" type="text" name="bookName"
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
						      <option>JAVASCRIPPT</option>
						      <option>PHP</option>
					   </select>
				  </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">作者</label>
				<div class="col-sm-10">
					<input class="form-control" id="author" type="text" name="author"
						placeholder="本书作者">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">价格</label>
				<div class="col-sm-10">
					<input class="form-control" id="price" type="text" name="price"
						placeholder="本书价格">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">购买</label>
				<div class="col-sm-10">
					<input class="form-control" id="buyLink" type="text" name="buyLink"
						placeholder="购买地址">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">图片</label>
				<div class="col-sm-10">
					<input id="image_input" name="files" type="file" multiple class="file" accept="image/*" placeholder="上传图片">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">文件</label>
				<div class="col-sm-10">
					<input id="pdf_input" name="files" type="file" class="file" data-show-preview="false" placeholder="上传文件">
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
					<textarea class="form-control" id="describes" rows="3" name="describes"
						placeholder="请输入本书的简介"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button id="addEBook" class="btn btn-default">提交</button>&emsp;
					<input id="reset" type="button" class="btn btn-default" value="清空"/>
				</div>
			</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap.js"></script>
<script type="text/javascript" src="../resources/js/fileInput/fileinput.js"></script>
<script type="text/javascript" src="../resources/js/fileInput/zh.js"></script>
<script type="text/javascript" src="../resources/js/getProjectRootPath.js"></script>
<script type="text/javascript" src="../resources/js/jedate/jquery.jedate.js"></script>
<script type="text/javascript" src="../resources/js/bootstrap/bootstrap-select.js"></script>
<script type="text/javascript" src="../resources/js/eBook.js"></script>
<script type="text/javascript">
	//日期控件
	$("#publishDate").jeDate({
		skinCell : "jedategreen",
		format : "YYYY-MM-DD",
		isTime : false,
		zIndex : 100,
		minDate : "1990-01-01 00:00:00"
	});
	//上传文件
	$("#pdf_input").fileinput({
		language: 'zh',
		allowedFileExtensions : ['pdf'],
        showUpload : false
    });
	$("#image_input").fileinput({
		language: 'zh',
		allowedFileExtensions: ["jpg", "png", "jpeg"],
	    maxImageWidth: 100,
	    maxImageHeight: 160,
        showUpload : false
    });
</script>
</html>
