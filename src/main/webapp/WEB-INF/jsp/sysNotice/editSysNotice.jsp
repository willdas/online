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
<link type="text/css" rel="stylesheet" href="../../resources/css/bootstrap/bootstrap.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/bootstrap/bootstrap-select.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/jedate/jedate.css">
<link type="text/css" rel="stylesheet" href="../../resources/css/fileInput/fileinput.css">
<script type="text/javascript" src="../../resources/js/jquery/jquery-2.1.0.js"></script>
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
<script type="text/javascript">
	$(function(){
		$("#selectType").val("${sysNotice.type}");
		
	});
	
</script>
</head>
<body>
	<h3 class="h3-class">修改公告</h3>
	<div class="div-top">
		<form action="<%=basePath%>sys/updateSysNotice.html" method="post">
			<div class="form-horizontal" role="form">
			<div class="form-group">
				<label class="col-sm-2 control-label">编号</label>
				<div class="col-sm-10">
					<input class="form-control" id="id" type="text" name="id" value="${sysNotice.id}" readonly="readonly">
				</div>
			</div>
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
				<label class="col-sm-2 control-label">内容</label>
				<div class="col-sm-10">
					<textarea class="form-control" id="noticeContent" rows="10" name="noticeContent" placeholder="请输入本站公告">${sysNotice.noticeContent}</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button id="updateSysNatice" class="btn btn-default">修改</button>&emsp;
					<button class="btn btn-default" onclick="javascript:history.back(-1);">返回</button>&emsp;
					<span style="font-size:14px;color:green" id="message"></span>
				</div>
			</div>
		</div>
		</form>
	</div>
</body>
<script type="text/javascript" src="../../resources/js/bootstrap/bootstrap.js"></script>
<script type="text/javascript" src="../../resources/js/bootstrap/bootstrap-select.js"></script>
<%-- <script type="text/javascript">
	$(function(){
		$("#updateSysNatice").click(function(){
			$.ajax({
				type : "POST",
				url : "<%=basePath%>sys/updateSysNotice.do",
				data : {
					"id" : $("#id").val(),
					"type":$("#selectType").val(),
					"publisher":$("#publisher").val(),
					"releaseTime":$("#releaseTime").val(),
					"noticeContent":$("#noticeContent").val()
				},
				success : function(data){
					if(data == 1){
						$("#message").html("修改成功!");
					}else{
						$("#message").html("修改失败!");
					}
				},
				error:function(errorData){
					console.log("状态码=="+errorData);
					alert("网络连接失败");
				}
			});
		});
		
	});
</script> --%>
</html>
