<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta charset="UTF-8">
<link href="css/bootstrap.css" rel="stylesheet">
<script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<script>
    $(document).ready(function() {
        $("#imageFile").change(function() {
            var fileReader = new FileReader();
            fileReader.onload = function(e) {
                $("#previewImage").append("<span class='center-block text-success'>图像预览</span><image class='img-thumbnail' style='max-width:400px;height:auto;' src="+e.target.result+"/>");
            }
            var imageFile = this.files[0];
            fileReader.readAsDataURL(imageFile);
        });
        $("#send")
        .click(
                function() {
                        var xhr=new XMLHttpRequest();
                        xhr.open("post","fileUpload");
                        xhr.onreadystatechange = function() {
                            if (xhr.readyState == 4) {
                                if(xhr.status == 200){
                                alert("图片上传成功"); 
                            }else{
                                alert("图片上传失败")
                            }
                            }
                        };
                    var imageFile = $("#imageFile")[0].files[0];
                    var username=$("#username").val();
                    var myForm = new FormData();
                    myForm.append("username",username);
                    myForm.append("imageFile", imageFile);
                    xhr.send(myForm);
                });

    });
</script>
</head>
<body>
	<div class="container">
		<div class="panel">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">图像上传和预览测试</h3>
				</div>
				<div class="panel-body">
					<p id="previewImage"></p>
					<form action="fileUpload" enctype="multipart/form-data"
						method="post" class="form-inline">
						<div class="form-group">
							<label for="username">图片名称</label> <input type="text"
								name="photoName" id="pictureFile"  />
						</div>
						<div class="form-group">
							<label for="imageFile">上传图片</label>
						</div>
						<div class="form-group">
							<input type="file" id="imageFile" name="imageFile"
								accept="image/jpeg" />
						</div>

						<button type="button" id="send" class="btn btn-primary">上传</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>