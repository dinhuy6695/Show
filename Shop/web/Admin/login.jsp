
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>

        <div id="header ">
            <div class="inHeaderLogin"></div>
        </div>
        <div id="loginForm">
            <div class="headLoginForm">
                ĐĂNG NHẬP QUẢN TRỊ
            </div>
            <div class="fieldLogin">
                <form action="/Shop/AdminServlet" method="POST" >
                    <label>Tên Đăng Nhập</label><br>
                    <input type="text" class="login" name="id"><br>
                    <label>Mật Khẩu</label><br>
                    <input type="password" class="login" name="pass"><br>
                    
                    <input type="hidden" value="login" name="command">
                    <input type="submit" class="button" value="Đăng Nhập">
                </form>
            </div>
        </div>
    </body>
</html>
