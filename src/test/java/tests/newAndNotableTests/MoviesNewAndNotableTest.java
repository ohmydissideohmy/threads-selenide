package tests.newAndNotableTests;

import org.junit.Test;
import tests.BaseTest;

public class MoviesNewAndNotableTest extends BaseTest {

    @Test
    public void moviesNewAndNotableTest() {
        homePage.clickOnNewMoviesTab();
        homePage.selectItemInNewAndNotable(0);
        itemPage.checkThatMoviePageIsOpened();
        homePage.clickOnNewMoviesTab();
        homePage.selectItemInNewAndNotable(1);
        itemPage.checkThatMoviePageIsOpened();
        homePage.clickOnNewMoviesTab();
        homePage.selectItemInNewAndNotable(2);
        itemPage.checkThatMoviePageIsOpened();
        homePage.clickOnNewMoviesTab();
        homePage.selectItemInNewAndNotable(3);
        itemPage.checkThatMoviePageIsOpened();
        homePage.clickOnNewMoviesTab();
        homePage.selectItemInNewAndNotable(4);
        itemPage.checkThatMoviePageIsOpened();

    }
}
