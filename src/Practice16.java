import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Practice16 
{
	@Test
	public void test1() throws InterruptedException
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://www.espncricinfo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Thread.sleep(10000);
		driver.close();
	}
	
//	@Test
//	public void test2() throws InterruptedException
//	{
//		EdgeOptions co = new EdgeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver(co);
//		driver.get("https://www.selenium.dev/");
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		driver.close();
//	}
}
