<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="content">

	<style>
	#demo1 {
		margin-left: 113px;
		border: solid;
		width: 200px;
		height: 200px
	}
	#test1 {


		margin-left: 113px;
	
	}
	
	
</style>
	<body>

		<div class="layui-form">
			<label class="layui-form-label">名称输入框</label>
			<div class="layui-input-block">
				<input type="text" name="imgName" required lay-verify="required"
					placeholder="请输入照片名称" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">人脸类型</label>
			<div class="layui-input-block">
				<input type="radio" name="face_type" value="1" title="生活照" checked=""> 
				<input type="radio" name="face_type" value="2" title="身份证芯片照"> 
				<input type="radio" name="face_type" value="3" title="水印证件照"> 
				<input type="radio" name="face_type" value="4" title="证件照片">
			</div>
			<div class="layui-upload">
			<div class="layui-upload-list">
				<img class="layui-upload-img" id="demo1">
				<p id="demoText" style="display: none"></p>
			</div>
			<button type="button" class="layui-btn" id="test1">上传图片</button>
		</div>
		</div>
		




		<script>
			
			layui.use('upload',function() {
				var $ = layui.jquery, upload = layui.upload;
				//普通图片上传
				var uploadInst = upload.render({
					elem : '#test1',
					url : 'upload.do',
					data : {
						face_type :function(){
							if ($("input[name='face_type']:checked").val()!=null) {
								return $("input[name='face_type']:checked").val();
							}
						   return null; 
						  },
						imgName :function(){
						    return $("input[name='imgName']").val();
						  }
					},
					before : function(obj) {
						//预读本地文件示例，不支持ie8
						obj.preview(function(index,file, result) {
							$('#demo1').attr('src',result); //图片链接（base64）
						});
					},done : function(res) {
						if (res.code==0) {
							alert(res.msg);
						}
					//上传成功
					},error : function() {
					//演示失败状态，并实现重传
						var demoText = $('#demoText');
						demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
						demoText.find('.demo-reload').on('click',function() {
						uploadInst.upload();
						});
					}
				});
			});
			
			layui.use(['form', 'layedit', 'laydate'], function(){
				  var form = layui.form
				  ,layer = layui.layer
				  ,layedit = layui.layedit
				  ,laydate = layui.laydate;
				  
				 
				  
				});
		</script>
	</body>
</rapid:override>
<%@ include file="index.jsp"%>
