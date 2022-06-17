package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class Contactus extends Mobileworld
{
public void contactUs() throws Login
{
driver.findElement(By.xpath("//a[@id='navbarDropdown']")).click();
driver.findElement(By.linkText("Contact Us")).click();
Set<String> window = driver.getWindowHandles();
List<String> list= new ArrayList<String>(window);
driver.switchTo().window(list.get(1));
Thread.sleep(1000);
System.out.println(driver.getTitle());
WebElement ele3 = driver.findElement(By.className("title"));
Assert.assertTrue(ele3.isDisplayed());
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,550)");
driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("Santhosha");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Santhu@gmail.com");
driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("6360764387");
driver.findElement(By.xpath("//*[@name='message']")).sendKeys("rxctvy yugytf fguy");
driver.findElement(By.xpath("//*[@type='submit']")).click();
driver.switchTo().window(list.get(0));
System.out.println(driver.getTitle());
String ele4 = driver.getTitle();
}
}

