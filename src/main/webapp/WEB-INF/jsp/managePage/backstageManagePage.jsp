<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台内容管理系统</title>
<link type="text/css" rel="stylesheet" href="../resources/css/style.css" />
<script type="text/javascript" src="../resources/js/jquery/jquery-2.1.0.js"></script>
<script type="text/javascript" src="../resources/js/menu.js"></script>
<script type="text/javascript" src="../resources/js/getProjectRootPath.js"></script>
</head>
<script type="text/javascript">
	/* 添加电子书 */ 
	function addEBook(obj){
		var addUrl = getRootPath()+"/eBook/intoAddEBookPage.do";
		obj.href = addUrl;
	}
	/* 显示电子书 */
	function showEBook(obj){
		var showUrl = getRootPath()+"/eBook/page/getEBooks.do"; 
		obj.href = showUrl;
	}
	/* 添加公告 */
	function showNotice(obj){
		var showNotice = getRootPath()+"/sys/showSysNotice.do";
		obj.href = showNotice;
	}
</script>
<body>
	<div class="top"></div>
	<div id="header">
		<div class="logo">在线阅读电子书后台管理系统</div>
		<div class="navigation">
			<ul>
				<li>欢迎您！</li>
				<li><a href="">admi</a></li>
				<li><a href="">修改密码</a></li>
				<li><a href="">设置</a></li>
				<li><a href="<%=basePath%>eBookLogin/loginout.do">退出</a></li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div class="left_menu">
			<ul id="nav_dot">
				<li>
					<h4 class="M1">
						<span></span>系统公告
					</h4>
					<div class="list-item none">
						<a href='javascript:void(0)' onclick="showNotice(this)" target="content">公告栏</a> 
					</div>
				</li>
				<li>
					<h4 class="M9">
						<span></span>书籍管理
					</h4>
					<div class="list-item none">
						<a href='javascript:void(0)' onclick="addEBook(this)" target="content">添加电子书</a> 
						<a href='javascript:void(0)' onclick="showEBook(this)" target="content">查看电子书</a> 
					</div>
				</li>
				<li>
					<h4 class="M3">
						<span></span>视频教学
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
						<!-- <a href=''>基础教学</a> 
						<a href=''>初级教学</a> 
						<a href=''>高级教学</a> -->
					</div>
				</li>
				<li>
					<h4 class="M4">
						<span></span>评论管理
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
					</div>
				</li>
				<li>
					<h4 class="M5">
						<span></span>调研问卷
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
					</div>
				</li>
				<li>
					<h4 class="M6">
						<span></span>数据统计
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
						<!-- <a href=''>访问人数</a> 
						<a href=''>访问地区</a> 
						<a href=''>访问书籍</a> -->
					</div>
				</li>
				<li>
					<h4 class="M7">
						<span></span>奖励管理
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
						<!-- <a href=''>上传奖励</a> --> 
					</div>
				</li>
				<li>
					<h4 class="M8">
						<span></span>字典维护
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
						<!-- <a href=''>书籍类型</a> 
						<a href=''>是否免费</a> -->
					</div>
				</li>
				<li>
					<h4 class="M10">
						<span></span>系统管理
					</h4>
					<div class="list-item none">
						<a href=''>暂未开发</a> 
						<!-- <a href=''>人员管理</a> --> 
					</div>
				</li>
			</ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
				<ul>
					<!-- <li><img src="/images/home.png"></li> -->
					<li style="margin-left: 25px;">当前位置：</li>
					<li><a href="#">系统公告</a></li>
					<li>></li>
					<li><a href="#">最新公告</a></li>
				</ul>
			</div>
			<div class="main">
				<iframe name="content" src="" width="99%" height="99%"></iframe>
			</div>
		</div>
	</div>
	<div class="bottom"></div>
	<div id="footer">
		<p>Copyright© 2017 版权所有 京ICP备05019125号-10</p>
	</div>
	<script>
		navList(12);
	</script>
</body>
</html>
