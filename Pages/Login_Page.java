package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
WebDriver dr;
	
	public Login_Page(WebDriver dr) 
	{
		this.dr = dr;
	}
	
	public void enter_username(String userName)
	{
		WebElement username = dr.findElement(By.xpath("//*[@id=\"mui-1\"]"));
		username.sendKeys(userName);
	}
	
	public void enter_password(String Password)
	{
		WebElement pwd = dr.findElement(By.xpath("//*[@id=\"mui-2\"]"));
		pwd.sendKeys(Password);
	}
	
	public void click_Login()
	{
		WebElement login = dr.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
	}
	
	public void click_order()
	{
		WebElement button = dr.findElement(By.xpath("//button[contains(@class, 'MuiButtonBase-root') and contains(@class, 'has-submenu') and contains(@class, 'compactNavItem') and contains(@class, 'css-46up3a')]"));
		button.click();
	}
	
	public void click_Orders()
	{
		WebElement orders = dr.findElement(By.xpath("//a[@href='/mis/orders']//button[@name='child']"));
		orders.click();
	}
	
	public void click_Bulk()
	{
		WebElement bulk = dr.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']"));
		bulk.click();
	}

}
