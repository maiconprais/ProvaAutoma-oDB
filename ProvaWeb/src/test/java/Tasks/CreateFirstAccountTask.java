package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.CreateAccount;
import Validations.LoginValidation;
import Validations.RegisterValidation;

public class CreateFirstAccountTask {

	private WebDriver driver;
	private CreateAccount formBackground;
	private RegisterValidation registerValidation;
	private LoginValidation loginValidation;

	public CreateFirstAccountTask(WebDriver driver) {

		this.driver = driver;
		formBackground = new CreateAccount(this.driver);
		registerValidation = new RegisterValidation(this.driver);
		loginValidation = new LoginValidation(this.driver);
	}

	public void cadastrarConta() throws InterruptedException {

		loginValidation.validationLoginPage();
		formBackground.getRegistrarButton().click();
		registerValidation.validationLoginPage();
		formBackground.getEmailInput().sendKeys("maiconprais@gmail.com");
		formBackground.getNameInput().sendKeys("Maicon Prais");
		formBackground.getPasswordInput().sendKeys("12345678");
		formBackground.getPasswordConfirmation().sendKeys("12345678");
		formBackground.getToggleAddBalanceButton().click();
		formBackground.getRegisterButton().click();
		registerValidation.validationPageCreateAccount();
		formBackground.getModalButton().click();
		
	}
}
