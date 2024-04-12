package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;
import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import PageObjects.CreateAccount;
import Tasks.CreateFirstAccountTask;
import Tasks.CreateSecondAccountTasks;
import Tasks.HomeTask;

public class RealizarCadastroConta extends TestBase {
	
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
		
	CreateFirstAccountTask createFirstAccountTask = new CreateFirstAccountTask(driver);
	CreateSecondAccountTasks createSecondAccountTasks = new CreateSecondAccountTasks(driver);
	
	
	@Test
	public void realizarCadastro() throws InterruptedException {	
		try {
			Report.createTest("Realizar Cadastro Conta Corrente", ReportType.GROUP);
			Report.createStep("Realizar Cadastro");
			createFirstAccountTask.cadastrarConta();
			String Numconta = createSecondAccountTasks.cadastrarConta();
			Report.createStep("Realizar Transações");
			homeTask.efetuarLogin(Numconta);
		}catch(Exception e) {
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
			
		}		
	}
}