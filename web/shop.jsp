<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Shop | E-Shopper</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <link href="css/alert-addtocart.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
  <link rel="shortcut icon" href="https://upload.wikimedia.org/wikipedia/commons/0/0e/Shopee_logo.svg">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css">
    <jsp:include page="snow.jsp"></jsp:include>
</head><!--/head-->

<body>
	
    <jsp:include page="header.jsp"></jsp:include>
	<section id="advertisement">
		<div class="container">
			<img src="images/shop/advertisement.jpg" alt="" />
		</div>
	</section>
	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
                                <jsp:include page="categoryleft.jsp"></jsp:include>
				</div>			
				<div class="col-sm-9 padding-right">
					<div class="features_items"><!--features_items-->
						<h2 class="title text-center">${test1} Items</h2>    
                                                <c:forEach items="${listSP}" var="k" >
                                                    <div class="col-sm-4">
                                                            <div class="product-image-wrapper">
                                                                    <div class="single-products">
                                                                            <div class="productinfo text-center">
                                                                                    <img src="${k.image}" alt="" />
                                                                                    <h2>${k.price}</h2>
                                                                                    <p>${k.name}</p>
                                                                                      <a name="${k.id}" method="Get" class="btn btn-default add-to-cart"
                                                                                       onclick="showSwal('auto-close')">
                                                                                           <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                            </div>
                                                                            <div class="product-overlay">
                                                                                    <div class="overlay-content">
                                                                                    <h2>${k.price}</h2>
                                                                                    <p>${k.name}</p>
                                                                                        <a name="${k.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                            onclick="showSwal('auto-close')">
                                                                                            <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                                    </div>
                                                                            </div>
                                                                    </div>
                                                                    <div class="choose">
                                                                            <ul class="nav nav-pills nav-justified">
                                                                                    <li><a href=""><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                                                                    <li><a href=""><i class="fa fa-plus-square"></i>Add to compare</a></li>
                                                                            </ul>
                                                                    </div>
                                                            </div>
                                                    </div>
                                                </c:forEach>
					</div><!--features_items-->
                                        	<ul class="pagination" >
                                                    <c:if test="${tag>1}">
                                                        <li><a href="detail?index=${tag-1}&&dtname=${dtname2}&&idcategory=${idcate2}">Previous</a></li>
                                                    </c:if>
                                                    <c:forEach begin="1" end="${endP}" var="i">
                                                        <li class="${tag==i?"active":""}" >
                                                            <a href="detail?index=${i}&&dtname=${dtname2}&&idcategory=${idcate2}">${i}</a></li>
                                                    </c:forEach>
                                                    <c:if test="${tag<endP}">
                                                         <li><a href="detail?index=${tag+1}&&dtname=${dtname2}&&idcategory=${idcate2}" class="page-link">Next</a></li>
                                                    </c:if>
						</ul>
				</div>
			</div>
		</div>
	</section>
	
    <jsp:include page="footer.jsp"></jsp:include>

	

  
    <script src="js/jquery.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
    <script src="js/ajaxaddtocart.js"></script>
</body>
</html>