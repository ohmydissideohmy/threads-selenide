package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class YandexPasportPage {

    private SelenideElement loginPlaceholder = $(By.id("passp-field-login"));
    private SelenideElement passwordPlaceholder = $(By.id("passp-field-passwd"));
    private SelenideElement incorrectPasswordError = $(By.xpath("//div[contains(@class, 'passp-form-field__error')]"));

    public void inputLogin(String key) {
        loginPlaceholder.sendKeys(key);
        loginPlaceholder.submit();
    }

    public void inputPassword(String key) {
        passwordPlaceholder.sendKeys(key);
        passwordPlaceholder.submit();
    }

    public void inputIncorrectLogin(String key) {
        loginPlaceholder.sendKeys(key);
        loginPlaceholder.submit();
    }

    public void checkPasswordPlaceholderIsNotVisible() {
        passwordPlaceholder.shouldBe(Condition.not(Condition.visible));
    }

    public void checkIncorrectPasswordErrorIsShown() {
        incorrectPasswordError.shouldBe(Condition.visible);
    }
}
