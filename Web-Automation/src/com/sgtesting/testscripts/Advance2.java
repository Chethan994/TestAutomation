package com.sgtesting.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		navigate();
		login();
		minimizeflyoutwindow();
		createuser1();
		logout();
		loginasuser1();
		logout();
		loginasuser2();
		logout();
		loginasuser3();
		logout();
		
		login();
		modifypass();
		logout();
		loginnew1();
		logout();
		loginnew2();
		logout();
		loginnew3();
		logout();
		login();
		deleteuser();
		logout();
		close();
	}
	static void launchbrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Driverfolder\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeflyoutwindow()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsMenuCloseId\']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("chetu");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("ks");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys("abc@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("demo1");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("karthi");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("SE");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys("def@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("demo2");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_firstNameField\']")).sendKeys("rakesh");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_lastNameField\']")).sendKeys("TS");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_emailField\']")).sendKeys("ghi@gmail.com");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_usernameField\']")).sendKeys("demo3");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//++++++++++++++++++=============================++++++++++++++++++++++++============================+++++++++++++++++++++++++++++
	static void loginasuser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginasuser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void loginasuser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("123456");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifypass()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[2]/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("abcd");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("abcd");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("efgh");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("efgh");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordField\']")).sendKeys("ijkl");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_passwordCopyField\']")).sendKeys("ijkl");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginnew1()
	{
		try
		{

			oBrowser.findElement(By.name("username")).sendKeys("demo1");
			oBrowser.findElement(By.name("pwd")).sendKeys("abcd");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginnew2()
	{
		try
		{

			oBrowser.findElement(By.name("username")).sendKeys("demo2");
			oBrowser.findElement(By.name("pwd")).sendKeys("efgh");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginnew3()
	{
		try
		{

			oBrowser.findElement(By.name("username")).sendKeys("demo3");
			oBrowser.findElement(By.name("pwd")).sendKeys("ijkl");
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{         
		try
		{   
			
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2] ")).click();
		    Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\'] ")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String textcontent=oAlert.getText();
			System.out.println(textcontent);
			oAlert.accept();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2] ")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String textcontent1=oAlert1.getText();
			System.out.println(textcontent1);
			oAlert.accept();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\'] ")).click();
			Thread.sleep(2000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String textcontent2=oAlert2.getText();
			System.out.println(textcontent2);
			oAlert.accept();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void close()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}