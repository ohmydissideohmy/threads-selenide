package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    private ElementsCollection searchResultsList = $$(By.xpath("//ul[contains(@class, 'search_results module')]/li/div/div[2]/div/h3/a"));


    public void clickOnFirstItem() {
        searchResultsList.get(1).click();
    }
}
