package Steps;

import Driverpackage.Driver;
import PageObjects.RegisterPageObjects;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RegisterStep {
    private WebDriver driver;
    RegisterPageObjects registerPageObjects=new RegisterPageObjects();

    @Given("^navigate to website$")
    public void navigate_to_website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Given("^clicks add button$")
    public void clicks_add_button() throws Throwable {
        registerPageObjects.clickaddbutton(); Thread.sleep(1000);
    }

    @Given("^user fills firstname$")
    public void user_fills_firstname() throws Throwable {
        registerPageObjects.userFillsFirstname();Thread.sleep(1000);
    }

    @Given("^user fills lastname$")
    public void user_fills_lastname() throws Throwable {
        registerPageObjects.userFillsLastname();Thread.sleep(1000);

    }

    @Given("^user fills email$")
    public void user_fills_email() throws Throwable {
        registerPageObjects.userFillsEmail();Thread.sleep(1000);
    }

    @Given("^user fills age$")
    public void user_fills_age() throws Throwable {
        registerPageObjects.userFillsAge();Thread.sleep(1000);

    }

    @Given("^user fills salary$")
    public void user_fills_salary() throws Throwable {
        registerPageObjects.userFillsSalary();Thread.sleep(1000);

    }

    @Given("^user fills department$")
    public void user_fills_department() throws Throwable {
        registerPageObjects.userFillsDepartment();Thread.sleep(1000);

    }

    @When("^clicks submit button$")
    public void clicks_submit_button() throws Throwable {
        registerPageObjects.userClicksOnSubmitButton();Thread.sleep(1000);

    }

    @Then("^user close the submit form$")
    public void user_close_the_submit_form() throws Throwable {
        Thread.sleep(1000);
        Driver.closeDriver();
    }


}