
package controller;

import dao.BillDAO;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bill;


public class ManagerBillServlet extends HttpServlet {
BillDAO billDAO = new BillDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String bill_id = request.getParameter("bill_id");         
        String url = "";
        try {
            switch (command) {
                case "update":
                    billDAO.update(Long.parseLong(bill_id));
                    url = "/Admin/manager_bill.jsp";
                    break;
                case "delete":
                    billDAO.delete(Long.parseLong(bill_id));
                    url = "/Admin/manager_bill.jsp";
                    break;
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {       
        
  }
}
