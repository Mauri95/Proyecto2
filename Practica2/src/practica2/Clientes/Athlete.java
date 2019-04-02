
package practica2.Clientes;

public class Athlete extends Costumer{
    
    private String BirthDate;
    private String Gender;
    private String Sport;

    public Athlete(String BirthDate, String Gender, String Sport, String Name, String LastName1, String LastName2, String ContactMedia1, String ContactMedia2, String ContactMedia3) {
        super(Name, LastName1, LastName2, ContactMedia1, ContactMedia2, ContactMedia3);
        this.BirthDate = BirthDate;
        this.Gender = Gender;
        this.Sport = Sport;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getSport() {
        return Sport;
    }

    public void setSport(String Sport) {
        this.Sport = Sport;
    }
    
}
