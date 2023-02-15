<%--
  Created by IntelliJ IDEA.
  User: t
  Date: 1/30/23
  Time: 01:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="style/admin.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<br>



<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<h2 style="color: #FF4B2B ; text-align: center">Welcome Admin</h2>

<%--<ul>--%>
<%--    <li > <button id="addBtn">Add Product</button></li>--%>
<%--    <li> <button id="modifyBtn" >Modify</button></li>--%>
<%--    <li> <button id="statsBtn" >Show statistics</button></li>--%>


<%--</ul>--%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav">
            <li class="nav-item">
                <button class="btn btn-outline-primary nav-link" id="addBtn">Add Product</button>
            </li>
            <li class="nav-item">
                <button class="btn btn-outline-primary nav-link" id="modifyBtn">Modify</button>
            </li>
            <li class="nav-item">
                <button class="btn btn-outline-primary nav-link" id="statsBtn">Show statistics</button>
            </li>
        </ul>
    </div>
</nav>


<div class="d-flex justify-content-center align-items-center"  >
    <div id="modify_price" style="display:none" >
        <h2>Modify Price</h2>
        <form method="post">
            <div class="form-group">
                <label for="productName">Product Name</label>
                <input type="text" class="form-control" id="productName" placeholder="Enter product name">
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <input type="number" class="form-control"  placeholder="Enter price">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>



        </div>
    <div id="show_stats" style="display:none" >
        <div  class="container mt-5">
            <h2 style="font-size: 36px; font-weight: bold;">Statistics</h2>
            <div class="row">
                <div class="col-sm-6">
                    <div class="card" style="min-height: 200px;">
                        <div class="card-body">
                            <h5 class="card-title" style="font-size: 24px; font-weight: bold;">Total Earning</h5>
                            <p class="card-text" style="font-size: 18px;">100 Dhs</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card" style="min-height: 200px;">
                        <div class="card-body">
                            <h5 class="card-title" style="font-size: 24px; font-weight: bold;">Number of Users</h5>
                            <p class="card-text" style="font-size: 18px;">50</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row mt-3">
                <div class="col-sm-6">
                    <div class="card" style="min-height: 200px;">
                        <div class="card-body">
                            <h5 class="card-title" style="font-size: 24px; font-weight: bold;">Number of Sold Products</h5>
                            <p class="card-text" style="font-size: 18px;">30</p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card" style="min-height: 200px;">
                        <div class="card-body">
                            <h5 class="card-title" style="font-size: 24px; font-weight: bold;">Number of Orders</h5>
                            <p class="card-text" style="font-size: 18px;">10</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>


    <div class="col-md-6" style="border: 2px solid blueviolet; display: block " id="add_product">

        <form method="post" action="addProduit" enctype='multipart/form-data'>
            <div class="form-group">
                <label for="product_name">Product Name:</label>
                <input class="form-control" type="text" id="product_name" name="product_name">
            </div>
            <div class="form-group">
                <label for="price">Price:</label>
                <input class="form-control" type="number" id="price" name="price">
            </div>
            <div class="form-group">
                <label for="solde">Solde:</label>
                <input class="form-control" type="number" id="solde" name="solde">
            </div>
            <div class="form-group">
                <label for="solde_description">Solde Description:</label>
                <input class="form-control" type="text" id="solde_description" name="solde_description">
            </div>
            <div class="form-group">
                <label for="category">Category:</label>
                <input class="form-control" type="text" id="category" name="category">
            </div>
            <div class="form-group">
                <label for="selled">Selled:</label>
                <input class="form-control" type="number" id="selled" name="selled">
            </div>
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input class="form-control" type="number" id="quantity" name="quantity">
            </div>
            <div class="form-group">
                <label for="quantity">Image:</label>
                <input class="form-control" type="file" id="image" name="image">
            </div>

            <div class="form-group">
                <label for="description">Description:</label>
                <textarea class="form-control" id="description" name="description"></textarea>
            </div>
            <button class="btn btn-primary" type="submit">add new product</button>
        </form>


    </div>
</div>







<script src="./javascript/admin.js"></script>


</body>
</html>
