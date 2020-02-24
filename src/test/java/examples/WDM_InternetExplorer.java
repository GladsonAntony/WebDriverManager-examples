package examples;

import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WDM_InternetExplorer
{
    public static WebDriver ieDriver;

    @Test
    public void test_InternetExplorer() throws Exception
    {
        WebDriverManager.iedriver().arch64().setup();
//        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
//        ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        ieDriver = new InternetExplorerDriver();
        ieDriver.manage().window().maximize();
        ieDriver.get("https://www.google.co.in/");
    }

    @AfterMethod
    public void tearDown() throws Exception
    {
        ieDriver.quit();
    }
}
