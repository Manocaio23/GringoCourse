package Step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.BotaoDireitoPage;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AcaoBotaoDireitoStep {
	private WebDriver driver;
	private Actions actions;
	private BotaoDireitoPage mc;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		//this.actions = new Actions(driver);
		mc = new BotaoDireitoPage(driver);

	}

	@Dado("que esteja no site da Demo Jquery")
	public void que_esteja_no_site_da_demo_jquery() {
		mc.acessarPagina();
		
	}

	@Quando("visualizo {string}")
	public void visualizo(String string) {
		mc.valida();
	}

	@Quando("clico com o botao direito")
	public void clico_com_o_botao_direito() {
		mc.clicandoBTNDireito();
	}

	@Entao("visualizo as opcoes")
	public void visualizo_as_opcoes() {

	}
	
	// segundo cenário
	
	@Quando("clico com botao direito em {string}")
	public void clico_com_botao_direito_em(String string) {
		mc.valida();
	}

	@Quando("escolho edit e abre um aleta")
	public void escolho_edit_e_abre_um_aleta() {
		mc.ClicandoNoEdit();
	}

	@Entao("dou um acept")
	public void dou_um_acept() {
	    
	}

}
