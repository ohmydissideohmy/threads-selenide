package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private SelenideElement afishaButton = $(By.xpath("//input[@placeholder='Фильмы, персоны, кинотеатры']"));
    private SelenideElement loginButton = $(By.id("login"));
    private SelenideElement loggedUserAvatar = $(By.id("primary_menu_user_profile"));
    private ElementsCollection headerItems = $$(By.xpath("//a[contains(@class, 'navigation-item')]"));
    private SelenideElement searchPlaceholder = $(By.className("header-fresh-search-partial-component__field"));

    public void clickOnSignInButton() {
        loginButton.click();
    }

    public void checkloggedUserAvatarIsVisible() {
        loggedUserAvatar.shouldBe(Condition.visible);
    }

    public void clickOnAfishaButton() {
        headerItems.get(0).click();
    }


    public void inputInSearchPlaceholder(String value) {
        searchPlaceholder.sendKeys(value);
        searchPlaceholder.submit();
    }

    public void openRatingsPage() {
        headerItems.get(2).click();
    }
}
