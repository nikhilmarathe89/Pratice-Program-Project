import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice40 
{
	public static void main(String[] args) 
	{

		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\NEW\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
	    driver.get("http://omayo.blogspot.com/");
	    Select dropdown = new Select(driver.findElement(By.xpath("//select[@class='combobox']")));
	    List<WebElement> elements = dropdown.getOptions();
	    for (WebElement element : elements)
	    {
	      System.out.println(element.getText());
	    }
	}
}
