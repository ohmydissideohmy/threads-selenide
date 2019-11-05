package tests.newAndNotableTests;

import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableTVTest extends BaseTest {

    @Test
    public void newAndNotableTVTest() {
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(0);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(1);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(2);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(3);
        itemPage.checkThatTVPageIsOpened();
        homePage.clickOnNewTVTab();
        homePage.selectItemInNewAndNotable(4);
        itemPage.checkThatTVPageIsOpened();

    }

}
