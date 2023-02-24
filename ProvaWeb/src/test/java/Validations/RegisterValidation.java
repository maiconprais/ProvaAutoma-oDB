package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.CreateAccount;
import PageObjects.HomePage;

public class RegisterValidation {

	private WebDriver driver;
	private CreateAccount createAccount;
	private Waits wait;

	public RegisterValidation(WebDriver driver) {

		this.driver = driver;
		createAccount = new CreateAccount(this.driver);
		wait = new Waits(this.driver);
	}

	public void validationLoginPage() {

		try {

			wait.loadElement(createAccount.getTitle());
			Assertions.assertTrue(createAccount.getTitle().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de cadastro com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

	public void validationPageAccount() {

		try {

			wait.loadElement(createAccount.getTitlePageAccount());
			Assertions.assertTrue(createAccount.getTitlePageAccount().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina da conta digital com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

	public void validationPageCreateAccount() {

		try {

			wait.loadElement(createAccount.getModalButton2());
			Assertions.assertTrue(createAccount.getModalButton2().isDisplayed());
			Report.log(Status.PASS, "Conta Digital criada com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

	public void validationPageTransfer() {
		try {
			wait.loadElement(createAccount.getTitlePageTransfer());
			Assertions.assertTrue(createAccount.getTitlePageTransfer().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de transferência com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

	public void validationPageBalance() {
		try {
			wait.loadElement(createAccount.getTitlePageBalance());
			Assertions.assertTrue(createAccount.getTitlePageBalance().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina de extrato bancario com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}
	
	
	public void validationTransfer() {
		try {
			wait.loadElement(createAccount.getModalButton2());
			Assertions.assertTrue(createAccount.getModalButton2().isDisplayed());
			Report.log(Status.PASS, "Realizou a transferência com sucesso", Screenshot.capture(driver));

		} catch (Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}
