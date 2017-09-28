<%--
  Created by IntelliJ IDEA.
  User: yunshan
  Date: 17/9/28
  Time: 下午6:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="/file/uploads" enctype="multipart/form-data" method="post">
<div>

    文件1 ：<input type="file" name="file1"> </br>

    文件2：  <input type="file" name="file2"> </br>


     <input type="submit" value="submit">


</div>
</form>
</body>
</html>
