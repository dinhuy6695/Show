
package dao;
import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
public class BillDAO {
    public void insertBill(Bill bill) throws SQLException {
Connection connection = DBConnect.getConnecttion();
String sql = "INSERT INTO bill VALUES(?,?,?,?,?,?,?)";
PreparedStatement ps = connection.prepareCall(sql);
ps.setLong(1, bill.getBillID());
ps.setLong(2, bill.getUserID());
ps.setDouble(3, bill.getTotal());
ps.setString(4, bill.getPayment());
ps.setString(5, bill.getAddress());
ps.setTimestamp(6, bill.getDate());
ps.setLong(7, bill.getTinhtrang());
ps.executeUpdate();
}
    
    public ArrayList<Bill> getListBill() {
        try {
            Connection connection = DBConnect.getConnecttion();
            String sql = "SELECT * FROM bill";
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Bill> list = new ArrayList<>();
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillID(rs.getLong("bill_id"));
                bill.setUserID(rs.getLong("user_id"));
                bill.setTotal(rs.getDouble("total"));
                bill.setPayment(rs.getString("payment"));
                bill.setAddress(rs.getString("address"));
                bill.setDate(rs.getTimestamp("date")); 
                bill.setTinhtrang(rs.getLong("tinhtrang"));
                list.add(bill);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }        
    
    public boolean update(long bill_id) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "UPDATE bill SET tinhtrang=1 WHERE bill_id=?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
           ps.setLong(1, bill_id);
           return ps.executeUpdate() == 1;
       } catch (SQLException ex) {
           Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return false;
    }
    
     // xóa dữ liệu
    public boolean delete(long bill_id) {
        Connection connection = DBConnect.getConnecttion();
        String sql = "DELETE FROM bill WHERE bill_id = ?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
           ps.setLong(1, bill_id);
           return ps.executeUpdate() == 1;
       } catch (SQLException ex) {
           Logger.getLogger(BillDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
        return false;
    }
    
	public Double thongKe(String a, String b, String c) {
		Connection conn = DBConnect.getConnecttion();
		Double result = 0.0d;
		String sql = "select sum(total) as tt from bill where day(date) = ? and month(date) = ? and year(date) = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, a);
			ps.setString(2, b);
			ps.setString(3, c);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				result += rs.getDouble("tt");
			}
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
    
public static void main(String[] args) throws SQLException {

}
}
