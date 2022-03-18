package cucumbermap;
import java.util.Hashtable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login
{
	@When ("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void lanchBrowser(String bname, String exe )
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		SeleniumOperations.browserLanch(input);
	}
	@When ("^user open URL as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.openApplication(input1);
    }
	@When ("^user click on cancel button")
		public void cancelWindow()
		{
		Object[] input2=new Object[1];
		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  // SeleniumOperations.clickOnElement(input2);
		
		Hashtable<String,Object> input2op=SeleniumOperations.clickOnElement(input2);
		HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user click on cancel button",input2op.get("MESSAGE").toString());
		
		}
	@When ("user navigate on login")
	public void moveToLogin()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		 //  SeleniumOperations.loginWindow(input3);
		
		Hashtable<String,Object> input3op=SeleniumOperations.loginWindow(input3);
		HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user navigate on login",input3op.get("MESSAGE").toString());
		
    }
	@When ("^user click on MyProfile")
	public void myProfile()
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		//   SeleniumOperations.clickOnElement(input4);
		Hashtable<String,Object> input4op=SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on MyProfile",input4op.get("MESSAGE").toString());
		
    }	
	@When ("^user enter username as \"(.*)\"$")
	public void userName(String uname)
	{
		Object[] input5=new Object[2];
		input5[0]="(//*[@type='text'])[2]";
		input5[1]=uname;
		 //  SeleniumOperations.profile(input5);
		Hashtable<String,Object> input5op=SeleniumOperations.profile(input5);
		HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user enter username as  \"(.*)\"$",input5op.get("MESSAGE").toString());
		
		
	 }
	@When ("^user enter valid password as \"(.*)\"$")
	public void passWord(String pass)
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@type='password']";
		input6[1]=pass;
		  // SeleniumOperations.profile(input6);
		Hashtable<String,Object> input6op=SeleniumOperations.profile(input6);
		HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user enter valid password as \\\"(.*)\\\"$",input6op.get("MESSAGE").toString());
		
		
	}
	@When ("^user click on login")
	public void finalLogin()
	{
		Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
		//SeleniumOperations.clickOnElement(input7);
		
		Hashtable<String,Object> input7op=SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user click on login",input7op.get("MESSAGE").toString());
		
	}
	@Then ("^Application shows login successfully$")
	public void loginSuccessful()
	{
	
		Object[] input8=new Object[2];
		input8[0]="RESHMA CHACHAR";
		input8[1]="//*[text()='RESHMA CHACHAR']";
		  // SeleniumOperations.sucessfulLogin(input8);
		
		Hashtable<String,Object> input8op=SeleniumOperations.sucessfulLogin(input8);
		HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"Application shows login successfully$",input8op.get("MESSAGE").toString());
		
		
	}

}

/*package cucumbermap;
import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;
public class Login 
{
	@When ("^user open \"(.*)\" browser with exe as \"(.*)\"$")
		public static void launchBrowser(String bname, String exe) 
		{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
		//SeleniumOperations.browserLaunch(input);
		}
@When ("^user open URL as \"(.*)\"$")
	public void openApp(String url)
	{
		Object[] input1=new Object[1];
		input1[0]=url;
		SeleniumOperations.openaApp(input1);
	}
@When ("^User click on cancle button")
	public void cancleWindow()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickOnElement(input2);
	}
@When ("^User user navigates on Login")
	public void loginNavigate()
	{
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output3=SeleniumOperations.loginWindow(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"User user navigates on Login" , output3.get("MESSEGE").toString());
		//SeleniumOperations.loginWindow(input3);
	}
@When ("^User click on My Profile")
	public void profile()
	{
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		//SeleniumOperations.clickOnElement(input4);
		Hashtable<String,Object> output4=SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"User click on My Profile" , output4.get("MESSEGE").toString());
	}
@When ("^User enter \"(.*)\" as Username as$")
	public void username(String name)
	{
		Object[] input5=new Object[2];
		input5[1]=name;
		input5[0]="(//*[@type='text'])[2]";
		Hashtable<String,Object> output5=SeleniumOperations.Username(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "User enter \"(.*)\" as Username as", output5.get("MESSEGE").toString());
		
	}
@When ("^User enter \"(.*)\" as Password$")
    public void password(String pass)
    {
	Object[] input6=new Object[2];
	input6[0]="//*[@type='password']";
	input6[1]="Reshma123";
	Hashtable<String,Object> output6=SeleniumOperations.Username(input6);
	HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "User enter \"(.*)\" as Password",output6.get("MESSEGE").toString());
	
    }
@When ("^user enter on login button")
public void cancle()
{
	Object[] input7=new Object[1];
	input7[0]="(//*[@type='submit'])[2]";
	Hashtable<String,Object> output7=SeleniumOperations.clickOnElement(input7);
	HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user enter on login button", output7.get("MESSEGE").toString());
	
	
}
@Then ("^Application shows login successfully$")
public void log_successfully()
{
	Object[] input8=new Object[2];
	input8[0]="RESHMA CHACHAR";
	input8[1]="//*[text()='RESHMA CHACHAR']";
	Hashtable<String,Object> output8=SeleniumOperations.clickOnElement(input8);
	HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"Application shows login successfully", output8.get("STATUS").toString());
	}
}

	




*/