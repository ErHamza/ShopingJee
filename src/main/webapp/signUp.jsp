<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 1/26/23
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Sign up</title>

    <link href="./style/first.css" rel="stylesheet" type="text/css">



</head>
<body>
<div class="container" id="container">
    <div class="form-container sign-up-container">
        <form action="signup" method="post">
            <h1>Create Account</h1>
            <span>or use your email for registration</span>
            <div style="display: flex;column-gap: 4px ">
                <input type="text" placeholder="First Name" name="name"
                       style=" margin-left: 0.4em" />
                <input type="text" placeholder="Seconde Name" name="firstName" />

            </div>

            <input type="email" placeholder="email" name="email" />
            <input type="text" placeholder="Phone Number" name="phone_number"/>
            <input type="text" placeholder="adress" name="adress"  />
            <input type="password" placeholder="Password" name="password"/>
            <button type="submit">Sign Up</button>
        </form>
    </div>
    <div class="form-container sign-in-container">
        <form action="signUp" method="post">
            <h1>Sign in</h1>
<%--            <div class="social-container">--%>
<%--                <a href="#" class="social"><i class="fab fa-facebook-f"></i></a>--%>
<%--                <a href="#" class="social"><i class="fab fa-google-plus-g"></i></a>--%>
<%--                <a href="#" class="social"><i class="fab fa-linkedin-in"></i></a>--%>
<%--            </div>--%>
<%--            <span>or use your account</span>--%>
            <input type="email" placeholder="Email" />
            <input type="password" placeholder="Password" name="password" />
            <a href="#">Forgot your password?</a>
            <button>Sign In</button>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back!</h1>
                <p>To keep connected with us please login with your personal info</p>
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
