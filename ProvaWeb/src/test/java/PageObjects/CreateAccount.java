package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class CreateAccount {

	private WebDriver driver;
	private Waits wait;

	public CreateAccount(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}

	public WebElement getRegistrarButton() {
		return driver.findElement(By.xpath("//button[text() = 'Registrar']\r\n" + ""));
	}

	public WebElement getTitle() {
		return wait.visibilityOfElement(By.xpath("//a[text() = 'Voltar ao login']"));
	}

	public WebElement getTitlePageAccount() {
		return wait.visibilityOfElement(By.xpath("//p[text() = 'Conta digital: ']"));
	}

	public WebElement getTitlePageTransfer() {
		return wait.visibilityOfElement(
				By.xpath("//p[text() = 'Realize transferência de valores entre contas BugBank com taxa']"));
	}

	public WebElement getTitlePageBalance() {
		return wait.visibilityOfElement(By.xpath("//p[text() = 'Saldo disponível']"));
	}

	public WebElement getEmailInput() {
		return driver.findElement(By.xpath("//div[@class = 'card__register']//input[@name = 'email']"));
	}

	public WebElement getNameInput() {
		return driver.findElement(By.name("name"));
	}

	public WebElement getPasswordInput() {
		return driver.findElement(By.xpath("//div[@class = 'card__register']//input[@name = 'password']"));

	}

	public WebElement getPasswordConfirmation() {
		return driver.findElement(By.name("passwordConfirmation"));
	}

	public WebElement getToggleAddBalanceButton() {
		return driver.findElement(By.id("toggleAddBalance"));
	}

	public WebElement getRegisterButton() {
		return driver.findElement(By.xpath("//button[text() = 'Cadastrar']"));
	}

	public WebElement getModalButton2() {
		return driver.findElement(By.id("modalText"));
	}

	public WebElement getModalButton() {
		return driver.findElement(By.id("btnCloseModal"));

	}

}
