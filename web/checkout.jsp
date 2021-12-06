<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Checkout | E-Shopper</title>
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
  <link rel="shortcut icon" href="https://upload.wikimedia.org/wikipedia/commons/0/0e/Shopee_logo.svg">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
     <jsp:include page="snow.jsp"></jsp:include>
</head><!--/head-->

<body>
	
        <jsp:include page="header.jsp"></jsp:include>
	<section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
				  <li><a href="#">Home</a></li>
				  <li class="active">Check out</li>
				</ol>
			</div><!--/breadcrums-->

			<div class="step-one">
				<h2 class="heading">Step1</h2>
			</div>
			<div class="checkout-options">
				<h3>New User</h3>
				<p>Checkout options</p>
			
			</div><!--/checkout-options-->

			<div class="register-req">
				<p>Please use Register And Checkout to easily get access to your order history, or use Checkout as Guest</p>
			</div><!--/register-req-->

			<div class="shopper-informations">
				<div class="row">
				
                                    <div class="col-sm-12 clearfix">
						<div class="bill-to">
							<p>Bill To</p>
                                                        <div class="newform">
                                                            <form action="SendMailControl" method="post" style="display:flex;  flex-wrap: wrap;">
                                                                <input name="email" type="text" placeholder="Email*"/>
                                                                <input name="firstname" type="text" placeholder="First Name *"/>
                                                                <input name="lastname" type="text" placeholder="Last Name *"/>
                                                                <input name="phonenumber" type="text" placeholder="Phone Number "/>
                                                                <input name="address" type="text" placeholder="Address *"/>
                                                                <select name="country">
                                                                    <option>-- Country --</option>
                                                                    <option value="United States">United States</option>
                                                                    <option value="VietNam">VietNam</option>
                                                                    <option value="UK">UK</option>
                                                                </select>
                                                                
                                                                 <select name="province">
                                                                    <option>Province</option>
                                                                    <option value="TP HCM">TP HCM</option>
                                                                    <option value="Ha Noi">Ha Noi</option>
                                                                    <option value="Da Nang">Da Nang</option>
                                                                </select>
                                                             	<input name="zip" type="text" placeholder="Zip / Postal Code ">
                                                                <input name="shippingorder" type="text" placeholder="Notes about your order, Special Notes for Delivery" style="width: 100%;height: 120px"/>
                                                                <button type="submit" class="btn btn-success" style="margin-left: 10px;">CHECKOUT</button>
                                                            </form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="review-payment">
				<h2>Review & Payment</h2>
			</div>

			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Item</td>
							<td class="description"></td>
							<td class="price">Price</td>
							<td class="quantity">Quantity</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
                                             <c:forEach items="${order.items}" var="item">
						<tr>
							<td class="cart_product">
								    <a href=""><img src="${item.product.image}" alt="" style="width: 250px;height: 250px;"></a>
							</td>
							<td class="cart_description">
								<h4><a href="">${item.product.name}</a></h4>
							</td>
							<td class="cart_price">
								<p>${item.product.price}</p>
							</td>
							<td class="cart_quantity">
                                                            <div class="cart_quantity_button">
                                                                    <a class="cart_quantity_up" href="upquantity?iid=${item.iid}&&qid=${item.iquanity}&&value1=1">+</a>
                                                                    <input class="cart_quantity_input" type="text" name="quantity" value="${item.iquanity}" autocomplete="off" size="2">
                                                                    <a class="cart_quantity_down" href="upquantity?iid=${item.iid}&&qid=${item.iquanity}&&value1=0"> - </a>
                                                            </div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price">${item.totalprice}</p>
							</td>
                                                        <td class="cart_delete">
                                                            <a class="cart_quantity_delete" href="deleteitemcart?iid=${item.iid}"><i class="fa fa-times"></i></a>
							</td>
						</tr>
                                             </c:forEach>
						<tr>
							<td colspan="4">&nbsp;</td>
							<td colspan="2">
								<table class="table table-condensed total-result">
									<tr>
										<td>Cart Sub Total</td>
										<td> $${order.totalorder}</td>
									</tr>
									<tr>
										<td>Exo Tax</td>
										<td>$2</td>
									</tr>
									<tr class="shipping-cost">
										<td>Shipping Cost</td>
										<td>Free</td>										
									</tr>
									<tr>
										<td>Total</td>
										<td><span>$${order.totalorder+2}</span></td>
									</tr>
								</table>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		
		</div>
	</section> <!--/#cart_items-->
     <jsp:include page="footer.jsp"></jsp:include>
	


	


    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>