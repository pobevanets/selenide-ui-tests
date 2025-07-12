package herokuapp.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement usernameInput = $("#username");
    private SelenideElement passwordInput = $("#password");
    private SelenideElement loginButton = $("button[type='submit']");
    private SelenideElement message = $("#flash");

    public LoginPage open() {
        Selenide.open("/login");
        return this;
    }

    public LoginPage enterUsername(String userName) {
        usernameInput.setValue(userName);
        return this;
    }

    public LoginPage enterPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    public SelenideElement getMessage() {
        return message;
    }
}
