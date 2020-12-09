package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.LoginPage;

public class LoginSteps extends ScenarioSteps {

    LoginPage loginPage;

    @Step()
    public void openHomepage() {
        loginPage.openHomepage();
    }

    @Step()
    public void clickOnGoogleImage() {
        loginPage.clickOnGoogleImage();
    }

}
