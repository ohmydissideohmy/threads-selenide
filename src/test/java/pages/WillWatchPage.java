package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WillWatchPage  {

    private ElementsCollection moviesNamesList = $$(By.className("name"));

    public void movieShouldBeInList(String movieName) {
        moviesNamesList.filterBy(Condition.text(movieName)).shouldBe(CollectionCondition.sizeGreaterThan(0));
    }

}
