package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations
{
	public static WebDriver driver;
	public static Hashtable<String,Object>outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object>browserLanch(Object[] inputParameters)
	{
		try
		{
		String browserName=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		System.setProperty(browserName, exe);
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed:browserLanch,Input_Data :" +inputParameters[1].toString());
		}
		catch(Exception e)
		{

	outputParameters.put("STATUS","FAIL");
	outputParameters.put("MESSAGE","methodUsed:browserLanch,Input_Data :" +inputParameters[1].toString());
		}
		return outputParameters;
	
	}
	
	public static Hashtable<String,Object>openApplication(Object[] inputParameters)
	{
		try
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed:openApplication ,Input_Data :" +inputParameters[0].toString());
		 }
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodUsed:openApplication ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object>clickOnElement(Object[]inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed: clickOnElement ,Input_Data :" +inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodUsed: clickOnElement ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object>loginWindow(Object[]inputParameters)
	{
		try
		{
		String abc=(String) inputParameters[0];
		WebElement log=driver.findElement(By.xpath(abc));
		Actions act=new Actions(driver);
		act.moveToElement(log).build().perform();
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed:loginWindow ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodUsed:loginWindow ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
		
	}
	public static Hashtable<String,Object> profile(Object[] inputParameters)
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		String uname=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(uname);
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed: profile ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodUsed: profile ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object>sucessfulLogin(Object[] inputParameters)
	{
		try
		{
		Thread.sleep(3000);
		String givenText=(String) inputParameters[0];
		String xpath1=(String) inputParameters[1];
		String actualText=driver.findElement(By.xpath(xpath1)).getText();
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("TEST PASS");
		}else
		{
			System.out.println("TEST FAILED");
		}
		outputParameters.put("STATUS","PASS");
		outputParameters.put("MESSAGE","methodUsed:sucessfulLogin ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			outputParameters.put("MESSAGE","methodUsed:sucessfulLogin ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
		
	}
	
	
	public static void main(String[] args)
	{
		//launch Browser
		Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="C:\\Users\\SHREE\\March2022Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLanch(input);
		/*Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="C:\\Users\\SHREE\\March2022Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver1.exe";
	SeleniumOperations.browserLanch(input);
	*/
	   //open Application
	Object[] input1=new Object[1];
	input1[0]="https://www.flipkart.com";
	SeleniumOperations.openApplication(input1);
	
	   //click on cancel
	Object[] input2=new Object[1];
	   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input2);
	
	   //Mouse move to login Button
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.loginWindow(input3);
	
	   //click On MyProfile
	Object[] input4=new Object[1];
	input4[0]="(//*[@class='_3vhnxf'])[1]";
	SeleniumOperations.clickOnElement(input4);
	
	   //myProfileWindow--username
	Object[] input5=new Object[2];
	input5[0]="(//*[@type='text'])[2]";
	input5[1]="9881891149";
	SeleniumOperations.profile(input5);
	
	
	  //passwaord
	Object[] input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]="Reshma123";
	SeleniumOperations.profile(input6);
	
	  //click on login
		Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);
		
		//SuccessfulLogin
		Object[] input8=new Object[2];
		input8[0]="RESHMA CHACHAR";
		input8[1]="//*[text()='RESHMA CHACHAR']";
		SeleniumOperations.sucessfulLogin(input8);
		
		
	  }
	

 }

/*package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumOperations 
{
	public static WebDriver driver =null;

	public static Hashtable<String, Object> outputParameters=new Hashtable<String,Object>();
	//Browser Launch.

	/*public static Hashtable<String, Object> browserLaunch (Object[] inputParameters)
	{
		
	try
	{

	String strBrowserName=(String) inputParameters[0];

	String webDriverExePath=(String) inputParameters[1];

	if(strBrowserName.equalsIgnoreCase ("Chrome"))
	System.setProperty("webdriver.chrome.driver",webDriverExePath); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait (60, TimeUnit. SECONDS);
	
	outputParameters.put("STATUS", "PASS");

	outputParameters.put("MESSAGE", "Action: Browser Launch, Input Given: "+inputParameters[0].toString());
	}
	catch(Exception e)

	{outputParameters.put("STATUS", "FAIL");
	outputParameters.put("MESSAGE","Action: Browser Launch, Input Given: "+inputParameters [0].toString());
	}
	
	return outputParameters;
}
	//Application Launch 
	public static Hashtable <String, Object> applicationLaunch (Object[] inputParameters) 
	{
		try{
			String strgURL=(String) inputParameters [0];
			driver.get(strgURL);

			driver.manage().timeouts().implicitlyWait (60, TimeUnit. SECONDS);
			outputParameters.put("STATUS", "PASS");

			outputParameters.put("MESSAGE", "Action: Application Launch, Input Given: "+inputParameters [0].toString()); 
		}catch(Exception e)
		{

outputParameters.put("STATUS", "FAIL");

outputParameters.put("MESSAGE", "Action: Application Launch, Input Given: "+inputParameters[0].toString());
		}
return outputParameters;
		}
		//Send Key

		public static Hashtable<String, Object> sendKey(Object[] inputParameters)
		{

		try{

		String xpath=(String) inputParameters [0];
		String value= (String) inputParameters[1];

		driver.manage().timeouts().implicitlyWait (60, TimeUnit. SECONDS);

		WebElement obj=driver.findElement(By.xpath(xpath));

		obj.clear();

		obj.sendKeys(value);

		outputParameters.put("STATUS", "PASS"); outputParameters.put("MESSAGE", "Action: Sendkey, Input Given: "+inputParameters [1].toString());

		}
		catch(Exception e)
		{

		outputParameters.put("STATUS", "FAIL");

		outputParameters.put("MESSAGE", "Action: Sendkey, Input Given: "+inputParameters [1].toString());

		}

		return outputParameters;
		
		}
	
	public static Hashtable<String, Object> click(Object[] InputParameters)
	{
		try{

			String xpath=(String) InputParameters [0];

			driver.manage().timeouts().implicitlyWait (60, TimeUnit.SECONDS); 
			WebElement obj1=driver.findElement(By.xpath(xpath));
			obj1.click();
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action: Click, Input Given: "+InputParameters[0].toString());
		}
		
			catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL"); 
			outputParameters.put("MESSAGE", "Action: Click, Input Given: "+InputParameters[0].toString());

			} return outputParameters;


	}
	public static Hashtable<String, Object> dropDown (Object[]InputParameters)
	{
		try{

			String xpath=(String) InputParameters [0];

			String name =(String) InputParameters[1];
			Select sel=new Select(driver.findElement(By.xpath(xpath)));

			sel.selectByVisibleText (name); 
			outputParameters.put("STATUS", "PASS");

			outputParameters.put("MESSAGE", "Action: dropdown, Input Given: "+InputParameters [1].toString());

		}catch(Exception e)

		{ outputParameters.put("MESSAGE", "Action: dropdown, Input Given: "+InputParameters [1].toString());

		outputParameters.put("STATUS", "FAIL");

		}
		return outputParameters;

	}
	public static Hashtable<String, Object> validation (Object[]inputParameters)

	{

	driver.manage().timeouts().implicitlyWait (60, TimeUnit. SECONDS);
	String xpath=(String) inputParameters [0];
	String String1=(String) inputParameters[1]; 
	// we are giving spath of webelement String Stringi-(String) inputParameters[1]; // wer giving String of that xpath
	WebElement web=driver.findElement(By.xpath(xpath));
	String String2= web.getText();
	try

	{
	if(String1.equalsIgnoreCase(String2))
			{
		System.out.println("Test case Pass");
			}

		 else
		 {
		System.out.println("Test case fail");
		 }
		 outputParameters.put("STATUS", "PASS"); 
		 outputParameters.put("MESSAGE", "Action: validation, Input Given: "+inputParameters [1].toString());

	} catch (Exception e)

	{

	outputParameters.put("STATUS", "PASS");

	outputParameters.put("MESSAGE", "Action: validation, Input Given: "+inputParameters [1].toString());

	}
	
	return outputParameters;
}*/

		
		

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
{  try 
   {
	
	String bname=(String) inputParameters[0];
	String exe=(String) inputParameters[1];
	if(bname.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",exe);
		driver=new ChromeDriver();
	    driver.manage().window().maximize();	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
     
	 outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:browserLaunch,Input_Data"+inputParameters[0].toString());
   }
catch(Exception e)
{
	
	outputParameters.put("STATUS", "FAIL");
	 outputParameters.put("MESSAGE", "methodused:browserLaunch,Input_Data"+inputParameters[0].toString());
}
return outputParameters;
}
public static Hashtable<String,Object> openaApp(Object[] inputParameters)
{
	try
	{
		
	String url=(String) inputParameters[0];
	driver.get(url);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:openApp,Input_Data"+inputParameters[0].toString());
	
	}
	catch(Exception e)
	{
		
		outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodused:openApp,Input_Data"+inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> clickOnElement(Object[] inputParameters)
{
	try
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String xpath=(String) inputParameters[0];
	driver.findElement(By.xpath(xpath)).click();
	outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:clickOnElement,Input_Data"+inputParameters[0].toString());
	
	}
	catch(Exception e)
	{
		
		outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodused:clickOnElement,Input_Data"+inputParameters[0].toString());
	}
	return outputParameters;
}
public static Hashtable<String,Object> loginWindow(Object[] inputParameters)
{
	try 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
  String ab=(String)inputParameters[0];
  WebElement w=driver.findElement(By.xpath(ab));
  Actions action=new Actions(driver);
  action.moveToElement(w).build().perform();
  outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:loginWindow,Input_Data"+inputParameters[0].toString());
	}
	catch(Exception e)
	{
		outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodused:loginWindow,Input_Data"+inputParameters[0].toString());
		}
	return outputParameters;
	}
	

public static Hashtable<String,Object> Username(Object[] inputParameters)
{
	try
   {	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String xname=(String) inputParameters[0];
	String uname=(String) inputParameters[1];
	driver.findElement(By.xpath(xname)).sendKeys(uname);
	 outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:Username,Input_Data"+inputParameters[1].toString());
   }
catch(Exception e)
{
	
	 outputParameters.put("STATUS", "fail");
	 outputParameters.put("MESSAGE", "methodused:Username,Input_Data"+inputParameters[1].toString());
}
	return outputParameters;
}
public static Hashtable<String,Object> validationForLogin(Object[] inputParameters)
{
	try
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	String givenText=(String) inputParameters[0];
	String xpath=(String) inputParameters[1];
	String actualText=driver.findElement(By.xpath(xpath)).getText();
	
	if(givenText.equalsIgnoreCase(actualText))
	{
		System.out.println("TEST CASE PASS");
	}else
	{
		System.out.println("TEST CASE FAILED");
	}
	 outputParameters.put("STATUS", "PASS");
	 outputParameters.put("MESSAGE", "methodused:validationForLogin,Input_Data"+inputParameters[0].toString());
	}
	catch(Exception e)
	{
		
		 outputParameters.put("STATUS", "FAIL");
		 outputParameters.put("MESSAGE", "methodused:validationForLogin,Input_Data"+inputParameters[0].toString());
	}
	return outputParameters;
}
public static void  main(String[] args)
{ //launch browser
	Object[] input=new Object[2];
	input[0]="Chrome";
	input[1]="C:\\Users\\SHREE\\March2022Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
	SeleniumOperations.browserLaunch(input);
//open application
	Object[] input1=new Object[1];
	input1[0]="https://www.flipkart.com";
	SeleniumOperations.openaApp(input1);
	//click on calcle
	Object[] input2=new Object[1];
	input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	SeleniumOperations.clickOnElement(input2);
	
	//mouse move to login button 
	Object[] input3=new Object[1];
	input3[0]="//*[@class='_1_3w1N']";
	SeleniumOperations.loginWindow(input3);
	
	//click on my profile 
	Object[] input4=new Object[1];
	input4[0]="(//*[@class='_3vhnxf'])[1]";
	SeleniumOperations.clickOnElement(input4);
	
	// username
	Object[] input5=new Object[2];
	input5[1]="9881891149";
	input5[0]="(//*[@type='text'])[2]";
	SeleniumOperations.Username(input5);
	
	//password
	Object[] input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]="Reshma123";
	SeleniumOperations.Username(input6);
	
	//click on login 
	Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
	SeleniumOperations.clickOnElement(input7);
	
	Object[] input8=new Object[2];
	input8[0]="RESHMA CHACHAR";
	input8[1]="//*[text()='RESHMA CHACHAR']";
	SeleniumOperations.validationForLogin(input8);
}
}*/