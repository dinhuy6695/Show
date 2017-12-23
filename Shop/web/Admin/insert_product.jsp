
<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản Lý Sản Phẩm</title>
         <c:set var="root" value="${pageContext.request.contextPath}"/>
<link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<script src="<c:url value="/ckeditor/ckeditor.js" />"></script>
    </head>
    <body>   
        <%
            CategoryDAO categoryDAO = new CategoryDAO();
            ArrayList<Category> listCategory = categoryDAO.getListCategory();
            String error = "";
            if(request.getParameter("error")!=null){
                error = (String) request.getParameter("error");
            }
        %>
         <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include>
               <div id="rightContent">
	<h3>Quản Lý Sản Phẩm</h3>
        <form action="/Shop/ManagerProductServlet" method="post">
		<table width="95%">	
                        <tr>
                                <td><b>Loại SP</b></td><td>
                                    <select name="loaisp">
                                        <option selected>-- Chọn loại sản phẩm --</option>
                                    <%
                                        for (Category c : categoryDAO.getListCategory()) {
                                    %>
                                    <option value="<%=c.getCategoryID()%>"><%=c.getCategoryName()%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </td>
                        </tr>
			<tr><td><b>Tên sản phẩm</b></td><td><input type="text" class="sedang" name="tensp"></td><%=error%></tr>
                        <tr><td><b>Hình ảnh</b></td><td><input type="text" class="sedang" name="hinhanh"></td><%=error%></tr>
			<tr><td><b>Giá bán</b></td><td><input type="text" class="panjang" name="giaban"></td><%=error%></tr>                     			
			<tr><td><b>Mô tả sản phẩm</b></td>
                            <td>
                                <textarea class="form-textarea" id="noiDung" name="mota"></textarea>
                                <script type="text/javascript" language="javascript">
                                   CKEDITOR.replace('noiDung', {width: '500px',height: '300px'});
                                </script>
                            </td><%=error%>
                        </tr>                        
			<tr><td></td><td>
			<input type="hidden" name="command" value="insert">
			<input type="submit" class="button" value="Lưu dữ liệu">		
			</td></tr>
		</table>
        </form>
	</div>
<div class="clear"></div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>   
    </body>
</html>
