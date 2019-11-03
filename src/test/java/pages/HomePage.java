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

    public void clickOnSignInButton() {
        loginButton.click();
    }

    public void checkloggedUserAvatarIsVisible() {
        loggedUserAvatar.shouldBe(Condition.visible);
    }

    public void clickOnGamesButton() {
        gamesButton.click();
    }
}
