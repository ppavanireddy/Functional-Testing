package Tests;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Login_Page;
import Pages.fileupload_Page;
import Utilities.Base;

public class Login_Test extends Base{
		Login_Page l;
		fileupload_Page fu;
		
		@BeforeMethod
			public void bt() throws InterruptedException 
					
					{
						launch_browser();
						l = new Login_Page(dr);
						fu = new fileupload_Page(dr);
					}
			
			@Test
			public void TC_001() throws InterruptedException, AWTException, IOException 
			{
				System.out.println(readExcel(1,0) + " : "+ readExcel(1,1));
				
				l.enter_username(readExcel(1,2));
				l.enter_password(readExcel(1,3));
				
				l.click_Login();
				
				Thread.sleep(5000);
				l.click_order();
				
				l.click_Orders();
				
				Thread.sleep(5000);
				
				l.click_Bulk();
				
				Thread.sleep(5000);
				
				String filePath = "C:\\Users\\DELL\\Downloads\\demo-data (1).xlsx";
				fu.file_upload(filePath);
				fu.click_import();
				
				Thread.sleep(5000);
				fu.click_validate();
				
				Thread.sleep(5000);
				dr.switchTo().alert().accept();
				
				String filename = "testScreenshot.png";
		        get_screenshot(filename);
		        
		        close_browser();
			}
				
			
}


			
