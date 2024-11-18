package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {

    static String baseUrl = "https://demowebshop.tricentis.com/";

    @Before
    public void setUpBrowser() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        // navigate to register page
        driver.findElement(By.linkText("Register")).click();

        //verify the register text
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1")).getText();

        // Verify with Assert Junit test

        Assert.assertEquals("Register text not verify", expectedText, actualText);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        // navigate to register page
        driver.findElement(By.linkText("Register")).click();

        // select the gender
        driver.findElement(By.id("gender-male")).click();

        // Enter the required details
        driver.findElement(By.id("FirstName")).sendKeys("prime");
        driver.findElement(By.id("LastName")).sendKeys("test");
        driver.findElement(By.id("Email")).sendKeys("primetest@test.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");

        // click on register button
        driver.findElement(By.id("register-button")).click();

        //verify the register complete text
        String expectedText = "Your registration completed";
        String expectedText2 = "The specified email already exists";
        String actualText = driver.findElement(By.xpath("//div[@class = 'result']")).getText();


        // Verify with Assert Junit test
        Assert.assertEquals("Register not successfully", expectedText, actualText);

      /*  if (actualText.equalsIgnoreCase("Your registration completed")) {
            // Verify with Assert Junit test
            Assert.assertEquals("Register not successfully", expectedText, actualText);
        } else if (actualText.equalsIgnoreCase("The specified email already exists")) {
            // Verify with Assert Junit test
            Assert.assertEquals("Register not successfully", expectedText2, actualText);
        }*/

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
