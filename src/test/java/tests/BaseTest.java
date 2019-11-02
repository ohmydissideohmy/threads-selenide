package tests;

import com.codeborne.selenide.Selenide;
import helpers.PropertyReader;
import org.junit.After;
import org.junit.Before;
import pages.*;
import tests.afishaTests.RatingsPage;

import static com.codeborne.selenide.WebDriverRunner.*;

public abstract class BaseTest {

    protected PropertyReader propertyReader = new PropertyReader();

    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public AfishaPage afishaPage = new AfishaPage();
    public SearchResultsPage searchResultsPage = new SearchResultsPage();
    public WillWatchPage willWatchPage = new WillWatchPage();
    public RatingsPage ratingsPage = new RatingsPage();

    @Before
    public void setUp() {
        Selenide.open("https://www.metacritic.com");
        getWebDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        getWebDriver().close();
    }

}
