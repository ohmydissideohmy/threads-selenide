package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AfishaPage {

    private SelenideElement countryDropdown = $(By.xpath("//div[contains(@class, 'selectCountry')]/div"));
    private SelenideElement cityDropdown = $(By.xpath("//div[contains(@class, 'selectCity')]/div"));
    private SelenideElement filmDropdown = $(By.name("id_film"));
    private SelenideElement showResultsButton = $(By.xpath("//div[contains(@class, 'formButton')]"));

    public void checkCountryIsCorrect() {
        countryDropdown.shouldBe(Condition.text("Беларусь"));
    }

    public void checkCityIsCorrect() {
        cityDropdown.shouldBe(Condition.text("Могилёв"));

    }

    public void selectMovieInDropdown(String searchValue) {
        filmDropdown.selectOptionContainingText(searchValue);
    }

    public void clickOnShowResultsButton() {
        showResultsButton.click();
    }

    public void clickOnMoviesDropdown() {
        filmDropdown.click();
    }
}
