package herokuapp.tests;

import herokuapp.pages.LoginPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class LoginTests extends BaseTest {

    @Test
    public void loginWithValidCreds() {
        new LoginPage().open()
                .enterUsername("tomsmith")
                .enterPassword("SuperSecretPassword!")
                .clickLoginButton()
                .getMessage().shouldHave(text("You logged into a secure area!"));
    }

    @Test
    public void loginWithWrongPassword() {
        new LoginPage().open()
                .enterUsername("tomsmith")
                .enterPassword("wrongPassword")
                .clickLoginButton()
                .getMessage().shouldHave(text("Your password is invalid!"));
    }

}
