<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 1/27/23
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
<head>
    <title>success</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<c:if test="${!empty sessionScope.name && !empty sessionScope.email}">

    <p> vous etes ${sessionScope.name}</p>
        <p> your email is ${sessionScope.email}</p>


        <a href="signup"> logout</a>




</c:if>
<h1>done!</h1>
<h2 style="text-align: center ; color : red">Welcome USER</h2>


<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
