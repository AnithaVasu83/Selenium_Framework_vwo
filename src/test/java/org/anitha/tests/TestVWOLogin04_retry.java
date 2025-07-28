package org.anitha.tests;
import org.anitha.listeners.RetryAnalyzer;
import org.anitha.listeners.ScreenshotListener;
import org.anitha.base.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import static org.anitha.base.DriverManager.getDriver;

@Listeners(ScreenshotListener.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestVWOLogin04_retry extends BaseTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin04_retry.class);

    @Owner("Anitha")
    @Description("Verify that invalid credits give error message")
    @Test
    public void testFail() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(false);
    }

    @Owner("Anitha")
    @Description("Verify that invalid credits give error message")
    @Test
    public void testPass() {
        getDriver().get("https://app.vwo.com");
        logger.info("Starting the Testcases Page Object Model");
        Assert.assertTrue(true);
    }


}
