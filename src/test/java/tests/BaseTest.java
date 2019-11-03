package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import helpers.PropertyReader;
import org.junit.After;
import org.junit.Before;
import pages.*;
import pages.RatingsPage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.WebDriverRunner.*;

public abstract class BaseTest {

    protected PropertyReader propertyReader = new PropertyReader();

    public HomePage homePage = new HomePage();
    public LoginPage loginPage = new LoginPage();
    public AfishaPage afishaPage = new AfishaPage();
    public SearchResultsPage searchResultsPage = new SearchResultsPage();
    public WillWatchPage willWatchPage = new WillWatchPage();
    public GamesPage gamesPage = new GamesPage();

    @Before
    public void setUp() {
//        Configuration.headless = true;
        Configuration.pageLoadStrategy = "normal";
        Selenide.open("https://www.metacritic.com");
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        getWebDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        getWebDriver().close();
    }

}
