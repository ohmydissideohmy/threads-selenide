package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GamesPage {

    private ElementsCollection metaRatings = $$(By.xpath("//tbody/tr/td/div/a/div"));
    private SelenideElement userscoreButton = $(By.xpath("//li[contains(@class, 'user')]"));
    private ElementsCollection userScoreRatings = $$(By.xpath("//table/tbody/tr/td[2]/div[5]/div[2]/a/div"));
    private SelenideElement ps4PlatformButton = $(By.xpath("//div/ul/li[1]/div/span/a"));
    private ElementsCollection gamesList = $$(By.xpath("//div[2]/table/tbody/tr/td[1]/a/img"));

    public void checkGamesSortedByMetaRating() {
        List<String> ratingValues = metaRatings.texts();
        for (int i = 0; i < ratingValues.size() - 1; i++) {
            Assert.assertTrue(Integer.parseInt(ratingValues.get(i)) >= Integer.parseInt(ratingValues.get(i + 1)));
        }
    }

    public void clickOnUserScoreButton() {
        userscoreButton.click();
    }

    public void expandAllDescriptions() {
        for (int i = 0; i < 9; i++) {
            ElementsCollection fixedExpandButtonsList = $$(By.className("clamp-list-expand-label"));
            if (fixedExpandButtonsList.get(i).exists()) {
            fixedExpandButtonsList.get(i).click();
            break;
            }
        }
    }

    public void checkGamesAreSortedByUserScore() {
        List<String> ratingValues = userScoreRatings.texts();
        userScoreRatings.get(0).scrollIntoView(true);
        for (int i = 0; i < ratingValues.size() - 1; i++) {
            if (ratingValues.get(i + 1).length() > 0) {
                Assert.assertTrue(Float.parseFloat(ratingValues.get(i)) >= Float.parseFloat(ratingValues.get(i + 1)));
            } else {
                break;
            }
        }
    }

    public void selectPS4Platform() {
        ps4PlatformButton.click();
    }

    public void checkAllGamesAreForPS4() {
        gamesList.get(5).click();
        $(By.xpath("//div[2]/span/a")).should(Condition.text("Playstation 4"));
    }
}
