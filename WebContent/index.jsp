<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored ="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="hello">hello</a>
<form action="a1" method="post">
	<input type="text" name="a"/>
	<input type="text" name="b"/>
	<button>提交</button>
</form>


<form action="a2" method="post">
	<input type="text" name="pid"/>
	<input type="text" name="name"/>
	<input type="text" name="bir"/>
	<button>提交</button>
</form>


<form action="a3" method="post">
	<input type="text" name="pid"/>
	<input type="text" name="name"/>
	<input type="text" name="bir"/>
	<input type="text" name="dognames[0]"/>
	<input type="text" name="dognames[1]"/>
	<input type="text" name="dognames[2]"/>
	<button>提交</button>
</form>

<a href="a4/pname/wwj">hellrestful</a>

<a href="a6">redirect和forward</a>
${pname}   ${user}
</body>
</html>