<%--
  Created by IntelliJ IDEA.
  User: 落雪听禅
  Date: 2018/9/4 0004
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<link href="css/all.css" rel="stylesheet" type="text/css">
<body>
    <div class="repair">
        <h1>设备详细信息</h1>
        <table class="repairContext" border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td>设备编号：</td>
                <td class="deviceId">${device.id}</td>
                <td>购买时间：</td>
                <td>
                    <fmt:formatDate value="${device.purchaseTime}" pattern="yyyy-MM-dd"></fmt:formatDate>
                </td>
            </tr>
            <tr>
                <td>设备名称：</td>
                <td>
                    <input type="text" value="${device.deviceName}" readonly>
                </td>
                <td>设备状态：</td>
                <td>
                    <input type="text"
                           <c:if test="${device.usage==0}">value="正常"</c:if>
                           <c:if test="${device.usage==1}">value="不正常"</c:if>
                           readonly>
                </td>
            </tr>
            <tr>
                <td>设备型号：</td>
                <td>
                    <input type="text" value="${device.deviceModel}" readonly>
                </td>
                <td>设备价值：</td>
                <td>
                    <input type="text" value="${device.devicePrice}" readonly>
                </td>
            </tr>
            <tr>
                <td>资产编码：</td>
                <td>
                    <input type="text" value="${device.assetCode}" readonly>
                </td>
                <td>保修期：</td>
                <td>
                    <input type="text" value="${device.period}年" readonly>
                </td>
            </tr>
        </table>
        <table class="repairContext2">
            <tr>
                <td class="bold">维护记录：</td>
            </tr>
            <c:forEach items="${repair}" var="repair">
                <tr>
                    <td>
                        <fmt:formatDate value="${repair.repairTime}" pattern="yyyy年MM月"></fmt:formatDate>
                        ，
                            ${repair.repairRecord}
                        。
                    </td>
                </tr>
            </c:forEach>
            <tr class="addBefore">
                <td class="bold">添加维护记录：</td>
            </tr>
            <tr>
                <td>
                    <textarea rows="10" cols="100" style="overflow: scroll" name="repairRecord"></textarea>
                </td>
            </tr>
            <tr>
                <td class="button">
                    <input type="button" onclick="submit()" value="提交">
                    <input type="button" onclick="back()" value="返回">
                </td>
            </tr>
        </table>
    </div>
</body>
<script src="js/jquery-1.8.3.js"></script>
<script src="js/all.js"></script>
</html>
