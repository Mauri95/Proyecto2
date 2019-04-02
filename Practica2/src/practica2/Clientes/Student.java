
package practica2.Clientes;

public class Student extends Costumer {
    private String birthdate;
    private String birthPlace;
    private String carrer;
    private String email;

    public Student(String birthdate, String birthPlace, String carrer, String email, String Name, String LastName1, String LastName2, String ContactMedia1, String ContactMedia2, String ContactMedia3) {
        super(Name, LastName1, LastName2, ContactMedia1, ContactMedia2, ContactMedia3);
        this.birthdate = birthdate;
        this.birthPlace = birthPlace;
        this.carrer = carrer;
        this.email = email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
