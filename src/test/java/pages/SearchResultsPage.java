package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private ElementsCollection cinemas = $$(By.className("schedule-cinema__name"));
    private ElementsCollection moviesList = $$(By.xpath("//div[contains(@class, 'schedule-film__details')]/a"));
    private ElementsCollection moviesNamesList = $$(By.xpath("//p[contains(@class, 'name')]/a"));
    private SelenideElement searchError = $(By.xpath("//*[@id='block_left_pad']/div/table/tbody/tr[1]/td/h2"));

    public void openRandomCinema() {
        cinemas.first().click();
    }

    public void checkThatCinemaHaveSelectedMovie(String searchValue) {
        moviesList.filterBy(Condition.text(searchValue)).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }

    public void checkThatCityHaveExactCinema(String cinema) {
        cinemas.find(Condition.text(cinema)).shouldBe(Condition.visible);
    }

    public void checkMovieFound(String movieName) {
        moviesNamesList.filterBy(Condition.text(movieName)).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }

    public void checkSearchErrorIsShown() {
        searchError.should(Condition.visible);
    }
}
