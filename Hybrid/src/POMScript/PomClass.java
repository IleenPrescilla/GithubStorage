package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	@FindBy(id="firstName")
	private WebElement Fin;
	
	@FindBy(id="lastname")
	private WebElement lan;
	
	@FindBy(id="userEmail")
	private WebElement mail;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement gen;
	
	@FindBy(id="userNumber")
	private WebElement mbl;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//div[.='26']")
	private WebElement dat;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement sub;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement hob;
	
	@FindBy(id="uploadPicture")
	private WebElement pic;
	
	@FindBy(id="currentAddress")
	private WebElement addr;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy (id="city")
	private WebElement city;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void firstname(String datafname)
	{
		Fin.sendKeys(datafname);
	}
	
	public void lastname(String datalname)
	{
		Fin.sendKeys(datalname);
	}
	
	public void email(String dataemail)
	{
		mail.sendKeys(dataemail);
	}
	
	public void gender()
	{
		gen.click();
	}
	
	public void mobile(String datamobile)
	{
		mbl.sendKeys(datamobile);
	}
	
	public void dateofbirth()
	{
		dob.click();
	}
	
	public void date()
	{
		dat.click();
	}
	
	public void subject()
	{
		sub.sendKeys("English");
	}
	
	public void  hobby()
	{
		hob.click();
	}
	
	public void upload()
	{
		pic.sendKeys("C:\\Users\\Ileen Prescilla\\Downloads\\Experience Interview Questions (1).pdf");
	}
	
	public void address()
	{
		addr.sendKeys("malleshwaram");
	}
	
	public void states()
	{
		state.click();
	}
	
	public void cities()
	{
		city.click();
	}
	
	public void submits()
	{
		submit.click();
	}


}
