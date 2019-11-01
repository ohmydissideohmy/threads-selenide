package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RatingsPage {

    List<String> sortedResults = new ArrayList<>();

    private ElementsCollection selectDropdowns = $$(By.className("sortStat"));
    private ElementsCollection sortingResultNames = $$(By.xpath("//tr[contains(@id, 'top250')]/td[2]/a"));
    private SelenideElement worstMoviesSelect = $(By.className("badMovie"));
    private ElementsCollection ratingsList = $$(By.className(".continue"));
    private SelenideElement marksTabButton = $(By.xpath("//*[@id=\"block_left\"]/div/div[1]/ul/li[1]/a"));
    private ElementsCollection marksNumber = $$(By.xpath("//tbody/tr/td[2]/table/tbody/tr/td[3]/small"));
    private ElementsCollection ratingsOnMarksTab = $$(By.xpath("//tbody/tr/td[3]/a/span"));
    private SelenideElement byRatingOnSortButton = $(By.xpath("//*[@id=\"nav_best_num_vote\"]/a"));

    public void selectMoviesYears(String year) {
        selectDropdowns.get(0).selectOptionContainingText(year);
    }

    public void checkMoviesAreSortedByYear(String filterText) {
        List<String> strings = sortingResultNames.texts();
        for (String a : strings) {
            Assert.assertTrue(a.contains(filterText));
        }
    }

    public void checkMoviesAreSortedByExactYear(String filterText) {
        List<String> strings = sortingResultNames.texts();
        for (String a : strings) {
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

    public void selectWorstMovie(String value) {
        worstMoviesSelect.selectOptionContainingText(value);
    }

    public void checkMoviesAreSortedAsWorst() {
        List<String> ratingValues = ratingsList.texts();
        for (int i = 0; i < ratingValues.size(); i++) {
            Assert.assertTrue(Float.parseFloat(ratingValues.get(i)) < Float.parseFloat(ratingValues.get(i + 1)));
        }
    }

    public void openMarksTab() {
        marksTabButton.click();
    }

    public void checkMoviesAreSortedByMarksNumber() {
        List<String> marksNumberValues = marksNumber.texts();
        for (int i = 0; i < 9; i++) {
            Assert.assertTrue(Float.parseFloat(marksNumberValues.get(i)) > Float.parseFloat(marksNumberValues.get(i + 1)));
        }

    }

    public void checkMoviesAreSortedByRatingOnMarksTab() {
        List<String> values = ratingsOnMarksTab.texts();
        for (int i = 0; i < 19; i++) {
            if (!values.get(i).isEmpty()) {
                Assert.assertTrue(Float.parseFloat(values.get(i)) > Float.parseFloat(values.get(i + 1)));
            }
        }
    }

    public void clickOnRatingsByButton() {
        byRatingOnSortButton.click();
    }
}
