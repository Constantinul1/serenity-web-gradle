package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class SomeTest {

    @Managed(uniqueSession = true)
    private WebDriver webDriver;

    @Steps
    LoginSteps loginSteps;

    @Test
    public void someTest() {
        loginSteps.openHomepage();
        loginSteps.clickOnGoogleImage();
    }

}
