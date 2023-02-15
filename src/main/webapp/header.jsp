
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>header</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">

    <style>
        body {
            background-color: #b0e0e6;
            font-family: 'Arial', sans-serif;
            font-weight: 600;
        }

        .nav-cart {
            float: right;
        }
    </style>

</head>

<body>

<%
    String items = request.getParameter("items");
%>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">e-commerce</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav" >
                <li class="nav-item">
                    <a class="nav-link" href="home"></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="signup">Authentifier</a>
                </li>

                <li class="nav-item nav-cart">
                    <a class="nav-link" href="CartServlet">
                        <i class="fas fa-shopping-cart">Commandes</i>
                    </a>
                </li>
                <%
                    if(session.getAttribute("name") !=null){
                %>



                <li class="nav-item nav-cart">
                    <a class="nav-link" >

                        Bienvenue <span STYLE="color: tomato;
                cursor: pointer"><b><%= session.getAttribute("name")%></b> </span>

                    </a> </li>


                <li class="nav-item">
                    <form class="form-inline my-2 my-lg-0" action="LogoutServlet" method="post">
                        <button class="btn btn-outline-danger my-2 my-sm-0" type="submit">Deconnexion</button>
                    </form>
                </li>


                <%
                    }
                %>



            </ul>
        </div>
    </div>
</nav>



</body>
</html>

