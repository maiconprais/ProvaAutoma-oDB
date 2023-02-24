package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.CreateAccount;
import PageObjects.HomePage;
import Validations.LoginValidation;
import Validations.RegisterValidation;

public class HomeTask {

	private WebDriver driver;
	private HomePage homePage;
	private RegisterValidation registerValidation;
	private LoginValidation loginValidation;

	public HomeTask(WebDriver driver) {

		this.driver = driver;
		homePage = new HomePage(this.driver);
		registerValidation = new RegisterValidation(this.driver);
		loginValidation = new LoginValidation(this.driver);
	}

	public void efetuarLogin(String x) throws InterruptedException {

		String Conta = x;

		homePage.getEmailInput().sendKeys("maiconprais@gmail.com");
		homePage.getPasswordInput().sendKeys("12345678");
		homePage.getLoginButton().click();
		registerValidation.validationPageAccount();

		// Separando os digitos da conta corrente 000-1
		String[] textoSeparado = Conta.split(" ");
		String x1 = textoSeparado[2];
		String[] textoSeparado2 = x1.split("-");
		String contaCorrente = textoSeparado2[0];// 000
		String Digito = textoSeparado2[1];// 1

		homePage.getTransaction().click();
		registerValidation.validationPageTransfer();
		homePage.getAccountNumber().sendKeys(contaCorrente);
		homePage.getDigit().sendKeys(Digito);
		homePage.getTransferValue().sendKeys("200");
		homePage.getDescriptionInput().sendKeys("Teste transferência");
		homePage.getTransferNowButton().click();
		registerValidation.validationTransfer();
		Thread.sleep(500);
		homePage.getBtnCloseModalButton().click();
		homePage.getBtnBackButton().click();
		registerValidation.validationPageAccount();
		homePage.getBtnEXTRATOButton().click();
		registerValidation.validationPageBalance();
		homePage.getBtnExit().click();

		/// Entrando na segunda conta
		loginValidation.validationLoginPage();
		homePage.getEmailInput().sendKeys("testeprais@gmail.com");
		homePage.getPasswordInput().sendKeys("12345678");
		homePage.getLoginButton().click();
		registerValidation.validationPageAccount();
		homePage.getBtnEXTRATOButton().click();
		registerValidation.validationPageBalance();
		homePage.getBtnExit().click();
		loginValidation.validationLoginPage();

	}

}
