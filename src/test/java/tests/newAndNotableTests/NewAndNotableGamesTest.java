package tests.newAndNotableTests;


import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableGamesTest extends BaseTest {

    @Test
    public void newAndNotableGamesTest() {
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(0);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(1);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(2);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(3);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(4);
        itemPage.checkThatGamesPageIsOpened();

    }

}
