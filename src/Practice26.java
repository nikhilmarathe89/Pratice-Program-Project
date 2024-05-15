import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Practice26 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\NEW\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement miniTV = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		WebElement righttominiTV = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(miniTV));
		righttominiTV.click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();		
	}
}
