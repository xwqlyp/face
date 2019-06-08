<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="content">

<body>

 
<div class="layui-upload">
  <button type="button" class="layui-btn" id="test1">上传图片</button>
  <div class="layui-upload-list">
    <img class="layui-upload-img" id="demo1">
    <p id="demoText"></p>
  </div>
</div>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use('upload', function(){
  var $ = layui.jquery
  ,upload = layui.upload;
  
  //普通图片上传
  var uploadInst = upload.render({
    elem: '#test1'
    ,url: 'upload.do'
    ,before: function(obj){
      //预读本地文件示例，不支持ie8
      obj.preview(function(){
    	  alert("before")
        $('#demo1').attr('src', result); //图片链接（base64）
      });
    }
    ,done: function(res){
    	alert(res)
	
    }
  });
  

});
</script>
</body>
</rapid:override>
<%@ include file="index.jsp"%>
