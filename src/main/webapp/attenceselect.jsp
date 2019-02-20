<%@ page import="com.sun.org.apache.bcel.internal.generic.ARETURN" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-01-19
  Time: 上午 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="p?type=select">
    <table border="2">
        <tr>
            <td><h3>考勤记录信息表</h3></td>
        </tr>
        <tr>
            <td>员工姓名</td>
            <td>所属部门</td>
            <td>考勤日期</td>
            <td>考勤状态</td>
        </tr>
        <c:forEach items="${list1}" var="a">
            <tr>
                <td>${a.EMPNAME}</td>
                <td>${a.DEPT}</td>
                <td>${a.CHKDATE}</td>
               <c:if test="${a.STATUS==1}">
                <td>正常</td>
            </c:if>
                <c:if test="${a.STATUS==2}">
                    <td>迟到</td>
                </c:if>
                <c:if test="${a.STATUS==3}">
                    <td>早退</td>
                </c:if>
                <c:if test="${a.STATUS==4}">
                    <td>休假</td>
                </c:if>
                <c:if test="${a.STATUS==5}">
                    <td>外出</td>
                </c:if>

            </tr>
        </c:forEach>
    </table>
    <a href="add.jsp">考勤登记</a>
</form>
</body>
<script type="text/javascript">
    function Turn(ss) {
        $("#one")
    }
</script>
</html>
