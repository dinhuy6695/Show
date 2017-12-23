
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;


public class ManagerProductServlet extends HttpServlet {
ProductDAO productDAO = new ProductDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String product_id = request.getParameter("product_id");    
        String url = "";
        try {
            switch (command) {
                case "delete":
                    productDAO.delete(Long.parseLong(product_id));
                    url = "/Admin/manager_product.jsp";
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
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String loaisp = request.getParameter("loaisp");
        String tensp = request.getParameter("tensp");
        String hinhanh = request.getParameter("hinhanh");
        String giaban = request.getParameter("giaban");
        String mota = request.getParameter("mota");
        String url = "", error = "";
        if (loaisp.equals("")) {
            error = "Vui lòng nhập loại sản phẩm!";
            request.setAttribute("error", error);
        }
        try {
            if (error.length() == 0) {
                switch (command) {
                    case "insert":
                        productDAO.insert(new Product(new Date().getTime() % 1000, Long.parseLong(loaisp), tensp, hinhanh, Double.parseDouble(giaban), mota));
                        url = "/Admin/manager_product.jsp";
                        break;
                    case "update":
                        productDAO.update(new Product(Long.parseLong(request.getParameter("product_id")), Long.parseLong(loaisp), tensp, hinhanh, Double.parseDouble(giaban), mota));
                        url = "/Admin/manager_product.jsp";
                        break;
                }
            } else {
                url = "/Admin/insert_product.jsp";
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
  }
 
}
