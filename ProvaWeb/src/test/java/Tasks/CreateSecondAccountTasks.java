package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CreateAccount;
import Validations.RegisterValidation;

public class CreateSecondAccountTasks {
	private WebDriver driver;
	private CreateAccount formBackground;
	private RegisterValidation registerValidation;

	public CreateSecondAccountTasks(WebDriver driver) {

		this.driver = driver;
		formBackground = new CreateAccount(this.driver);
		registerValidation = new RegisterValidation(this.driver);
	}

	public String cadastrarConta() throws InterruptedException {

		formBackground.getRegistrarButton().click();
		Thread.sleep(100);

		// limpando pois ele está pegando dados anteriores
		formBackground.getEmailInput().clear();
		formBackground.getEmailInput().sendKeys("testeprais@gmail.com");
		Thread.sleep(100);
		formBackground.getNameInput().clear();
		formBackground.getNameInput().sendKeys("Teste Prais");
		Thread.sleep(100);
		formBackground.getPasswordInput().clear();
		formBackground.getPasswordInput().sendKeys("12345678");
		Thread.sleep(100);
		formBackground.getPasswordConfirmation().clear();
		formBackground.getPasswordConfirmation().sendKeys("12345678");
		Thread.sleep(100);
		formBackground.getRegisterButton().click();
		Thread.sleep(100);
		registerValidation.validationPageCreateAccount();
		
		String elementoModal2 = formBackground.getModalButton2().getText();

		formBackground.getModalButton().click();
		Thread.sleep(100);

		return (elementoModal2);

	}
}
