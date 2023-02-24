package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class HomePage {

	private WebDriver driver;
	private Waits wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new Waits(this.driver);
	}

	public WebElement getEmailInput() {

		return driver.findElement(By.name("email"));
	}

	public WebElement getPasswordInput() {
		return driver.findElement(By.name("password"));
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[text() = 'Acessar']\r\n" + ""));
	}

	public WebElement getTesteConta() {
		return driver.findElement(By.xpath("//*[@id=\"textAccountNumber\"]/span"));

	}

	public WebElement getTitle() {
		return wait.visibilityOfElement(By.xpath("//h1[text() = 'O banco com bugs e falhas do seu jeito']"));
	}

	public WebElement getTransaction() {
		return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
	}

	public WebElement getAccountNumber() {
		return driver.findElement(By.name("accountNumber"));
	}

	public WebElement getDigit() {
		return driver.findElement(By.name("digit"));
	}

	public WebElement getTransferValue() {
		return driver.findElement(By.name("transferValue"));
	}

	public WebElement getDescriptionInput() {
		return driver.findElement(By.name("description"));
	}

	public WebElement getTransferNowButton() {
		return driver.findElement(By.xpath("//button[text() = 'Transferir agora']"));

	}

	public WebElement getBtnCloseModalButton() {
		return driver.findElement(By.id("btnCloseModal"));
	}

	public WebElement getBtnBackButton() {
		return driver.findElement(By.id("btnBack"));
	}

	public WebElement getBtnEXTRATOButton() {
		return driver.findElement(By.id("btn-EXTRATO"));
	}

	public WebElement getBtnExit() {
		return driver.findElement(By.id("btnExit"));
	}

	public WebElement getTitlePageBalance() {
		return wait.visibilityOfElement(By.xpath("//p[text() = 'Saldo disponível']"));
	}

}