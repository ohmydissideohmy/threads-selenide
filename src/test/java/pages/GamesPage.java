package pages;

import com.codeborne.selenide.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.*;
import static java.util.concurrent.TimeUnit.*;

public class GamesPage {

    private ElementsCollection metaRatings = $$(By.xpath("//tbody/tr/td/div/a/div"));
    private SelenideElement userscoreButton = $(By.xpath("//li[contains(@class, 'user')]"));
    private ElementsCollection expandButtonsList = $$(By.className("clamp-list-expand-label"));
    private ElementsCollection userScoreRatings = $$(By.xpath("//table/tbody/tr/td[2]/div[5]/div[2]/a/div"));
    private SelenideElement ps4PlatformButton = $(By.xpath("//div/ul/li[1]/div/span/a"));
    private ElementsCollection gamesList = $$(By.xpath("//div[2]/table/tbody/tr/td[1]/a/img"));

    public void checkGamesSortedByMetaRating() {
        List<String> ratingValues = metaRatings.texts();
        for (int i = 0; i < ratingValues.size() -1; i++) {
            Assert.assertTrue(Integer.parseInt(ratingValues.get(i)) >= Integer.parseInt(ratingValues.get(i + 1)));
        }
    }

    public void clickOnUserScoreButton() {
        userscoreButton.click();
    }

    public void expandAllDescriptions() {
//        ElementsCollection fixedExpandButtonsList = $$(By.className("clamp-list-expand-label"));
//        for (SelenideElement i : fixedExpandButtonsList) {
//            try {
//                i.click();
//            } catch(org.openqa.selenium.StaleElementReferenceException ex)
//            {
//                ex.fillInStackTrace();
//                i.click();
//            }
//        }
        userscoreButton.scrollIntoView(true);
        Boolean staleElement = true;
        while(staleElement){
            try{
                ElementsCollection fixedExpandButtonsList = $$(By.className("clamp-list-expand-label"));
                for (SelenideElement i: fixedExpandButtonsList) {
                    i.click();
                }
                staleElement = false;
            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }


    }

    public void checkGamesAreSortedByUserScore() {
        List<String> ratingValues = userScoreRatings.texts();
        userScoreRatings.get(0).scrollIntoView(true);
        for (int i = 0; i < ratingValues.size() - 1; i++) {
            Assert.assertTrue(Float.parseFloat(ratingValues.get(i)) >= Float.parseFloat(ratingValues.get(i + 1)));
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
