package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class BotaoDireitoPage {
	
	private static final String URL = "https://swisnl.github.io/jQuery-contextMenu/demo.html";
	private WebDriver driver;
	private Actions actions;
	
	
	public BotaoDireitoPage(WebDriver driver) {
		this.driver=driver;
		//this.actions=action;
		
	}
	public void acessarPagina() {
		driver.get(URL);

	}
	
	public void valida() {
	
		//Assert.assertEquals("Cadastrado!", botao.findElement(By.xpath("//*[@id=\'resultado\']/span")).getText());
		WebElement texto= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Assert.assertEquals("right click me", texto.getText());
	}
	
	
	public void clicandoBTNDireito() {
		Actions actions = new Actions(driver); 
		actions.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
		
		
	}
	
	public void ClicandoNoEdit() {
		Actions actions = new Actions(driver); 
		actions.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
