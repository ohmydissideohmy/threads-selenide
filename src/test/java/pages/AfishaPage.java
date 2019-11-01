package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import helpers.PropertyReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class AfishaPage {

    private SelenideElement countryDropdown = $(By.xpath("//div[contains(@class, 'selectCountry')]/div"));
    private SelenideElement cityDropdown = $(By.xpath("//div[contains(@class, 'selectCity')]/div"));
    private SelenideElement filmDropdown = $(By.name("id_film"));
    private SelenideElement showResultsButton = $(By.xpath("//div[contains(@class, 'formButton')]"));
    private SelenideElement openedCountryDropdown = $(By.className("list"));
    private SelenideElement ratingSortButton = $(By.xpath("//tbody/tr/td[4]/small/a"));
    private ElementsCollection moviesRatingList = $$(By.className("rating_ball_green"));

    public void checkCountryIsCorrect(String country) {
        countryDropdown.shouldBe(Condition.text("Беларусь"));
    }

    public void checkCityIsCorrect() {
        cityDropdown.shouldBe(Condition.text("Могилёв"));

    }

    public void selectMovieInDropdown() {
        filmDropdown.selectOptionContainingText(System.getProperty("movie"));
    }

    public void clickOnShowResultsButton() {
        showResultsButton.click();
    }

    public void clickOnMoviesDropdown() {
        filmDropdown.click();
    }

    public void selectCountryFromDropdown(String searchValue) {
        countryDropdown.click();
        openedCountryDropdown.selectOption(searchValue);
    }

    public void selectCityFromDropdown(String searchValue) {
        cityDropdown.selectOptionContainingText(searchValue);
    }

    public void checkMoviesSortedByRating() {
        for (int i =0; i < moviesRatingList.size() -1 ; i++) {
            Assert.assertTrue(Float.parseFloat(moviesRatingList.get(i).getText()) > Float.parseFloat(moviesRatingList.get(i+1).getText()));
        }
    }

    public void clickOnSortByResults() {
        ratingSortButton.click();
    }

    public void getMovieFromDropdown() {
        Select select = new Select(filmDropdown);
        filmDropdown.click();
        List<WebElement> options = select.getOptions();
        System.setProperty("movie",options.get(10).getText());
    }
}
