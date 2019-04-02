
package practica2.Clientes;

public class Attorney extends Costumer {
    
    private String OfficePhone;
    private String bussinesshours;

    public Attorney(String OfficePhone, String bussinesshours, String Name, String LastName1, String LastName2, String ContactMedia1, String ContactMedia2, String ContactMedia3) {
        super(Name, LastName1, LastName2, ContactMedia1, ContactMedia2, ContactMedia3);
        this.OfficePhone = OfficePhone;
        this.bussinesshours = bussinesshours;
    }

    public String getOfficePhone() {
        return OfficePhone;
    }

    public void setOfficePhone(String OfficePhone) {
        this.OfficePhone = OfficePhone;
    }

    public String getBussinesshours() {
        return bussinesshours;
    }

    public void setBussinesshours(String bussinesshours) {
        this.bussinesshours = bussinesshours;
    }
    
}   

