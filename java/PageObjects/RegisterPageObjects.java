package PageObjects;

import Driverpackage.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class RegisterPageObjects extends Abstract {
    WebDriver driver;

    public RegisterPageObjects(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID,using = "addNewRecordButton")
    private WebElement addbutton;
    @FindBy(how=How.ID,using = "firstName")
    private WebElement firstname;
    @FindBy(how=How.ID,using = "lastName")
    private WebElement lastname;
    @FindBy(how=How.ID,using = "userEmail")
    private WebElement email;
    @FindBy(how = How.ID,using = "age")
    private WebElement age;
    @FindBy(how = How.ID,using = "salary")
    private WebElement salary;
    @FindBy(how=How.ID,using = "department")
    private WebElement department;
    @FindBy(how = How.ID,using = "submit")
    private WebElement submitbutton;

    public void clickaddbutton(){
        clickF(addbutton);
    }
    public void userFillsFirstname(){
        sendKeysF(firstname,"John");
    }
    public void userFillsLastname(){
        sendKeysF(lastname,"Manson");
    }
    public void userFillsEmail(){

        sendKeysF(email,"john@example.com");
    }
    public void userFillsAge(){
        sendKeysF(age,"25");
    }
    public void userFillsSalary(){
        sendKeysF(salary,"15000");
    }
    public void userFillsDepartment(){
        sendKeysF(department,"Information Technology");
    }
    public void userClicksOnSubmitButton(){
        clickF(submitbutton);
    }

}
