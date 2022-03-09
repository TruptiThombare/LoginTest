

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {

	public static void main(String[] args) {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\chromedriver.exe");
	
 
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		 
		
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	
		WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/");
	
	driver.manage().window().maximize();
		driver.findElement(By.className("chakra-input__group css-b61uh7")).sendKeys("Trupti");
		driver.findElement(By.className("chakra-input__group css-b61uh7")).sendKeys("Trupti");
		driver.findElement(By.className("chakra-button css-8h0nsd")).click();
		driver.findElement(By.className("hakra-button css-d509a4")).click();
				
	}
	

}
