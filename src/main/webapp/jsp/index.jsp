<%--
  Created by IntelliJ IDEA.
  User: yunshan
  Date: 17/9/13
  Time: 下午4:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title>Title</title>
</head>
<script
        src="https://code.jquery.com/jquery-3.2.1.min.js"
        integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
        crossorigin="anonymous">

</script>
<script type="text/javascript" language="JavaScript">
    //请求json，输出是json
    function requestJson() {

        $.ajax({
            type: 'post',
            url: 'http://192.168.59.230:8080/json',
            contentType: 'application/json;charset=utf-8',//指定为json类型
            //数据格式是json串，商品信息
//            data: JSON.stringify(jsonData),
            success: function (data) {//返回json结果
                alert(data);
            }
        });
    }
</script>
<body>

<input type="button" value="1111" onclick="requestJson()">

</body>
</html>
