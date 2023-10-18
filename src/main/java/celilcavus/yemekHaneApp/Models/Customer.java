package celilcavus.yemekHaneApp.Models;

public class Customer {

    public int id;

    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

}
