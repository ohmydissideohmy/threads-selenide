package tests.newAndNotableTests;

import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableTVTest extends BaseTest {

    @Test
    public void newAndNotableTVTest() {
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(10);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(11);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(12);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(13);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(14);
        itemPage.checkThatTVPageIsOpened();
    }
}
