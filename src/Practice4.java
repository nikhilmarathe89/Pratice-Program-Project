// Launch selenium web browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Practice4 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
	}
}
