
package model;
import java.sql.Timestamp;
public class Bill {
    private long billID;
private long userID;
private double total;
private String payment;
private String address;
private Timestamp date;
private Long tinhtrang;

public Bill(){
    
}

    public Bill(long billID, long userID, double total, String payment, String address, Timestamp date,Long tinhtrang) {
        this.billID = billID;
        this.userID = userID;
        this.total = total;
        this.payment = payment;
        this.address = address;
        this.date = date;  
        this.tinhtrang = tinhtrang;
    }

    public Bill(long parseLong) {
    }


    public long getBillID() {
        return billID;
    }

    public void setBillID(long billID) {
        this.billID = billID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Bill(Long tinhtrang) {
            this.tinhtrang = tinhtrang;
        }

        public Long getTinhtrang() {
            return tinhtrang;
        }

        public void setTinhtrang(Long tinhtrang) {
            this.tinhtrang = tinhtrang;
        }
}
