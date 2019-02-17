package commom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageobjects.HomePage;

public class BaseOO {
	protected WebDriver driver;
	
	protected Actions action;
	protected HomePage page;
		
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver() {
		this.driver = new ChromeDriver();
	}
	
	public Actions getAction() {
		return action;
	}
	public void setAction(WebDriver driver) {
		this.action = new Actions(driver);
	}
	public HomePage getPage() {
		return page;
	}
	public void setPage(WebDriver driver) {
		this.page = new HomePage(driver);
	}	

	
}
