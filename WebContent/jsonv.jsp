<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	var  user = {
			uname : 'wwj',
			uage : 18
	}
	 $.ajax({
	          url: "a5",
	          type: "post",
	          dataType:'json',
	          data: user,
	          success: function (json) {
     				console.log(json)
	         }
})
})

</script>
<body>

</body>
</html>