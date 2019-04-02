
package practica2.Clientes;

public class Doctor extends Costumer {
    
    private String Specialty;
    private String HospitalName;
    private String HospitalAdress;

    public Doctor(String Specialty, String HospitalName, String HospitalAdress, String Name, String LastName1, String LastName2, String ContactMedia1, String ContactMedia2, String ContactMedia3) {
        super(Name, LastName1, LastName2, ContactMedia1, ContactMedia2, ContactMedia3);
        this.Specialty = Specialty;
        this.HospitalName = HospitalName;
        this.HospitalAdress = HospitalAdress;
    }
    
    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getHospitalAdress() {
        return HospitalAdress;
    }

    public void setHospitalAdress(String HospitalAdress) {
        this.HospitalAdress = HospitalAdress;
    }
}
