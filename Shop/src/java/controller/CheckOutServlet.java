
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.BillDAO;
import dao.BillDetailDAO;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.BillDetail;
import model.Cart;
import model.Item;
import model.Users;
import tools.SendMail;

public class CheckOutServlet extends HttpServlet {
private final BillDAO billDAO = new BillDAO();
private final BillDetailDAO billDetailDAO = new BillDetailDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tinhtrang = "0";
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String payment = request.getParameter("payment");
        String address = request.getParameter("address");
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Users users = (Users) session.getAttribute("user");        
        try {
        long ID = new Date().getTime();
        Bill bill = new Bill();
        bill.setBillID(ID);
        bill.setAddress(address);
        bill.setPayment(payment);
        bill.setUserID(users.getUserID());
        bill.setDate(new Timestamp(new Date().getTime()));
        bill.setTotal(cart.total());
        bill.setTinhtrang(Long.parseLong(tinhtrang));
        billDAO.insertBill(bill);
        for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
        billDetailDAO.insertBillDetail(new BillDetail(0, ID,
        list.getValue().getProduct().getProductID(),
        list.getValue().getProduct().getProductPrice(),
        list.getValue().getQuantity()));
        }
        SendMail sm = new SendMail();SendMail.sendMail(users.getUserEmail(), "Thanh toan Handmade Shop", "Xin chào, "+users.getUserEmail()+"\nCam on quy khach da mua hang tai website, tong hoa don thanh toan cua quy khach la: "+cart.total()+" VND");
        cart = new Cart();
        session.setAttribute("cart", cart);
        } catch (Exception e) {
        }
        response.sendRedirect("Index.jsp");
}
}
