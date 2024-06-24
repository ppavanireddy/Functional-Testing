package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fileupload_Page {
WebDriver dr;
	
	public fileupload_Page(WebDriver dr) 
	{
		this.dr = dr;

	}
       
        public void file_upload(String filepath)
        {
        WebElement fileInput = dr.findElement(By.xpath("//input[@type='file']"));
        fileInput.sendKeys(filepath);
        }
        
        public void click_import()
        {
        	WebElement Import = dr.findElement(By.xpath("//button[normalize-space()='Import']"));
        	Import.click();
        }
        
        public void click_validate()
        {
        	WebElement validate = dr.findElement(By.xpath("//button[normalize-space()='Validate Data']"));
        	validate.click();
        }
}
        
        