<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid"%>

<rapid:override name="content">

	<body>



		<table class="layui-hide" id="test" ></table>

		<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
		 <script>


			layui.use('table', function() {
				var table = layui.table;
				table.render({
					elem : '#test',
					url : 'tab.do',
					cellMinWidth : 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
					,
					cols : [ [ //表头
					{
						field : 'id',
						title : 'ID'
					}, {
						field : 'expression_probability',
						title : '表情置信度'
					}, {
						field : 'expression_type',
						title : '表情'
					}, {
						field : 'face_shape_probability',
						title : '脸型置信度'
					}, {
						field : 'face_shape_type',
						title : '脸型'
					}, {
						field : 'beauty',
						title : '	美丑打分'
					}, {
						field : 'gender_probability',
						title : '	性别置信度'
					}, {
						field : 'gender_probability_type',
						title : '性别'
					}, {
						field : 'race_probability',
						title : '人种置信度'
					}, {
						field : 'race_type',
						title : '人种'
					}, {
						field : 'age',
						title : '年龄'
					} ] ]
				});

			});
			

		</script> 
	</body>
</rapid:override>
<%@ include file="index.jsp"%>
