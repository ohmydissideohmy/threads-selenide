package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {

    private SelenideElement loginButton = $(By.id("login"));
    private SelenideElement gamesButton = $(By.id("primary_nav_item_games"));
    private SelenideElement loggedUserAvatar = $(By.id("primary_menu_user_profile"));
    private ElementsCollection newAndNotableTabs = $$(By.xpath("//ul[contains(@class, 'tabs_type_1')]/li"));
    private ElementsCollection newAndNotableItems = $$(By.xpath("//ol[contains(@class, 'slot_products')]/li"));

    public void clickOnSignInButton() {
        loginButton.click();
    }

    public void checkloggedUserAvatarIsVisible() {
        loggedUserAvatar.shouldBe(Condition.visible);
    }

    public void clickOnGamesButton() {
        gamesButton.click();
    }

    public void clickOnNewMoviesTab() {
        newAndNotableTabs.get(0).click();
    }

    public void selectItemInNewAndNotable(int number) {
        newAndNotableItems.get(number).shouldBe(Condition.visible);
        newAndNotableItems.get(number).click();
    }

    public void clickOnNewGamesTab() {
        newAndNotableTabs.get(1).click();
    }

    public void clickOnNewMusicTab() {
        newAndNotableTabs.get(3).click();
    }

    public void clickOnNewTVTab() {
        newAndNotableTabs.get(2).click();
    }
}
