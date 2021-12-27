import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class UploadArquivo {
	private WebDriver driver;
	private WebElement file;
	
	
	// Codigo para fazer upload
	@Test
	public void Upload() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/upload");
		Thread.sleep(1000);
		String caminhoArquivo="C:\\pasta\\s.png";
		driver.findElement(By.id("file-upload")).sendKeys(caminhoArquivo);
		Thread.sleep(1000);
		driver.findElement(By.id("file-submit")).click(); 
//		String arquivo = driver.findElement(By.id("uploaded-files")).getAttribute("value");
//		Thread.sleep(3000);
//		if (arquivo.equalsIgnoreCase("s.png")) {
//			System.out.println(" UPLOAD FEITO COM SUCESSO");
//		}
		//file.sendKeys(caminhoArquivo);
		
		
	}
}
