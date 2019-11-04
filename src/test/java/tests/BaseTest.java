package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import helpers.PropertyReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import pages.*;


import java.io.File;
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

    ChromeOptions options = new ChromeOptions();

    @Rule
    public BrowserWebDriverContainer chrome =
            new BrowserWebDriverContainer()
                    .withRecordingMode(BrowserWebDriverContainer.VncRecordingMode.RECORD_FAILING, new File("build"))
                    .withCapabilities(options.setPageLoadStrategy(PageLoadStrategy.NORMAL))
                    .withCapabilities(options.addArguments("--disable-dev-shm-usage"));

    @Before
    public void setUp() {
        RemoteWebDriver driver = chrome.getWebDriver();
        WebDriverRunner.setWebDriver(driver);
        Selenide.open("https://www.metacritic.com");
        getWebDriver().manage().window().maximize();
        getWebDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        getWebDriver().quit();
    }

}
