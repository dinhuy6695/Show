
<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản Lý Sản Phẩm</title>
       <c:set var="root" value="${pageContext.request.contextPath}" />
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
         <%
            ProductDAO productDAO = new ProductDAO();            
            ArrayList<Product> listProduct = productDAO.getListProductAdmin();
        %>

        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include>
               <div id="rightContent">
	<h3>Quản Lý Sản Phẩm</h3>
	
        <a href="${root}/Admin/insert_product.jsp"><input type="submit" class="button" value="Thêm sản phẩm"></a>
        
		<table class="data">
			<tr class="data">
				<th class="data" width="30px">STT</th>
				<th class="data">Mã Sản Phẩm</th>
                                <th class="data">Mã Danh Mục</th>
				<th class="data">Tên Sản Phẩm</th>
                                <th class="data">Hình Ảnh</th>
                                <th class="data">Giá</th>
                                <th class="data">Mô Tả</th>
				<th class="data" width="75px">Tùy Chọn</th>
			</tr>
                        
                        <%
                            int count=0;
                            for(Product product : listProduct){
                                count++;
                        %>
			<tr class="data">
				<td class="data" width="30px"><%=count%></td>
                                <td class="data"><%=product.getProductID()%></td>
				<td class="data"><%=product.getCategoryID()%></td>
				<td class="data"><%=product.getProductName()%></td>	
                                <td class="data"><%=product.getProductImage()%></td>
                                <td class="data"><%=product.getProductPrice()%></td>
                                <td class="data"><%=product.getProductDescription()%></td>
				<td class="data" width="75px">
				<center>
				<a href="${root}/Admin/update_product.jsp?command=update&product_id=<%=product.getProductID()%>&product_name=<%=product.getProductName()%>&product_image=<%=product.getProductImage()%>&product_price=<%=product.getProductPrice()%>&product_description=<%=product.getProductDescription()%>&category_id=<%=product.getCategoryID()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
				<a href="/Shop/ManagerProductServlet?command=delete&product_id=<%=product.getProductID()%>">Xóa</a>
				</center>
				</td>
			</tr>
			<%}%>
		</table>
	</div>
<div class="clear"></div>

            <jsp:include page="footer.jsp"></jsp:include>
        </div>   
</body>
</html>
