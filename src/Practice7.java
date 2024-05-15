import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

//dynamic xpath Locators


public class Practice7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='ds-text-compact-xxs'])[1]"));
		ele.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();
	}
}
