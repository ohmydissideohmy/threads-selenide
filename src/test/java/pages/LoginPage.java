package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    private SelenideElement loginPlaceholder = $(By.name("email"));
    private SelenideElement passwordPlaceholder = $(By.name("password"));
    private SelenideElement incorrectPasswordError = $(By.className("form_feedback"));
    private SelenideElement loginButton = $(By.className("flat_blue_btn"));

    public void inputLogin(String key) {
        loginPlaceholder.sendKeys(key);
    }



    public void inputPassword(String key) {
        passwordPlaceholder.sendKeys(key);
    }

    public void inputIncorrectLogin(String key) {
        loginPlaceholder.sendKeys(key);
    }

    public void checkPasswordPlaceholderIsNotVisible() {
        passwordPlaceholder.shouldBe(Condition.not(Condition.visible));
    }

    public void checkIncorrectPasswordErrorIsShown() {
        incorrectPasswordError.shouldBe(Condition.visible);
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }
}
