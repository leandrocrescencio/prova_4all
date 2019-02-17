package Prova_4all.FourAll;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commom.BaseTest;
import utils.ExtentTestManager;
import utils.ScreenShotUtils;

public class Desafio1 extends BaseTest {

	@Test(priority = 1, description = "Fluxo do desafio 1")
	public void fluxo_desafio_1() {

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
		
		Assert.assertTrue(page.getCategoriaDoces().isDisplayed());

		action.click(page.selectCategoriaDoces()).build().perform();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));

		Assert.assertTrue(page.getBrigadeiroButton().isDisplayed());
		action.click(page.getBrigadeiroButton()).build().perform();
		Assert.assertTrue(page.getAlfajorButton().isDisplayed());
		action.click(page.getAlfajorButton()).build().perform();

		Assert.assertTrue(page.getCartButton().isDisplayed());
		action.click(page.getCartButton()).build().perform();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Reivisão dos produtos");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));
		Assert.assertTrue(page.getAddBrigadeiroButton().isDisplayed());
		int count = 4;
		while (count > 0) {
			action.click(page.getAddBrigadeiroButton()).build().perform();
			count--;
		}

		Assert.assertTrue(page.getCheckoutButton().isDisplayed());
		action.click(page.getCheckoutButton()).build().perform();

		Assert.assertTrue(page.getSuccess().isDisplayed());
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Pedido Realizado com Sucesso.");
		ExtentTestManager.getTest().log(LogStatus.INFO, ExtentTestManager.getTest().addBase64ScreenShot(ScreenShotUtils.captureScreenShot()));
		
		Assert.assertTrue(page.getCloseModalButton().isDisplayed());
		action.click(page.getCloseModalButton()).build().perform();

	}

}