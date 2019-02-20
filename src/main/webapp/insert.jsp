<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-01-19
  Time: 上午 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="jquery-1.12.4.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            $("[type=submit]").click(function () {
              if($("#name")=="" || $("#bm")=="" || $("#time")=="" || $("#zt")==""){
                  alert("不能为空");
                  return false;
              }
                var reg=/^(\d{4})-([0]?[1-9]|1[0-2])-(\d{2})$/;
                var riqi= $("#time").val();
                if(!reg.test(riqi)){
                    alert("日期格式不正确");
                    return false;
                }
                return true;
            })
        })
    </script>
</head>
<body>
<form action="p?type=insert" method="post">
    <table border="2">
        <tr>
            <td>考勤记录信息表</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td>所属部门</td>
            <td><input type="text" name="bm" id="bm"></td>
        </tr>
        <tr>
            <td>考勤日期</td>
            <td><input type="text" name="time" id="time"></td>
        </tr>
        <tr>
            <td>考勤状态</td>
            <td><input type="text" name="zt" id="zt"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>
</body>
</html>
