<%@page contentType="text/html;utf-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!你好你好</h2><br/>
<h3>查询结果为：</h3><br/>
<div>
    <c:forEach items="${sessionScope.list}" var="user">
        ID:${user.id}
        Name:${user.name}
        Birthday:${user.birthday}
        UerAge:${user.userAge}
        <br/>
    </c:forEach>

</div>
</body>
</html>
