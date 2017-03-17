<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加电子书</title>
<!-- <link rel="stylesheet"href="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<link rel="stylesheet" href="../resources/css/bootstrap/bootstrap.css">
<link rel="stylesheet" href="../resources/css/bootstrap/bootstrap-select.css">
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
		<div class="form-horizontal" role="form">
			<div class="form-group">
				<label class="col-sm-2 control-label">编号</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookNum" type="text"
						placeholder="请输入编号">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">书名</label>
				<div class="col-sm-10">
					<input class="form-control" id="bookName" type="text"
						placeholder="请输入书名">
				</div>
			</div>
			<div class="form-group">
				  <label for="basic" class="col-lg-2 control-label">类型</label>
				  <div class="col-lg-10">
				    <select id="selectType" class="selectpicker show-tick form-control" data-live-search="true">
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
					<input class="form-control" id="author" type="text"
						placeholder="本书作者">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">价格</label>
				<div class="col-sm-10">
					<input class="form-control" id="price" type="text"
						placeholder="本书价格">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">上传文件</label>
				<div class="col-sm-10">
					<input id="file_input" type="file" data-show-preview="false">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">出版日期</label>
				<div class="col-sm-10">
					<input class="form-control" id="publishDate" type="text"
						placeholder="请选择出版日期">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">描述</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="describes" rows="3"
						placeholder="请输入本书的简介"></textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button id="addEBook" class="btn btn-default">提交</button>
					&emsp;
					<button id="reset" class="btn btn-default">清空</button>
				</div>
			</div>
		</div>
	</div>
</body>
<script src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script src="../resources/js/bootstrap/bootstrap.js"></script>
<script src="../resources/js/fileInput/fileinput.js"></script>
<script src="../resources/js/fileInput/zh.js"></script>
<script type="text/javascript" src="../resources/js/getProjectRootPath.js"></script>
<script type="text/javascript" src="../resources/js/jedate/jquery.jedate.js"></script>
<script src="../resources/js/bootstrap/bootstrap-select.js"></script>
<script src="../resources/js/eBook.js"></script>
<script type="text/javascript">
	//日期控件
	$("#publishDate").jeDate({
		skinCell : "jedategreen",
		format : "YYYY-MM-DD",
		isTime : false,
		zIndex : 100,
		minDate : "1990-01-01 00:00:00"
	});
	//文件上传
	$("#file_input").fileinput({
		language: 'zh',
        uploadUrl: '#',
        showUpload : false
    });
</script>
</html>
