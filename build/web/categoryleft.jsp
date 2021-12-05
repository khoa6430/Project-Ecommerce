<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>	
<div class="left-sidebar">
    <h2>Category</h2>
        <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                <div class="panel panel-default">
                    <div class="panel-heading">
                            <h4 class="panel-title">
                                    <a data-toggle="collapse" data-parent="#accordian" href="#mens">
                                            <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                            MEN
                                    </a>
                            </h4>
                    </div>
                    <div id="mens" class="panel-collapse collapse">
                            <div class="panel-body">
                                    <ul>    
                                        <c:forEach items="${listMen}" var="u">
                                            <li><a href="detail?dtname=${u.cmname}&&idcategory=1">${u.cmname}</a></li>
                                        </c:forEach>
                                    </ul>
                            </div>
                    </div>
            </div>
            <!--CATEGORY WOMEN-->                              
            <div class="panel panel-default">
                        <div class="panel-heading">
                                <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                                <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                Womens
                                        </a>
                                </h4>
                        </div>
                        <div id="womens" class="panel-collapse collapse">
                                <div class="panel-body">
                                        <ul>
                                            <c:forEach items="${listWomen}" var="o">
                                                <li><a href="detail?dtname=${o.cwname}&&idcategory=2">${o.cwname}</a></li>
                                            </c:forEach>

                                        </ul>
                                </div>
                        </div>
            </div>
            <!--CATEGORY ELECTRICAL-->
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title"><a href="detail?dtname=${null}&&idcategory=3">FOOD & DRINKS</a></h4>
                </div>
            </div>
            <!--CATEGORY FURNITURES-->
            <div class="panel panel-default">
                <div class="panel-heading">
                        <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordian" href="#sportswear">
                                        <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                        FURNITURES
                                </a>
                        </h4>
                </div>
                <div id="sportswear" class="panel-collapse collapse">
                        <div class="panel-body">
                                <ul>
                                    <c:forEach items="${listFurnitures}" var="o">
                                        <li><a href="detail?dtname=${o.cfname}&&idcategory=4">${o.cfname}</a></li>
                                        <!--<li><a href="detail?idcategory=4">${o.cfname}</a></li>-->

                                    </c:forEach>
                                </ul>
                        </div>
                </div>
            </div> 
            <!--CATEGORY ELECTRICAL-->
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h4 class="panel-title"><a href="detail?dtname=${null}&&idcategory=5">ELECTRICAL</a></h4>
                </div>
            </div>
            <!--CATEGORY SKINCARE-->
            <div class="panel panel-default">
                <div class="panel-heading">
                        <h4 class="panel-title"><a href="detail?dtname=${null}&&idcategory=6">SKINCARE</a></h4>
                </div>
            </div>
            <!--CATEGORY PERFUMES-->
            <div class="panel panel-default">
                <div class="panel-heading">
                        <h4 class="panel-title"><a href="detail?dtname=${null}&&idcategory=7">PERFUMES</a></h4>
                </div>
            </div>    
            <!--CATEGORY TOYS & GAMES-->
            <div class="panel panel-default">
                <div class="panel-heading">
                        <h4 class="panel-title"><a href="detail?dtname=${null}&&idcategory=8">TOYS & GAMES</a></h4>
                </div>
            </div>
        </div><!--/category-products-->
        <div class="brands_products"><!--brands_products-->
            <h2>Most Views</h2>
            <div class="brands-name">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="detail?dtname=T-SHIRT&&idcategory=1"><span class="pull-right"></span>T-SHIRT</a></li>
                    <li><a href="detail?dtname=HOODIES AND SWEATSHIRTS&&idcategory=2"> <span class="pull-right"></span>HOODIES AND SWEATSHIRTS</a></li>
                    <li><a href="#"> <span class="pull-right"></span>BLAZERS</a></li>
                    <li><a href="#"> <span class="pull-right"></span>POLOSHIRT</a></li>
                    <li><a href="#"> <span class="pull-right"></span>CHAIRS</a></li>
                    <li><a href="#"> <span class="pull-right"></span>COATS AND JACKETS</a></li>
                    <li><a href="#"> <span class="pull-right"></span>TABLES</a></li>
                </ul>
            </div>
        </div><!--/brands_products-->
        <div class="price-range"><!--price-range-->
            <h2>Price Range</h2>
            <div class="well text-center">
                     <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                     <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
            </div>
        </div><!--/price-range-->
						
        <div class="shipping text-center"><!--shipping-->
                <img src="images/home/shipping.jpg" alt="" />
        </div><!--/shipping-->

</div>