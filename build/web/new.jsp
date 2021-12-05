<%-- 
    Document   : newjsp
    Created on : Oct 27, 2021, 4:21:07 PM
    Author     : Khoa
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>


    </head>
    <body>
        <h2 class="title text-center">SAN PHAM LA ${test1} </h2>   
        <h2 class="title text-center">MA CATEGORY SAN PHAM LA ${test2} </h2>    

        <p>CAC SAN PHAM LA</p>
        <c:forEach items="${listSP}" var="k" >
            <p>TEN SAN PHAM : ${k.name}</p><br>
            <img src="${k.image}" alt="" />
        </c:forEach>

    </body>     
    <script src="js/jquery.js"></script>   
</html>
