package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private ElementsCollection cinemas = $$(By.className("schedule-cinema__name"));
    private ElementsCollection moviesList = $$(By.xpath("//div[contains(@class, 'schedule-film__details')]/a"));

    public void openRandomCinema() {
        cinemas.first().click();
    }

    public void checkThatCinemaHaveSelectedMovie(String searchValue) {
        moviesList.filterBy(Condition.text(searchValue)).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }
}
