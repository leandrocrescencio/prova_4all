package Prova_4all.FourAll;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commom.BaseTest;
import utils.ExtentTestManager;
import utils.ScreenShotUtils;

public class Desafio2 extends BaseTest {

	@Test(priority = 1, description = "Fluxo do desafio 2")
	public void fluxo_desafio_2() {

		Assert.assertTrue(page.getCategoria().isDisplayed());
		Assert.assertTrue(page.getCocaColaButton().isDisplayed());
		Assert.assertTrue(page.getFantaButton().isDisplayed());
		Assert.assertTrue(page.getAguaButton().isDisplayed());
		Assert.assertTrue(page.getRisoleButton().isDisplayed());
		Assert.assertTrue(page.getBrigadeiroButton().isDisplayed());
		Assert.assertTrue(page.getAlfajorButton().isDisplayed());
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Fluxo inciado.");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		action.click(page.selectCategoria()).build().perform();
			
		Assert.assertTrue(page.getCategoriaBebidas().isDisplayed());

		action.click(page.getCategoriaBebidas()).build().perform();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		Assert.assertTrue(page.getCocaColaButton().isDisplayed());
		action.click(page.getCocaColaButton()).build().perform();
		Assert.assertTrue(page.getFantaButton().isDisplayed());
		action.click(page.getFantaButton()).build().perform();
		Assert.assertTrue(page.getAguaButton().isDisplayed());
		action.click(page.getAguaButton()).build().perform();

		Assert.assertTrue(page.getCategoria().isDisplayed());
		action.click(page.selectCategoria()).build().perform();
		
		Assert.assertTrue(page.getCategoriaTodos().isDisplayed());
		action.click(page.selectCategoriaTodos()).build().perform();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		Assert.assertTrue(page.getRisoleButton().isDisplayed());
		action.click(page.getRisoleButton()).build().perform();

		Assert.assertTrue(page.getCartButton().isDisplayed());
		action.click(page.getCartButton()).build().perform();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Reivisão dos produtos");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		Assert.assertTrue(page.getAddRisoleButton().isDisplayed());
		int count = 9;
		while (count > 0) {
			action.click(page.getAddRisoleButton()).build().perform();
			count--;
		}
		Assert.assertTrue(page.getRemoveRisoleButton().isDisplayed());
		count = 5;
		while (count > 0) {
			action.click(page.getRemoveRisoleButton()).build().perform();
			count--;
		}
		
		Assert.assertEquals(page.getPriceTotal().getText(), "R$ 36,00");

		ExtentTestManager.getTest().log(LogStatus.INFO, "Valor Validado.");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		Assert.assertTrue(page.getCheckoutButton().isDisplayed());
		action.click(page.getCheckoutButton()).build().perform();

		Assert.assertTrue(page.getSuccess().isDisplayed());
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Pedido Realizado com Sucesso.");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));
		
		Assert.assertTrue(page.getCloseModalButton().isDisplayed());
		action.click(page.getCloseModalButton()).build().perform();
		
		
	}

}