<%@ page import="produits.Produit" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%List<Produit> produits = (List<Produit>) request.getAttribute("products");%>


<!DOCTYPE html>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Home</title>


</head>
<jsp:include page="header.jsp"></jsp:include>
<body>


<hr>
        <div class="container">


            <div class="row">

                    <% for (Produit p : produits){
                        %>



                <div class="col-sm-4 mt-3">
                    <div class="card text-center">
                        <h5 class="card-title"><%=p.getProduit_name()%></h5>

                        <div class="card-body">

                            <img src="<%=p.getImage()%>" class="card-img-top" alt="product image">
                            <p class="card-text"><%=p.getCategory()%></p>
                            <p class="card-text"><%=p.getDescription()%></p>
                            <p class="card-text font-weight-bold"><%=p.getPrice()%></p>
                            <form method="post" action="CartServlet">

                                <button type="submit" class="btn btn-primary">
<%--                                    <%--%>
<%--                                        request.setAttribute("product", p);--%>
<%--                                        RequestDispatcher rd = request.getRequestDispatcher("/CartServlet");--%>
<%--                                        rd.forward(request, response);--%>
<%--                                %>--%>
                                    Add to Cart</button>
                            </form>
                        </div>
                    </div>
                </div>


                <% }
                         %>
            </div>





</div>






<br/>


</body>
</html>