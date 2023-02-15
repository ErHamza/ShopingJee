<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 1/26/23
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% if (request.getParameter("message")!=null){
    String message = (String)request.getParameter("message");
}
%>





<html>
<head>


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Sign up</title>







</head>


<link href="style/signupStyle.css" rel="stylesheet" type="text/css">
<body class="signup">





<br>




<c:if test="${sessionScope.name != null}">
    <c:redirect url="home"/>

</c:if>
<div class="btn btn-primary"><span><i class="fa-regular fa-arrow-up-right"></i></span> <a href="home">return to main page</a></div>
<div class="container" id="container">

    <div class="form-container sign-up-container">
        <form class="login" action="signup" method="post">
            <h1>Create Account</h1>
            <span> use your email for registration</span>

                <input type="text" placeholder="Name" name="name" />


            <input type="email" placeholder="email" name="email" />
            <input type="text" placeholder="Phone Number" name="phone_number"/>
            <input type="text" placeholder="adress" name="adress"  />
            <input type="password" placeholder="Password" name="password"/>
            <button type="submit">Sign Up</button>
        </form>
    </div>
    <div class="form-container sign-in-container">
        <form action="register" method="post" class="login">
            <h1>Sign in</h1>
            <input type="email" placeholder="Email" name="email" />
            <input type="password" placeholder="Password" name="password" />
            <c:if test="${message!=null}" >
                <div class="alert alert-danger form-control">${ message}</div>
            </c:if>

            <a href="#">Forgot your password?</a>
            <button type="submit">Sign In</button>

        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To start shoping please Log in</p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Hello, Friend!</h1>
                <p>Enter your personal details and start journey with us</p>
                <button class="ghost" id="signUp">Sign Up</button>
            </div>
        </div>
    </div>
</div>




<script src="./javascript/first.js"></script>

</body>
</html>
