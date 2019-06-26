<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data"
		action="${pageContext.request.contextPath}/addFace.do">
		<input type="text" name="photoName" id="pictureFile" value="图片名称" />
		<input type="file" name="pictureFile" id="pictureFile" value="请选择图片" />
		<input type="submit" name="submit" id="pictureFile" value="提交" />
	</form>
</body>

</html>