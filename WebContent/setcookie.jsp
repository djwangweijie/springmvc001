<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
      <script type="text/javascript">
      //(path)必须要填写，因为JS的默认路径是当前页，如果不填，此cookie只在当前页面生效！~
          document.cookie="name=wwj;path=/"  
          document.cookie="age=32;path=/"     
      </script>
  </head>
  <body>
    <a href="testCookie">查看Cookie</a>
  </body>
</html>