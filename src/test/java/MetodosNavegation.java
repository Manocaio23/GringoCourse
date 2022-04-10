import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosNavegation {
	private WebDriver driver;
	private WebElement file;
	
	
	// Codigo para fazer navegações 
	@Test
	public void MetodoNavigatio() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mano Caio");
		driver.findElement(By.name("btnK")).submit();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testestes");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();// para tras seta
		Thread.sleep(2000);
		driver.navigate().forward();//pra frente seta	
		
		
		
		
		
}
}
