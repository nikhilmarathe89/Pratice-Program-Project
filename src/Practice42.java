import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice42 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\NEW\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
	    driver.get("https://www.iplt20.com/");
	    driver.manage().window().maximize();
	    //Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@data-element_text='POINTS TABLE'])[2]")).click();
	    //Thread.sleep(3000);
	    WebElement pri = driver.findElement(By.xpath("(//div[@class='cSBDisplay ng-binding'])[2]"));
	    pri.click();
	    WebElement year = driver.findElement(By.xpath("(//div[@class='col-lg-2 col-md-2 col-sm-3'])[2]/div/div[2]/div[3]"));
	    year.click();
	    Thread.sleep(3000);
	    WebElement text = driver.findElement(By.xpath("(//tbody[@id='pointsdata']/tr/td/div/h2)[1]"));
	    System.out.println("Team on 1st position is " + text.getText());
	    Thread.sleep(3000);
	    driver.close();
	    driver.quit();
	}
}
