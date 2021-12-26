package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalendarioPage {
	private static final String URL = "https://www.hyrtutorials.com/p/calendar-practice.html";
	private WebDriver driver;
	
	public CalendarioPage(WebDriver driver) {
		this.driver=driver;
	}
	
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
}
