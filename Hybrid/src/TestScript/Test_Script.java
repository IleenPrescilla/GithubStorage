package TestScript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Generic_excel;
import Generic.Utility_Methods;
import POMScript.PomClass;

public class Test_Script extends BaseClass
{
	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
	   String fname=Generic_excel.getData("Sheet1", 0, 0);
	   String lname=Generic_excel.getData("Sheet1", 1, 0);
	   String emailid=Generic_excel.getData("Sheet1", 2, 0);
	   String mobnum=Generic_excel.getData("Sheet1", 3, 0);
	   
	   PomClass pc=new PomClass(driver);
	   pc.firstname(fname);
	   Thread.sleep(2000);
	   
	   pc.lastname(lname);
	   Thread.sleep(2000);
	   
	   pc.email(emailid);
	   Thread.sleep(2000);
	   
	   pc.gender();
	   Thread.sleep(2000);
	   
	   pc.mobile(mobnum);
	   Thread.sleep(2000);
	   
	   Utility_Methods.javascriptexe(driver).executeScript("window.scrollBy(0,600)");
	   
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dateOfBirthInput"))));
	   pc.dateofbirth();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Utility_Methods.select_class(month).selectByVisibleText("December");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility_Methods.select_class(year).selectByVisibleText("1995");
		Thread.sleep(2000);
		
		pc.date();
		Thread.sleep(2000);
		
		pc.subject();
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		
		pc.hobby();
		Thread.sleep(2000);
		
		pc.upload();
		Thread.sleep(2000);
		
		pc.address();
		Thread.sleep(2000);
		
		pc.states();
		Thread.sleep(2000);		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		
		
		pc.cities();
		Thread.sleep(4000);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
	    WebElement ele = driver.findElement(By.xpath("//button[.='Submit']"));
		Utility_Methods.actions_perform(driver).moveToElement(ele).click().perform();
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]"))));
		
		//String text=driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]")).getText();
		/*String text="Thanks for submitting the form";
		Assert.assertEquals(text, "Thanks for submitting");
		System.out.println("Framework end");*/
		
		driver.findElement(By.xpath("(//iframe[@title='3rd party ad content'])[1]"));
		Thread.sleep(2000);
		
		driver.switchTo().frame("ERP Alternative for SMEs - Free Forever");
		Thread.sleep(2000);
		
	   
	}

}