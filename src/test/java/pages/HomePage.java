package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private SelenideElement afishaButton = $(By.xpath("//input[@placeholder='Фильмы, персоны, кинотеатры']"));
    private SelenideElement signInButton = $(By.xpath("//button[contains(@class, 'login-button')]"));
    private SelenideElement loggedUserAvatar = $(By.xpath("//div[contains(@class, 'user-container')]"));
    private ElementsCollection headerItems = $$(By.xpath("//a[contains(@class, 'navigation-item')]"));

    public void inputInSearchPlaceholder() {
        afishaButton.sendKeys("Drake");
        afishaButton.submit();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public void checkloggedUserAvatarIsVisible() {
        loggedUserAvatar.shouldBe(Condition.visible);
    }

    public void clickOnAfishaButton() {
        headerItems.get(0).click();
    }
}
