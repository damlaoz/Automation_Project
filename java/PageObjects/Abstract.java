package PageObjects;

import Driverpackage.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public abstract class Abstract {
    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver,10);

    public void clickF(WebElement clickE){
        wait.until(ExpectedConditions.elementToBeClickable(clickE));
        clickE.click();
    }
    public void sendKeysF(WebElement sendKeysE,String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysE));
        sendKeysE.sendKeys(value);
    }

}
