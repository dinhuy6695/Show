package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Users;

public class UsersDAO {
    // kiem tra email ton tai chua

    public boolean checkEmail(String email) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "SELECT * FROM users WHERE user_email = '" + email + "'";
        PreparedStatement ps;
        try {
            ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                connection.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // phương thức thêm tài khoản
    public boolean insertUser(Users u) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "INSERT INTO users VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, u.getUserID());
            ps.setString(2, u.getUserFullname());
            ps.setString(3, u.getUserEmail());
            ps.setString(4, u.getUserPass());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // kiểm tra đăng nhập
    public Users login(String email, String password) {
        Connection con = DBConnect.getConnecttion();
        String sql = "select * from users where user_email='" + email + "' and user_pass ='" + password + "'  ";

        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Users u = new Users();
                u.setUserEmail(rs.getString("user_email"));
                con.close();
                return u;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

        public Users getUser(long userID) {
        try {
            Connection connection = DBConnect.getConnecttion();
            String sql = "SELECT * FROM users WHERE user_id = ?";
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, userID);
            ResultSet rs = ps.executeQuery();
            Users u = new Users();
            while (rs.next()) {
                u.setUserEmail(rs.getString("user_email"));
            }
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(UsersDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
}
