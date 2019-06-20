<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>
<%
	String path = request.getContextPath();
	// 获得项目完全路径（假设你的项目叫MyApp，那么获得到的地址就是 http://localhost:8080/MyApp/）: 
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>人脸</title>
<link rel="stylesheet"
	href="<%=basePath%>/statics/plugins/layui/css/layui.css" media="all">
<script src="<%=basePath%>/statics/plugins/layui/layui.js"></script>
<script type="text/javascript"
	src="<%=basePath%>/statics/js/jquery-3.4.1.js"></script>
</head>
<body class="layui-layout-body">

	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>表单集合演示</legend>
	</fieldset>

	<form class="layui-form" action="">
		<div class="layui-form-item">
			<label class="layui-form-label">名称</label>
			<div class="layui-input-block">
				<input type="text" name="title" lay-verify="title"
					autocomplete="off" placeholder="请输入上传图片名称" class="layui-input">
			</div>
		</div>
		
		 <div class="layui-form-item" pane="">
    		<label class="layui-form-label">单选框</label>
    		<div class="layui-input-block">
				<input type="radio" name="LIVE" value="生活照" title="生活照" checked="">
				<input type="radio" name="IDCARD" value="身份证芯片照" title="身份证芯片照"> 
				<input type="radio" name="WATERMARK" value="水印证件照" title="水印证件照"> 
				<input type="radio" name="CERT" value="证件照片" title="证件照片"> 
			</div>
		</div>
		

	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
		layui.use(['form', 'layedit', 'laydate'], function(){
		  var form = layui.form
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,laydate = layui.laydate;
		  
		  //日期
		  laydate.render({
		    elem: '#date'
		  });
		  laydate.render({
		    elem: '#date1'
		  });
		  
		  //创建一个编辑器
		  var editIndex = layedit.build('LAY_demo_editor');
		 
		  //自定义验证规则
		  form.verify({
		    title: function(value){
		      if(value.length < 5){
		        return '标题至少得5个字符啊';
		      }
		    }
		    ,pass: [
		      /^[\S]{6,12}$/
		      ,'密码必须6到12位，且不能出现空格'
		    ]
		    ,content: function(value){
		      layedit.sync(editIndex);
		    }
		  });
		  
		  //监听指定开关
		  form.on('switch(switchTest)', function(data){
		    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
		      offset: '6px'
		    });
		    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
		  });
		  
		  //监听提交
		  form.on('submit(demo1)', function(data){
		    layer.alert(JSON.stringify(data.field), {
		      title: '最终的提交信息'
		    })
		    return false;
		  });
		 
		  //表单初始赋值
		  form.val('example', {
		    "username": "贤心" // "name": "value"
		    ,"password": "123456"
		    ,"interest": 1
		    ,"like[write]": true //复选框选中状态
		    ,"close": true //开关状态
		    ,"sex": "女"
		    ,"desc": "我爱 layui"
		  })
		  
		  
		});
	</script>

</body>
</html>