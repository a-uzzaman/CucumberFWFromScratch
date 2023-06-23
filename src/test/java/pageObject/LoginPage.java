package pageObject;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends setup{

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        setup.driver = driver;
    }

    @FindBy(linkText = "Create New Account")
    public WebElement CreateAccountLink;

    public void verifyTitle(){
        String actTitle = driver.getTitle();
        String expTitle= "Sign In";
        Assert.assertEquals(actTitle,expTitle,"The title does not match");
    }


}
