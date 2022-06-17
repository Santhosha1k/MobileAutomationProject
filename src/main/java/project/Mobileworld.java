package project;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
public class Mobileworld {
WebDriver driver;
@BeforeMethod
public void Appliction_Lunch()
{
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get("https://mobileworld.azurewebsites.net/");
}
@AfterSuite
public void closeapp()
{
driver.quit();
}
}