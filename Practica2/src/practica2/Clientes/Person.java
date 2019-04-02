
package practica2.Clientes;

public class Person extends Costumer{
    private Costumer Costumer;
    private String Adress;
    private String PreferredContact;
    private String Occupation;

    public Person(Costumer Costumer, String Adress, String PreferredContact, String Occupation, String Name, String LastName1, String LastName2, String ContactMedia1, String ContactMedia2, String ContactMedia3) {
        super(Name, LastName1, LastName2, ContactMedia1, ContactMedia2, ContactMedia3);
        this.Costumer = Costumer;
        this.Adress = Adress;
        this.PreferredContact = PreferredContact;
        this.Occupation = Occupation;
    }

    public String getAdress(){
        return this.Adress;
    }
    
    public void setAdress(String newAdress){
        this.Adress=newAdress;
    }
    
    public String getPreferredContact (){
        return this.PreferredContact;
    }
    
    public void setPreferredContact (String newPreferredContact){
        this.PreferredContact=newPreferredContact;
    }
    
    public String getOcupation(){
        return this.Occupation;
    }
    
    public void setOccupation(String newOccupation){
        this.Occupation=newOccupation;
    }
}
