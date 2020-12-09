package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class BasePage extends PageObject {

    public void switchToNewWindow() {
        Set<String> allWindowHandles = getDriver().getWindowHandles();
        for (String s : allWindowHandles) {
//            System.out.println("handle: " + s);
            getDriver().switchTo().window(s);
        }
    }

    public void clickOnElement(String css) {
        WebElement elem = getDriver().findElement(By.cssSelector(css));
        elem.click();
    }

    public void clickOnElement(By by) {
        WebElement elem = getDriver().findElement(by);
        elem.click();
    }

    public void clickOnElementById(String id) {
        WebElement elem = getDriver().findElement(By.id(id));
        elem.click();
    }

    public void clickOnElementInList(By by, String elemName) {
        List<WebElement> list = getDriver().findElements(by);
        for (WebElement e : list) {
            if (e.getText().contentEquals(elemName)) {
                e.click();
                break;
            }
        }
    }

    public void insertText(By by, String text) {
        WebElement elem = getDriver().findElement(by);
        elem.clear();
        elem.sendKeys(text);
    }

    public void verifyText(By by, String text) {
        WebElement elem = getDriver().findElement(by);
        Assert.assertTrue("Received: " + text + " , Actual: " + elem.getText(), elem.getText().contentEquals(text));
    }

    public void verifyTextInList(By by, String text) {
        List<WebElement> list = getDriver().findElements(by);
        boolean found = false;
        for (WebElement e : list) {
//            System.out.println("aaaaaaaaaa: " + e.getText());
            if (e.getText().contentEquals(text)) {
                found = true;
                break;
            }
        }
        Assert.assertTrue(text + " was not found in the list", found);
    }

    public void enterTextWithDelay(By by, String textInput) {
        WebElement elem = getDriver().findElement(by);
        for (int i = 0; i < textInput.length(); i++) {
            waitABit(200);
            elem.sendKeys(textInput.charAt(i) + "");
        }
    }

    public void verifyElementIsNotPresent(By by) {
        try {
            WebElement elem = getDriver().findElement(by);
            Assert.assertTrue("Element was present", false);
        } catch (Exception e) {
        }
    }

}
