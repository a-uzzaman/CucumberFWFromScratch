package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpPage extends setup {

    public SignUpPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }


    @FindBy(name = "firstName")
    public WebElement firstNameLoc;
    @FindBy(name = "lastName")
    public WebElement lastNameLoc;
    @FindBy(name = "email")
    public WebElement emailLoc;
    @FindBy(name = "password")
    public WebElement password;
    @FindBy(name ="confirmPassword")
    public WebElement confirmPassword;
    @FindBy(name = "month")
    public WebElement DOBMonth;
    @FindBy(name = "day")
    public WebElement DOBDay;
    @FindBy(name = "year")
    public WebElement DOBYear;
    @FindBy(name = "gender")
    public WebElement Gender;
    @FindBy(name = "agree")
    public WebElement Agree;
    @FindBy(xpath="//button[@type ='submit']")
    public WebElement submitButton;

    public void fillForm(String firstName,String lastName,String email,String Password,String ConfirmPassword,String month){
        firstNameLoc.sendKeys(firstName);
        lastNameLoc.sendKeys(lastName);
        emailLoc.sendKeys(email);
        password.sendKeys(Password);
        confirmPassword.sendKeys(ConfirmPassword);
        Select sMonth = new Select(DOBMonth);
        sMonth.selectByValue(month);
    }

    public void verifyTitle(){
        String actTitle = driver.getTitle();
        String expTitle= "Sign Up";
        Assert.assertEquals(actTitle,expTitle,"The title does not match");
    }
}
