import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenusSupenso {
	private WebDriver driver;
	
	@Test
	public void MoverMouseNoElemento() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver100.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("https://www.ebay.com.au/");
		WebElement element=driver.findElement(By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]"));
		Actions action=	new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.quit();
	
		
}
	
	@Test
	public void ArrastarElemento() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver100.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement dragg =driver.findElement(By.id("draggable"));
		WebElement dropp =driver.findElement(By.id("droppable"));

	Actions action=	new Actions(driver);
	action.dragAndDrop(dragg, dropp).perform();
		
		
		driver.quit();
	
		//335 272
}
	@Test
	public void ArrastarElementoCordenadas() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver100.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		
		WebElement element =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

	Actions action=	new Actions(driver);
	action.dragAndDropBy(element, 300, 100).perform();
		
	Thread.sleep(2000);
		driver.quit();
	
		//335 272
}
	
	@Test
	public void ArrastarElementoColorPiker() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver100.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/slider/colorpicker.html");
		//WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	//driver.switchTo().frame(frame);
		
		WebElement element =driver.findElement(By.xpath("//*[@id=\"green\"]/span"));

	Actions action=	new Actions(driver);
	action.dragAndDropBy(element, 145, 100).perform();
	Thread.sleep(2000);
	//abaixando o outro
	
	WebElement elementBlue =driver.findElement(By.xpath("//*[@id=\"red\"]/span"));

	Actions action2=	new Actions(driver);
	action.dragAndDropBy(elementBlue, -145, 100).perform();
		
	Thread.sleep(2000);
		driver.quit();
	
		//335 272
}
	
	
	
}
