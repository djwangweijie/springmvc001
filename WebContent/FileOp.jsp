<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="js/jquery-1.8.1.js"></script>
<script type="text/javascript">

    function testup(){
        var form = new FormData(document.getElementById("tf"));
        $.ajax({
            url:"uploadUrl1",
            type:"post",
            data:form,
            processData:false,
            contentType:false,
            success:function(data){
            		console.log(data)
                if(data=="ok"){
                    alert("上传成功")
                }else {
                    alert("上传失败")
                }
            }
        });
    }
 



</script>
<body>
	<!-- 多文件上传 -->
	<form   id="tf" action="uploadUrl" method="post" enctype="multipart/form-data">
		<input type="file" name="filename" /> <input type="file"
			name="filename" /> <input type="submit" value="文件上传" />
	</form>
	
	<button  onclick="testup()">点击上传</button>
	
	<a href="downloadone">下载单文件</a>
	<a href="downloadmore">下载多文件</a>
</body>
</html>