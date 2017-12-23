
package controller;

import dao.AdminDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Admin;

public class AdminServlet extends HttpServlet {

    AdminDAO adminDAO = new AdminDAO();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {  
        try {
            
            String command = request.getParameter("command");
            String url = "";
            Admin admin = new Admin();
            HttpSession session = request.getSession();
            switch (command) {
                case "login":
                    admin = adminDAO.login(request.getParameter("id"),request.getParameter("pass"));
                   
                    if (admin != null) {
                        session.setAttribute("admin", admin);
                        url = "/Admin/index.jsp";
                    } else {
                        session.setAttribute("error", "Tài khoản hoặc mật khẩu không đúng.!");
                        url = "/Admin/login.jsp";
                    }
                    break;
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UsersServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsersServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    }
