import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Practice31 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\NEW\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File ("C:\\Users\\Nikhil Marathe\\eclipse-workspace\\Practice Java\\src\\Screenshots\\Screenshot1.png"));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Nikhil Marathe\\eclipse-workspace\\Practice Java\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = book.getSheet("Sheet1");
		int rownum = sheet1.getLastRowNum();
		for(int i=0; i<rownum;i++)
		{
			XSSFRow celldata = sheet1.getRow(i);
		}
		
		
		driver.close();
		driver.quit();
	}
}
