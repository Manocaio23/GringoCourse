package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarioPage {
	private static final String URL = "https://www.hyrtutorials.com/p/calendar-practice.html";
	private WebDriver driver;
	
	public CalendarioPage(WebDriver driver) {
		this.driver=driver;
	}
	// a ideia é o seguinte:
	//selecione uma data no ano atual 
	// Como validar entrada de usuário
	//selecionar uma data anterior
	//selecionar uma data futura
	//crie uma função de utilidade para lidar com calendários
	public void site() {
		driver.get(URL);
	}
	
	public void PrimeiroCalendar() {
		////table[@class='ui-datepicker-calendar']//a[text()=]
		int day=10;
		driver.findElement(By.id("first_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		
	}
	
	public void SegundoCalendar() {
		//table[@class='ui-datepicker-calendar']//td[not(contains(@class, 'ui-datepicker-other-month'))]/a[text()=2]
		int day =2;
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class, 'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();
	}
	
	public void Upload() throws InterruptedException {
		driver.get("the-internet.herokuapp.com/upload");
//		String caminhoArquivo="C:/pastas.png";
//		WebElement file=driver.findElement(By.id("file-upload"));
//		Thread.sleep(1000);
//		file.sendKeys(caminhoArquivo);
		
		
	}
	
	
}
