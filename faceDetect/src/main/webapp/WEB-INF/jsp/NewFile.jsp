<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
String path = request.getContextPath(); 
// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）: 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="<%=basePath%>/statics/plugins/layui/css/layui.css">
<link rel="stylesheet" href="<%=basePath%>/statics/plugins/layui/css/admin.css">
<link rel="icon" href="./favicon.ico">   


<title>管理后台</title>
</head>

<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header custom-header">

			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item slide-sidebar" lay-unselect><a
					href="javascript:;" class="icon-font"><i class="ai ai-menufold"></i></a>
				</li>
			</ul>

			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;">BieJun</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">帮助中心</a>
						</dd>
						<dd>
							<a href="login.html">退出</a>
						</dd>
					</dl></li>
			</ul>
		</div>

		<div class="layui-side custom-admin">
			<div class="layui-side-scroll">

				<div class="custom-logo">
					<img
						src="${pageContext.request.contextPath}/statics/plugins/layui/assets/images/logo.png"
						alt="" />
					<h1>Admin Pro</h1>
				</div>
				<ul id="Nav" class="layui-nav layui-nav-tree">
					<li class="layui-nav-item"><a href="javascript:;"> <i
							class="layui-icon">&#xe609;</i> <em>主页</em>
					</a>
						<dl class="layui-nav-child">
							<dd>
								<a
									href="${pageContext.request.contextPath}/statics/plugins/layui/views/console.html">控制台</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"> <i
							class="layui-icon">&#xe857;</i> <em>组件</em>
					</a>
						<dl class="layui-nav-child">
							<dd>
								<a
									href="${pageContext.request.contextPath}/statics/plugins/layui/views/form.html">表单</a>
							</dd>
							<dd>
								<a href="javascript:;">页面</a>
								<dl class="layui-nav-child">
									<dd>
										<a href="login.html">登录页</a>
									</dd>
								</dl>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"> <i
							class="layui-icon">&#xe612;</i> <em>用户</em>
					</a>
						<dl class="layui-nav-child">
							<dd>
								<a
									href="${pageContext.request.contextPath}/statics/plugins/layui/views/users.html">用户组</a>
							</dd>
							<dd>
								<a
									href="${pageContext.request.contextPath}/statics/plugins/layui/views/operaterule.html">权限配置</a>
							</dd>
						</dl></li>
				</ul>

			</div>
		</div>

		<div class="layui-body">
			<div class="layui-tab app-container" lay-allowClose="true"
				lay-filter="tabs">
				<ul id="appTabs" class="layui-tab-title custom-tab"></ul>
				<div id="appTabPage" class="layui-tab-content"></div>
			</div>
		</div>

		<div class="layui-footer">
			<p>
				© 2018 更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
			</p>
		</div>

		<div class="mobile-mask"></div>
	</div>
  

</body>
	

<script src="<%=basePath%>/statics/plugins/layui/assets/layui.js"></script>
<script src="<%=basePath%>/statics/plugins/layui/index.js" data-main="home"></script>



</html>