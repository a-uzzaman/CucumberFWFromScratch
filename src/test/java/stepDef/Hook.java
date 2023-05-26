package stepDef;

import base.setup;
import io.cucumber.java.Before;


public class Hook extends setup {


    public static String url;
    public static String existingStudentEmail;
    public static String existingStudentPass;
    // Get the string value from CLI and use it in the code
    public static String browser = System.getProperty("browser");
    public static String testEnv = System.getProperty("env");

    @Before
    public void startTest(){
        //This switch case will see what test env to run in and select the variable values accordingly
        //If there is no values given it will chose the default values in the switch case
        switch (testEnv){
            case "qa":
                url = "http://qa.taltektc.com";
                existingStudentEmail = "";
                existingStudentPass = "";
                break;
            case "stage":
                url = "http://stage.taltektc.com";
                existingStudentEmail = "";
                existingStudentPass = "";
                break;
            case "prod":
                url = "http://prod.taltektc.com";
                existingStudentEmail = "";
                existingStudentPass = "";
                break;
            default:
                url = "http://qa.taltektc.com";
                browser = "ch";
                break;
        }

        System.out.println("Starting browser "+browser+" and environment "+testEnv+" . To start the test case.");
        //Instantiating the browser according to default or the browser provided in the CLI
        driver = setupBrowser(browser);
        //This will open the page in the instantiated browser according to the test env selected or by default
        driver.get(url);
    }



}
