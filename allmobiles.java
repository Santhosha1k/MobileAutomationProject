package Automation;
import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class allmobiles extends Lunchingapplivation
{
@Test(priority = 2)
public void search() throws InterruptedException
{
driver.findElement(By.xpath("//a[.='All Mobiles']")).click();
WebElement ele = driver.findElement(By.xpath("//b[.='All Mobile Details']"));
Assert.assertTrue(ele.isDisplayed());
driver.findElement(By.id("myInput")).sendKeys("Apple Iphone 13");
Thread.sleep(3000);
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("window.scrollBy(0,700)");
Assert.assertTrue(driver.findElement(By.xpath("//h2[.='Our New Feature Courses']")).isDisplayed());
driver.findElement(By.xpath("(//a[.='Order'])[4]")).click();
}
@Test(priority = 3)
public void Order() throws InterruptedException, Exception
{
Set<String> window = driver.getWindowHandles();
Iterator<String>it = window.iterator();
Thread.sleep(3000);
String parentId = it.next();
String childId = it.next();
driver.switchTo().window(childId);
Assert.assertTrue(driver.findElement(By.tagName("h2")).isDisplayed());
driver.findElement(By.id("inputFirstName")).sendKeys("santhosh");
driver.findElement(By.xpath("(//*[@id='inputFirstName'])[2]")).sendKeys("Raj");
driver.findElement(By.id("inputEmail")).sendKeys("Santhu@gmail.com");
driver.findElement(By.id("inputPassword")).sendKeys("Santhu@123");
driver.findElement(By.id("flexRadioDefault2")).click();
driver.findElement(By.xpath("//*[@placeholder='00000000000']")).sendKeys("9876565");
driver.findElement(By.id(" address1")).sendKeys("masthenahahalli village kaiwara post");
driver.findElement(By.id("address2")).sendKeys("ESI hospital Rajajinagar");
driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
WebElement dropdown = driver.findElement(By.id("inputState"));
Select sle= new Select(dropdown);
sle.selectByVisibleText("Karnataka");
driver.findElement(By.id("inputZip")).sendKeys("563129");
driver.findElement(By.xpath("//*[.='Apple']")).click();
driver.findElement(By.cssSelector("input[placeholder='no of mobiles']")).sendKeys("4");
WebElement dpdwn2 = driver.findElement(By.id("bought"));
Select sle2= new Select(dpdwn2);
sle2.selectByValue("0");
driver.findElement(By.xpath("//*[@id='gridCheck1']")).click();
driver.findElement(By.xpath("(//*[@id='gridCheck1'])[2]")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Robot ro=new Robot();
for(int i=0;i<2;i++)
{
ro.keyPress(KeyEvent.VK_TAB);
}
ro.keyRelease(KeyEvent.VK_TAB);
ro.keyPress(KeyEvent.VK_ENTER);
ro.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
}
}