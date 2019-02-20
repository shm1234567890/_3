<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-01-19
  Time: 下午 3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="m?type=select">
        <table border="2">
            <tr>
                <td>俱乐部会员信息</td>
            </tr>
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>年龄</td>
                <td>家庭住址</td>
                <td>Email</td>
            </tr>
            <c:forEach items="${list}" var="q">
            <tr>
                <td><a href="update?type=sel&id=${q.mid}">${q.mid}</a></td>
                <td>${q.mname}</td>
                <td>${q.mgender}</td>
                <td>${q.mage}</td>
                <td>${q.maddress}</td>
                <td>${q.memail}</td>
            </tr>
            </c:forEach>
        </table>
    </form>
</body>
</html>
