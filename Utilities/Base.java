package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base extends ExcelUtilities {
	public static WebDriver dr; 
	
	public static void launch_browser() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(" https://demo.dealsdray.com/");
		dr.manage().window().maximize();
		Thread.sleep(4000);
	}
	
	public static void get_screenshot(String filename) throws IOException
	{
		String path = "C:\\Users\\DELL\\OneDrive\\Desktop\\Testing\\Screenshots", fullpath;
		fullpath = path + filename;
		TakesScreenshot scr = ((TakesScreenshot)dr);
		File scrf = scr.getScreenshotAs(OutputType.FILE);
		File dest = new File(fullpath);
		FileUtils.copyFile(scrf, dest);
	}
	public void scrollDown() 
	{
        JavascriptExecutor js = (JavascriptExecutor) dr;
        // Scroll down by 1000 pixels vertically
        js.executeScript("window.scrollBy(0,1000)");
    }
	
	protected static void close_browser() 
	{
		dr.close();
	}

}
