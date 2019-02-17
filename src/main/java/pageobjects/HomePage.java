package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.WebUtils;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement getCategoria() {
		return WebUtils.elementWait(driver, By.id("open-categories-btn"));
	}
	
	public WebElement getCategoriaTodos() {
		return WebUtils.elementWait(driver, By.id("category-all"));
	}
	
	public WebElement getCategoriaBebidas() {
		return WebUtils.elementWait(driver, By.id("category-0"));
	}
	public WebElement getCategoriaDoces() {
		return WebUtils.elementWait(driver, By.id("category-1"));
	}
	public WebElement getCategoriaSalgados() {
		return WebUtils.elementWait(driver, By.id("category-2"));
	}
	public WebElement getCategoriaPratosQuentes() {
		return WebUtils.elementWait(driver, By.id("category-3"));
	}
	
	public WebElement selectCategoria() {
		return WebUtils.clickWait(driver, By.id("open-categories-btn"));
	}
	
	public WebElement selectCategoriaTodos() {
		return WebUtils.clickWait(driver, By.id("category-all"));
	}
	
	public WebElement selectCategoriaBebidas() {
		return WebUtils.clickWait(driver, By.id("category-0"));
	}
	public WebElement selectCategoriaDoces() {
		return WebUtils.clickWait(driver, By.id("category-1"));
	}
	public WebElement selectCategoriaSalgados() {
		return WebUtils.clickWait(driver, By.id("category-2"));
	}
	public WebElement selectCategoriaPratosQuentes() {
		return WebUtils.clickWait(driver, By.id("category-3"));
	}
	
	
	public WebElement getCocaColaButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-0-btn\"]"));
	}

	public WebElement getFantaButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-1-btn\"]"));
	}
	public WebElement getAguaButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-2-btn\"]"));
	}
	public WebElement getRisoleButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-3-btn\"]"));
	}
	public WebElement getBrigadeiroButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-4-btn\"]"));
	}
	public WebElement getAlfajorButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"add-product-5-btn\"]"));
	}


	public WebElement getCartButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"cart-btn\"]"));
	}
	
	public WebElement getAddCocoColaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-0-qtd\"]"));
	}
	
	public WebElement getRemoveCocaColaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-0-qtd\"]"));
	}
	
	
	public WebElement getAddFantaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-1-qtd\"]"));
	}
	
	public WebElement getRemoveFantaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-1-qtd\"]"));
	}
	
	public WebElement getAddAguaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-2-qtd\"]"));
	}
	
	public WebElement getRemoveAguaButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-2-qtd\"]"));
	}
	
	
	public WebElement getAddRisoleButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-3-qtd\"]"));
	}
	
	public WebElement getRemoveRisoleButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-3-qtd\"]"));
	}
	
	public WebElement getAddBrigadeiroButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-4-qtd\"]"));
	}
	
	public WebElement getRemoveBrigadeiroButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-4-qtd\"]"));
	}
	
	
	public WebElement getAddAlfajorButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"add-product-5-qtd\"]"));
	}
	
	public WebElement getRemoveAlfajorButton() {
		return WebUtils.clickWait(driver, By.xpath("//div[@id=\"remove-product-5-qtd\"]"));
	}
	
	
	public WebElement getCheckoutButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@id=\"finish-checkout-button\"]"));
	}
	
	public WebElement getPriceTotal() {
		return WebUtils.elementWait(driver, By.xpath("//p[@id=\"price-total-checkout\"]"));
	}
	
	
	public WebElement getSuccess() {
		return WebUtils.clickWait(driver, By.xpath("//h2[contains(text(), \"Pedido realizado com sucesso!\")]"));
	}
	
	public WebElement getCloseModalButton() {
		return WebUtils.clickWait(driver, By.xpath("//button[@class=\"close-modal sc-jqCOkK ippulb\"]"));
	}


}
