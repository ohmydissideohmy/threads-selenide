package tests.newAndNotableTests;

import org.junit.Test;
import tests.BaseTest;

public class NewAndNotableMusicTest extends BaseTest {

    @Test
    public void newAndNotableMusicTest() {
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(15);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(16);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(17);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(18);
        itemPage.checkThatMusicPageIsOpened();
        homePage.clickOnNewMusicTab();
        homePage.selectItemInNewAndNotable(19);
        itemPage.checkThatMusicPageIsOpened();

    }

}
