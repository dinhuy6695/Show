

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
        
                <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
        
        
    </head>
    <body>
        
        	<div id="leftBar">
	<ul>
		<li><a href="${root}/Shop/Admin/index.jsp">Trang Chủ</a></li>
		<li><a href="${root}/Shop/Admin/manager_category.jsp">Danh Mục</a></li>
		<li><a href="${root}/Shop/Admin/manager_product.jsp">Sản Phẩm</a></li>
                <li><a href="${root}/Shop/Admin/manager_bill.jsp">Hóa Đơn</a></li>
                <li><a href="${root}/Shop/ChartServlet">Thống Kê</a></li>
	</ul>
	</div>
        
    </body>
</html>
