package br.tassio.desafio.qa.configuration;

import br.tassio.desafio.qa.App;
import br.tassio.desafio.qa.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest {


	@Before(value="@whatsApp")
	public void beforeScenarioMobileWhatsApp() {
		startAppium();
		System.out.println("Teste execução Hooks Mobile");
		initializeMobileApplication(App.WHATSAPP);
		//setUserApplication(Credentials.TELEFONE);
	}
	
	@Before(value="@instagram")
	public void beforeScenarioMobileInstagram() {
		startAppium();
		System.out.println("Teste execução Hooks Mobile");
		initializeMobileApplication(App.INSTAGRAM);
	}

	@Before(value = "@web")
	public void beforeScenarioWeb() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME);
		//setUserApplication(Credentials.TELEFONE);

	}
	
	@After(value = "@mobile")
	public void afterScenarioMobile() {
		closeMobile();
	}
	
	@After(value = "@web")
	public void afterScenarioWeb() {
		closeWeb();
	}
	
	

}
