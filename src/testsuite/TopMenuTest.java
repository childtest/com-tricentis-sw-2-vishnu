package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {


    static String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUpBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        // navigate to COMPUTERS tab
        driver.findElement(By.linkText("Computers")).click();

        String expectedText = "Computers";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Computers tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        // navigate to Electronics tab
        driver.findElement(By.linkText("Electronics")).click();

        String expectedText = "Electronics";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify  text with Assert Junit
        Assert.assertEquals("Electronics tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelAndShoesPageSuccessfully() {

        // navigate to Apparel & Shoes tab
        driver.findElement(By.linkText("Apparel & Shoes")).click();

        String expectedText = "Apparel & Shoes";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Apparel & Shoes tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        // navigate to Digital downloads tab
        driver.findElement(By.linkText("Digital downloads")).click();

        String expectedText = "Digital downloads";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Digital downloads tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        // navigate to Books tab
        driver.findElement(By.linkText("Books")).click();

        String expectedText = "Books";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Book tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        // navigate to Jewelry tab
        driver.findElement(By.linkText("Jewelry")).click();

        String expectedText = "Jewelry";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Jewelry tab text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        // navigate to Gift Cards tab
        driver.findElement(By.linkText("Gift Cards")).click();

        String expectedText = "Gift Cards";

        //find the welcome text with xpath locator
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        //verify text with Assert Junit
        Assert.assertEquals("Gift Cards tab text not verify", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
