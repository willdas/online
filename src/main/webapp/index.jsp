<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>在线阅读电子书</title>
<link href="./resources/css/index/style.css" rel="stylesheet" type="text/css" media="all"/>
<link href="./resources/css/index/font.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="book" />
</head>
<script type="text/javascript">document.oncontextmenu = function() { return false;}</script>
<body>
<div class="search">
	<div class="s-bar">
	  <form id="from" method="post">
		<input type="text" value="请输入你使用的语言 例如:JAVA" id="occupationName" name="occupationName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '请输入你使用的语言 例如:JAVA';}">
		<input type="button" onclick="enter()" value="进入"/>
	  </form>
	 </div>
	<span id="occupationName_error" style="color: red;"></span>
	<p>目前含有以下语言的电子书：JAVA PHP HTML CSS JavaScript Python SQL C</p>
</div>
<div class="copyright">
	 <p>2017 &copy by onlineRead.net</p>
</div>	
</body>
<script type="text/javascript" src="./resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="./resources/js/commons/common.js"></script>
<script type="text/javascript" src="./resources/js/index/index.js"></script>
</html>