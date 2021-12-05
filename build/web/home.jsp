<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Shopper</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.css">
    <jsp:include page="snow.jsp"></jsp:include>
  

</head><!--/head-->

<body>
    <jsp:include page="header.jsp"></jsp:include>
	
	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active"  >
                                                            <img src="./images/hinh slide/1.png"/>
                                                            
							</div>
							<div class="item" >
                                                            <img src="./images/hinh slide/2.png"/>
                                                            
							</div>
                                                   	<div class="item" >
                                                            <img src="./images/hinh slide/3.png"/>
                                                            
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
                                <jsp:include page="categoryleft.jsp"></jsp:include>
				</div>
				<div class="col-sm-9 padding-right">
                           
					<div class="features_items"><!--features_items-->
                                            <h2 class="title text-center">Features Items</h2>
                                                <c:forEach items="${listP}" var="o">
                                                    <div class="col-sm-4">
                                                            <div class="product-image-wrapper">
                                                                    <div class="single-products">
                                               
                                                                            <div class="productinfo text-center">
                                                                                    <img src="${o.image}" alt="" />
                                                                                    <h2>${o.price}</h2>
                                                                                    <p>${o.name}</p>
                                                                                </a>
                                                                                    <a name="${o.id}" method="Get" class="btn btn-default add-to-cart"
                                                                                       onclick="showSwal('auto-close')">
                                                                                           <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                            </div>
                                                                            <div class="product-overlay">
                                                                                    <div class="overlay-content">
                                                                                        <a href="productdetail?pdid=${o.id}">
                                                                                            <h2>${o.price}</h2>
                                                                                            <p>${o.name}</p>
                                                                                        </a>
                                                                                            <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>

                                                                                       
                                                                                    </div>
                                                                            </div>
                                                                      
                                                                    </div>
                                                               
                                                                    <div class="choose">
                                                                            <ul class="nav nav-pills nav-justified">
                                                                                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to wishlist</a></li>
                                                                                    <li><a href="#"><i class="fa fa-plus-square"></i>Add to compare</a></li>
                                                                            </ul>
                                                                    </div>
                                                            </div>
                                                      
                                                    </div>
                                                </c:forEach>
                                 
                                          
					</div><!--features_items-->
					
					<div class="category-tab"><!--category-tab-->
						<div class="col-sm-12">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#tshirt" data-toggle="tab">TOYS & GAMES</a></li>
								<li><a href="#blazers" data-toggle="tab">T-SHIRT</a></li>
								<li><a href="#sunglass" data-toggle="tab">SKINCARE</a></li>
								<li><a href="#kids" data-toggle="tab">ELECTRICAL</a></li>
								<li><a href="#poloshirt" data-toggle="tab">TABLES</a></li>
 
							</ul>
						</div>
                                         
						<div class="tab-content">
                                                       <!--TAB TOY & GAME-->
							<div class="tab-pane fade active in" id="tshirt" >
                                                            <c:forEach items="${listToys}" var="o" begin="4" end="7">
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												 <img src="${o.image}" alt="" style="width: 183px;height:161px " />
												<h2>${o.price}</h2>
												<p>${o.name}</p>
												  <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            </c:forEach>
                                                        </div>
							<!--TAB T-SHIRT-->
							<div class="tab-pane fade" id="blazers" >
								<c:forEach items="${listTshirt}" var="o" begin="4" end="7">
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												 <img src="${o.image}" alt="" style="width: 183px;height:161px " />
												<h2>${o.price}</h2>
												<p>${o.name}</p>
												  <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
											
										</div>
									</div>
								</div>
                                                            </c:forEach>
							</div>
							<!--TAB SKINCARE-->
							<div class="tab-pane fade" id="sunglass" >
                                                            <c:forEach items="${listSkincare}" var="o" begin="4" end="7">
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												 <img src="${o.image}" alt="" style="width: 183px;height:161px " />
												<h2>${o.price}</h2>
												<p>${o.name}</p>
												  <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
										</div>
									</div>
								</div>
                                                            </c:forEach>
							</div>
							<!--TAB ELECTRICAL-->
							<div class="tab-pane fade" id="kids" >
                                                            <c:forEach items="${listElec}" var="o" begin="4" end="7">
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												 <img src="${o.image}" alt="" style="width: 183px;height:161px " />
												<h2>${o.price}</h2>
												<p>${o.name}</p>
												  <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
										</div>
									</div>
								</div>
                                                            </c:forEach>
                                                        </div>
							<div class="tab-pane fade" id="poloshirt" >
                                                            <c:forEach items="${listTables}" var="o" begin="4" end="7">
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												 <img src="${o.image}" alt="" style="width: 183px;height:161px " />
												<h2>${o.price}</h2>
												<p>${o.name}</p>
												  <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                               onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
											</div>
										</div>
									</div>
								</div>
                                                            </c:forEach>
							</div>
						</div>
					</div><!--/category-tab-->
					
					<div class="recommended_items"><!--recommended_items-->
						<h2 class="title text-center">recommended items</h2>
						
						<div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
							<div class="carousel-inner">
								<div class="item active">	
                                                                    <c:forEach items="${listSPRecommed}" var="o" begin="0" end="2">
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
                                                                                            <div class="productinfo text-center">
                                                                                                    <img src="${o.image}" alt="" style="width: 183px;height:161px " />
                                                                                                    <h2>${o.price}</h2>
                                                                                                    <p>${o.name}</p>
                                                                                                    <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                                       accesskey=""onclick="showSwal('auto-close')">
                                                                                                <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                                            </div>
											</div>
										</div>
									</div>
                                                                    </c:forEach>
								</div>
                                                            
								<div class="item">	
                                                                    <c:forEach items="${listSPRecommed}" var="o" begin="3" end="5">
									<div class="col-sm-4">
										<div class="product-image-wrapper">
											<div class="single-products">
												<div class="productinfo text-center">
                                                                                                    <img src="${o.image}" alt="" style="width: 183px;height:161px " />
                                                                                                    <h2>${o.price}</h2>
                                                                                                    <p>${o.name}</p>
                                                                                                    <a name="${o.id}" method="Get" class="btn btn-default add-to-cart" 
                                                                                                    onclick="showSwal('auto-close')">
                                                                                                    <i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                                                                </div>
											</div>
										</div>
									</div>
                                                                    </c:forEach>
								</div>
							</div>
							 <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
								<i class="fa fa-angle-left"></i>
							  </a>
							  <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
								<i class="fa fa-angle-right"></i>
							  </a>			
						</div>
					</div><!--/recommended_items-->
					
				</div>
			</div>
		</div>
	</section>
        <jsp:include page="footer.jsp"></jsp:include>


  
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
    <script src="js/ajaxaddtocart.js"></script>
    
   
</body>
</html>