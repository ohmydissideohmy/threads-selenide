package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    private SelenideElement movieDescription = $(By.xpath("//div[contains(@class, 'movie product summary')]"));
    private SelenideElement gameDescription = $(By.xpath("//div[contains(@class, 'game_content_head')]"));
    private SelenideElement musicDescription =$(By.xpath("//div[contains(@class, 'album_content_head')]"));
    private SelenideElement tvEpisodes =$(By.xpath("//div[contains(@class, 'inline_ep_guide_episodes')]"));


    public void checkThatMoviePageIsOpened() {
        movieDescription.shouldBe(Condition.visible);
        Selenide.back();
    }

    public void checkThatGamesPageIsOpened() {
        gameDescription.shouldBe(Condition.visible);
    }

    public void checkThatMusicPageIsOpened() {
        musicDescription.shouldBe(Condition.visible);
    }

    public void checkThatTVPageIsOpened() {
        tvEpisodes.shouldBe(Condition.visible);
    }
}
