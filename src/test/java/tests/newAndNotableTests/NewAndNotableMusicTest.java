package tests.newAndNotableTests;

import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableMusicTest extends BaseTest {

    @Test
    public void newAndNotableMusicTest() {
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(0);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(1);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(2);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(3);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(4);
        itemPage.checkThatMusicPageIsOpened();

    }

}
