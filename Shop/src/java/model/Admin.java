
package model;


public class Admin {

    public Admin(String userAdmin, String passAdmin, String hotenAdmin) {
        this.userAdmin = userAdmin;
        this.passAdmin = passAdmin;
        this.hotenAdmin = hotenAdmin;
    }
    public Admin(){
}
      private String userAdmin;
   private String passAdmin;
   private String hotenAdmin;

    public String getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }

    public String getHotenAdmin() {
        return hotenAdmin;
    }

    public void setHotenAdmin(String hotenAdmin) {
        this.hotenAdmin = hotenAdmin;
    }
 
}
