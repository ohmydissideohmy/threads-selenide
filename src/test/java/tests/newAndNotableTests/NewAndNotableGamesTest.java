package tests.newAndNotableTests;


import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableGamesTest extends BaseTest {

    @Test
    public void newAndNotableGamesTest() {
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(5);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(6);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(7);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(8);
        itemPage.checkThatGamesPageIsOpened();
        homePage.clickOnNewGamesTab();
        homePage.selectItemInNewAndNotable(9);
        itemPage.checkThatGamesPageIsOpened();

    }

}
