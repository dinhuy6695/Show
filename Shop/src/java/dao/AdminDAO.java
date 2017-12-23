
package dao;

import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
public class AdminDAO {
    
      public Admin login(String id, String pass) throws SQLException, ClassNotFoundException {
        Connection con = DBConnect.getConnecttion();
        String sql = "SELECT * FROM admin WHERE useradmin ='" + id + "'and passadmin='" + pass + "'";
        PreparedStatement ps;
        try {
            ps = (PreparedStatement) con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Admin a = new Admin();
                a.setUserAdmin(rs.getString("useradmin"));
                a.setPassAdmin(rs.getString("passadmin"));
                a.setHotenAdmin(rs.getString("hoten"));
                con.close();
                return a;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
