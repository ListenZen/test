<%--
  Created by IntelliJ IDEA.
  User: 落雪听禅
  Date: 2018/9/4 0004
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<link href="css/all.css" rel="stylesheet" type="text/css">
<body>
    <form action="devices.do" method="post">
        <div>
            设备名称：
            <input type="text" name="deviceName" value="${deviceName}">
            <input type="submit" value="查询">
        </div>
        <div class="context">
            <h2>设备管理系统</h2>
            <table class="devices" border="1" cellpadding="0" cellspacing="0">
                <tr>
                    <td>设备编号</td>
                    <td>设备名称</td>
                    <td>设备型号</td>
                    <td>资产编码</td>
                    <td>购买时间</td>
                    <td>设备状态</td>
                    <td>设备价值</td>
                </tr>
                <c:forEach items="${devices}" var="devices">
                    <tr>
                        <td>${devices.id}</td>
                        <td><a href="/repair.do?id=${devices.id}">${devices.deviceName}</a></td>
                        <td>${devices.deviceModel}</td>
                        <td>${devices.assetCode}</td>
                        <td>
                            <fmt:formatDate value="${devices.purchaseTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                        </td>
                        <td>
                            <c:if test="${devices.usage==0}">正常</c:if>
                            <c:if test="${devices.usage==1}">不正常</c:if>
                        </td>
                        <td>${devices.devicePrice}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <div>
            <input type="hidden" name="pageNo" value="${pageBean.pageNo}">
            <input type="hidden" name="pageTotal" value="${pageBean.pageTotal}">
            <a href="#" onclick="firstPage(1)">首页</a>
            <a href="#" onclick="pervPage(${pageBean.pageNo})">上一页</a>
            <a href="#" onclick="nextPage(${pageBean.pageNo})">下一页</a>
            <a href="#" onclick="lastPage(${pageBean.pageTotal})">末页</a>
            第
            ${pageBean.pageNo}
            页/共
            ${pageBean.pageTotal}
            页
        </div>
    </form>
</body>
<script src="js/jquery-1.8.3.js"></script>
<script src="js/all.js"></script>
</html>
