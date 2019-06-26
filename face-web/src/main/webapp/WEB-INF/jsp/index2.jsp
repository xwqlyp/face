<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="content">

	<body>


		<div class="layui-upload">
			<div class="layui-upload-list">
				<img class="layui-upload-img" id="demo1" width="350" height="400">
				<p id="demoText"></p>
			</div>
			<div class="layui-form-item">
    			<label class="layui-form-label">名称输入框</label>
    			<div class="layui-input-block">
      			<input type="text" name="title" required  lay-verify="required" placeholder="请输入照片名称" autocomplete="off" class="layui-input">
    			</div>
    		</div>
			<button type="button" class="layui-btn" id="test1">上传图片</button>
		</div>

 
<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">名称输入框</label>
    <div class="layui-input-block">
      	<input type="text" name="title" required  lay-verify="required" placeholder="请输入照片名称" autocomplete="off" class="layui-input">
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">人脸类型</label>
    <div class="layui-input-block">
      <input type="radio" name="face_type" value="LIVE" title="生活照" checked="">
      <input type="radio" name="face_type" value="IDCARD" title="身份证芯片照">
      <input type="radio" name="face_type" value="WATERMARK" title="水印证件照">
      <input type="radio" name="face_type" value="CERT" title="证件照片">
    </div>
  </div>
  
    <div class="layui-form-item">
    <label class="layui-form-label">图片类型</label>
    <div class="layui-input-block">
      <input type="radio" name="image_type" value="BASE64" title="图片的base64值" checked="">
      <input type="radio" name="image_type" value="URL" title="URL地址">
      <input type="radio" name="image_type" value="FACE_TOKEN" title="唯一标识">
    </div>
  </div>
 <div class="layui-form-item">
    <label class="layui-form-label">复选框</label>
    <div class="layui-input-block">
      <input type="checkbox" name="age" title="年龄 ">
      <input type="checkbox" name="beauty" title="美丑打分">
      <input type="checkbox" name="expression" title="表情">
      <input type="checkbox" name="face_shape" title="脸型">
      <input type="checkbox" name="gender" title="性别">
      <input type="checkbox" name="glasses" title="是否带眼镜">
      <input type="checkbox" name="landmark" title="关键点位置">
      <input type="checkbox" name="race" title="人种">
      <input type="checkbox" name="quality" title="人脸质量信息">
      <input type="checkbox" name="eye_status" title="双眼状态">
      <input type="checkbox" name="emotion" title="情绪">
      <input type="checkbox" name="face_type" title="真实人脸/卡通人脸">
    </div>
  </div>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>



          
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  

  
});
</script>

		<script>
			
			layui.use('upload',function() {
				var $ = layui.jquery, upload = layui.upload;
				//普通图片上传
				var uploadInst = upload.render({
					elem : '#test1',
					url : 'upload.do',
					before : function(obj) {
						//预读本地文件示例，不支持ie8
						obj.preview(function(index,file, result) {
							$('#demo1').attr('src',result); //图片链接（base64）
						});
					},done : function(res) {
						alert(res.msg);
						$("#demoText").text(res.data["src"]);
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
</rapid:override>
<%@ include file="index.jsp"%>
