<%@page import="dao.UsersDAO"%>
<%@page import="model.Bill"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BillDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản Lý Hóa Đơn</title>
        
        <c:set var="root" value="${pageContext.request.contextPath}" />
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
         <%
            BillDAO billDAO = new BillDAO();
            ArrayList<Bill> listBill = billDAO.getListBill();
            UsersDAO usersDAO = new UsersDAO();
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include>
               <div id="rightContent">
	<h3>Quản lý hóa đơn</h3>
		<table class="data">
			<tr class="data">
				<th class="data" width="30px">STT</th>
                                <th class="data">Mã hóa đơn</th>
				<th class="data">Khách hàng</th>
				<th class="data">Tổng hóa đơn</th>
				<th class="data">Thanh toán</th>
                                <th class="data">Địa chỉ giao hàng</th>
                                <th class="data">Ngày mua</th>   
                                <th class="data">Tình trạng</th>  
				<th class="data" width="75px">Tùy chọn</th>
			</tr>
                        <% int count=0;
                            for(Bill bill : listBill){
                                count++;
                        %>
			<tr class="data">
				<td class="data" width="30px"><%=count%></td>
				<td class="data"><%=bill.getBillID()%></td>
				<td class="data"><%=usersDAO.getUser(bill.getUserID()).getUserEmail()%></td>
				<td class="data"><%=bill.getTotal()%></td>
                                <td class="data"><%=bill.getPayment()%></td>
                                <td class="data"><%=bill.getAddress()%></td> 
                                <td class="data"><%=bill.getDate()%></td> 
                                
                                <%if (bill.getTinhtrang() == 0) {%>
                                <td class="data">Chờ xác nhận</td>
                                <%}%>  
                                <%if (bill.getTinhtrang() == 1) {%>
                                <td class="data">Đã xác nhận</td>
                                <%}%>  
				<td class="data" width="75px">
				<center>   
                                <%if (bill.getTinhtrang() == 0) {%>
                                <a href="/Shop/ManagerBillServlet?command=update&bill_id=<%=bill.getBillID()%>">Xác nhận</a>
                                <%}%>  
                                <%if (bill.getTinhtrang() == 1) {%>
                                <a></a>
                                <%}%> 
				<a href="/Shop/ManagerBillServlet?command=delete&bill_id=<%=bill.getBillID()%>">Hủy</a>
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
