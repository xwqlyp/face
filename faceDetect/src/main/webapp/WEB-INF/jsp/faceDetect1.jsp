<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>


<rapid:override name="content">


	<div class="layui-upload">
		<button type="button" class="layui-btn" id="test1">上传图片</button>
		<div class="layui-upload-list">
			<img class="layui-upload-img" id="demo1">
			<p id="demoText"></p>
		</div>
	</div>

	<script>
		layui.use('upload',function() {
			var $ = layui.jquery, upload = layui.upload;
			//普通图片上传
			var uploadInst = upload.render({
				elem : '#test1',
				url : '/upload/',
				before : function(obj) {
				//预读本地文件示例，不支持ie8
					obj.preview(function(index,file, result) {
						$('#demo1').attr('src',result); //图片链接（base64）
					});
				},
				done : function(res) {
					if (res.code > 0) {
						eturn layer.msg('上传失败');
					}
											//上传成功
				},
				error : function() {
					//演示失败状态，并实现重传
					var demoText = $('#demoText');
					demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
					demoText.find('.demo-reload').on(
						'click', function() {
								uploadInst.upload();
						});
					}
				});
				//绑定原始文件域
				upload.render({
					elem : '#test20',
					url : '/upload/',
					done : function(res) {
						console.log(res)
					}
				});
			});
	</script>
</rapid:override>
<%@ include file="index.jsp"%>