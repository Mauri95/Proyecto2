
package practica2.Clientes;

public class Costumer {
    private String Name;
    private String LastName1;
    private String LastName2;
    private String ContactMedia1;
    private String ContactMedia2;
    private String ContactMedia3;
    
    //Constructor de Cliente Padre
    public Costumer(String Name, String LastName1, String LastName2,String ContactMedia1, String ContactMedia2, String ContactMedia3){
        this.Name=Name;
        this.LastName1=LastName1;
        this.LastName2=LastName2;
        this.ContactMedia1=ContactMedia1;
        this.ContactMedia2=ContactMedia2;
        this.ContactMedia3=ContactMedia3;
    }

    public String getName(){
        return Name;
    }
    
    public void setName (String newName){
        this.Name=newName;
    }
    
    public String getLastName1(){
        return LastName1;
    }
    
    public void setLastName1 (String newLastName1){
        this.LastName1=newLastName1;
    }
    
    public String getLastName2(){
        return LastName2;
    }
    
    public void setLastName2(String newLastName2){
        this.LastName2=newLastName2;
    }

    public String getContactMedia1() {
        return ContactMedia1;
    }

    public void setContactMedia1(String ContactMedia1) {
        this.ContactMedia1 = ContactMedia1;
    }

    public String getContactMedia2() {
        return ContactMedia2;
    }

    public void setContactMedia2(String ContactMedia2) {
        this.ContactMedia2 = ContactMedia2;
    }

    public String getContactMedia3() {
        return ContactMedia3;
    }

    public void setContactMedia3(String ContactMedia3) {
        this.ContactMedia3 = ContactMedia3;
    }
    
}
