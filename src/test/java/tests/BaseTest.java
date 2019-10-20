package tests;

import com.codeborne.selenide.Selenide;
import helpers.PropertyReader;
import org.junit.After;
import org.junit.Before;
import pages.*;

import static com.codeborne.selenide.WebDriverRunner.*;

public abstract class BaseTest {

    protected PropertyReader propertyReader = new PropertyReader();

    public HomePage homePage = new HomePage();
    public YandexPasportPage yandexPasportPage = new YandexPasportPage();
    public AfishaPage afishaPage = new AfishaPage();
    public SearchResultsPage searchResultsPage = new SearchResultsPage();
    public WillWatchPage willWatchPage = new WillWatchPage();

    @Before
    public void setUp() {
        Selenide.open("https://www.kinopoisk.ru");
        getWebDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        getWebDriver().close();
    }

}
