package testData;

import com.github.javafaker.Faker;

public class userData {

    private String firstName;
    private String lastName;
    private String email;
    private String Password;
    private String ConfirmPassword;
    private String month;

    private Faker fk = new Faker();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void createFakeData(){
        setFirstName(fk.name().firstName());
        setLastName(fk.name().lastName());
        setEmail(fk.internet().emailAddress());
        setPassword(fk.internet().password());
        setConfirmPassword(getPassword());
    }
}
