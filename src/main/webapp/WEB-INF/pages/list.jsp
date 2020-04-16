<%--
  Created by IntelliJ IDEA.
  User: huluxia
  Date: 2020/4/14
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<script src="../../js/jquery.min.js"></script>
<body>





<table border="1" align="center">

    <tr>
        <th>名称</th>
        <th>生日</th>
        <th>性别</th>
        <th>地址</th>
    </tr>

<c:forEach items="${userlist}" var="user">
    <tr>
    <td>${user.username}</td>
    <td><fmt:formatDate value="${user.birthday}" pattern="yyyy-MM-dd" /></td>
    <td>${user.sex}</td>
    <td>${user.address}</td>
    </tr>
</c:forEach>

</table>
</body>
</html>
