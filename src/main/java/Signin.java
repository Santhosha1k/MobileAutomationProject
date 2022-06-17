
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Automation.Lunchingapplivation;

public class Signin extends Lunchingapplivation{
@Test(priority=4)
public void Sigup() throws InterruptedException {
WebElement fristname = driver.findElement(By.xpath("//input[@id='myName']"));
fristname.sendKeys("syeda");
WebElement Last_name = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
Last_name.sendKeys("tasmiya");
WebElement Email = driver.findElement(By.xpath("//input[@type='Email']"));
Email.sendKeys("xyz@gmail.com");
WebElement password = driver.findElement(By.xpath("//input[@type='Password']"));
password.sendKeys("Tas@123");
WebElement Phone_number = driver.findElement(By.xpath("//input[@type='number']"));
Phone_number.sendKeys("675889809");
driver.findElement(By.xpath("//input[@type='radio']")).click();
WebElement bio_story = driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']"));
bio_story.sendKeys("syeda is the employee whose join the qulitest company in the last 2 month back");
driver.findElement(By.xpath("//input[@type='date']")).click();
driver.findElement(By.xpath("//button[@type='Submit']")).click();
Alert Al = driver.switchTo().alert();
Al.accept();
Thread.sleep(3000);
WebElement user_name = driver.findElement(By.xpath("//input[@id='username']"));
user_name.click();
user_name.sendKeys("xyz@gmail.com");
WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
Password.click();
Password.sendKeys("Tas@123");
driver.findElement(By.xpath("//a[text()='Log In']")).click();
Thread.sleep(3000);
}
}