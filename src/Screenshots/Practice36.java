package Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Practice36 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\NEW\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.click();
		from.sendKeys("Mumbai");
		Thread.sleep(2000);
		
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.click();
		to.sendKeys("Bangalore");
		Thread.sleep(2000);
		
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		WebElement startDate = driver.findElement(By.xpath("//div[@aria-label='Tue Apr 23 2024']"));
		startDate.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']")).click();
		Thread.sleep(2000);
		
		WebElement endDate = driver.findElement(By.xpath("//div[@aria-label='Sat Apr 27 2024']"));
		endDate.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		Thread.sleep(10000);
		
		driver.close();
		driver.quit();
	}
}
