package tests.afishaTests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

public class RatingsPage {

    List<String> sortedResults = new ArrayList<>();

    private ElementsCollection selectDropdowns = $$(By.className("sortStat"));
    private ElementsCollection sortingResultNames = $$(By.xpath("//tr[contains(@id, 'top250')]/td[2]/a"));

    public void selectMoviesYears(String year) {
        selectDropdowns.get(0).selectOptionContainingText(year);
    }

    public void checkMoviesAreSortedByYear(String filterText) {
        List<String> strings = sortingResultNames.texts();
        for (String a:strings) {
            Assert.assertTrue(a.contains(filterText));
        }
    }

    public void checkMoviesAreSortedByExactYear(String filterText) {
        List<String> strings = sortingResultNames.texts();
        for (String a:strings) {
            Assert.assertTrue(a.contains(filterText));
        }
    }


    public void searchForMovieByExactYear(String year) {
        selectDropdowns.get(1).selectOptionContainingText(year);
    }

    public void getMoviesList() {
        sortedResults = sortingResultNames.texts();
    }

    public void checkMoviesSortedByDefault() {
        for (int i = 0; i < sortingResultNames.size(); i++) {
            Assert.assertEquals(sortedResults.get(i), sortingResultNames.get(i).getText());
        }
    }
}
