package herokuapp.tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DropdownTests extends BaseTest {
    @Test
    public void selectDropdownOption() {
        Selenide.open("/dropdown");
        $("#dropdown").selectOption("Option 2");
        $("#dropdown").getSelectedOption().shouldHave(text("Option 2"));
    }
}
