package stepDef;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import testData.jsonParser;
import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import pageObject.SignUpPage;
import testData.userData;

public class SignUpStepDef extends setup {
    jsonParser jsparser = new jsonParser();
    LoginPage lp = new LoginPage(driver);
    SignUpPage sp = new SignUpPage(driver);

    userData ud= new userData();
    @Given("I am at the landing page")
    public void iAmAtTheLandingPage() {
        lp.verifyTitle();
    }

    @When("I enter user data")
    public void iEnterUserData() throws IOException, ParseException {
        ud.createFakeData();
        JSONObject jobj= jsonParser.readJsonFile("C:/Users/ashif/OneDrive/Documents/GitHub/cucumberBDD2022/src/test/java/TestData/userInfo.json");
        System.out.println("The first name is "+ud.getFirstName()+"----------------------");
        sp.fillForm(jsonParser.getValueByKey(jobj,"firstName"),jsonParser.getValueByKey(jobj,"lastName"),"",ud.getPassword(),ud.getConfirmPassword());
    }

    @And("Submit to create account")
    public void submitToCreateAccount() {
        sp.submitButton.click();
    }

    @Then("New user should be created and Student ID will be provided")
    public void newUserShouldBeCreatedAndStudentIDWillBeProvided() {
        System.out.println("Test complete");
    }

    @When("Navigate to Sign Up page")
    public void navigateToSignUpPage() {
        lp.CreateAccountLink.click();
        sp.verifyTitle();
    }
}
