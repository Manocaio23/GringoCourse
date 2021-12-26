package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CalendarioPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.it.Ma;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class calendarioStep {
	private WebDriver driver;
	private CalendarioPage mc;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		// driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		mc = new CalendarioPage(driver);
	}

	@After
	public void After() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	@Dado("esteja no site da Calendars Pratice")
	public void esteja_no_site_da_calendars_pratice() {
		mc.site();
	}

	@Quando("visualizo o site")
	public void visualizo_o_site() {
		mc.PrimeiroCalendar();
		mc.SegundoCalendar();
	}

	@Entao("devo fazer meu deveres")
	public void devo_fazer_meu_deveres() {

	}

}
