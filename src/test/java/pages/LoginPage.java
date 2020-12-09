package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public void openHomepage() {
        getDriver().get("https://google.com/");
    }

    public void clickOnGoogleImage() {
        WebElement googleImage = getDriver().findElement(By.id("hplogo"));
        googleImage.click();
    }


}
