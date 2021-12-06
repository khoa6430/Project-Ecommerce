<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Login | E-Shopper</title>
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
    
	
    <section id="form"><!--form-->
            <div class="container">
                    <div class="row">
                            <div class="col-sm-4 col-sm-offset-1">
                                    <div class="login-form"><!--login form-->
                                            <h2>Login to your account</h2>
                                            <form action="login">
                                                    <input name="user" type="text" placeholder="User Name" />
                                                    <input name="pass" type="password" placeholder="Password" />
                                                    <span>
                                                            <input type="checkbox" class="checkbox"> 
                                                            Keep me signed in
                                                    </span>
                                   
                                                    <button type="submit" class="btn btn-default">Login</button>
                                                    <div class="wrong1 ${mess1==null&&user1!=null?"alert alert-danger":""}">
                                                    <strong><p class="text-danger">${mess1==null&&user1!=null?"Wrong user or pass!!!":""}</p></strong>
                                                    </div>  
                                                                             
                                                    
                                            </form>
                                    </div><!--/login form-->
                            </div>
                            <div class="col-sm-1">
                                    <h2 class="or">OR</h2>
                            </div>
                            <div class="col-sm-4">
                                    <div class="signup-form"><!--sign up form-->
                                            <h2>New User Signup!</h2>
                                            <form action="signup">
                                                    <input name="newuser" type="text" placeholder="User Name" required=""/>
                                                    <input name="newpass" type="password" placeholder="New Password" required autofocus=""/>
                                                    <input name="repeatpass" type="password" placeholder="Confirm Password" required autofocus=""/>
                                                    <button type="submit" class="btn btn-default" style="margin-bottom: 15px;">
                                                        Signup</button>
                                                    ${tb}
                                                    ${tb2}
                                                    ${tb2c}
                                                    
                                                    ${tb3}
                                                  
                                            
                                            </form>
                                    </div><!--/sign up form-->
                            </div>
                    </div>
            </div>
    </section><!--/form-->
        
        <jsp:include page="footer.jsp"></jsp:include>

    <script src="js/jquery.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>