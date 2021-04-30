package App_Script_Lan_wel_page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import Reusable_Functions.Generic_function;
import io.cucumber.java.en.When;

public class Home_page extends Generic_function{
	public static boolean value;



	@When("User enters valid phonenumber and password and User click on login")
	public void user_enters_valid_phonenumber_and_password_and_user_click_on_login() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		try {
			Browser_Launch();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			click("welcome_login");
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "login_title"))).isDisplayed();
			Assert.assertEquals(true,value);
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {

			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",1,5));
			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_password"))).sendKeys(td_reader("login_password",1,6));
			click("login");
			browser_wait(12);

			//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logout"))).isDisplayed();
			//Assert.assertEquals(true,value);
		} catch (IOException e) {
			e.printStackTrace();

		}

		Thread.sleep(2000);
	}



	@When("Click on Wallet tab and should be navigated to Payment manage page")
	public void click_on_wallet_tab_and_should_be_navigated_to_payment_manage_page() throws IOException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		/*List<String> grid_path = new ArrayList<String>(getAlldata("Record_Health"));
		for(int i=0; i<grid_path.size(); i++) {
			grid_tiles(grid_path.get(i));
		}*/
		
		grid_tiles("//body/div[@id='root']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/hr[1]");
		
		//System.out.print(grid_path.get(i));
	
	/*List<WebElement> elements=driver.findElements(By.xpath("//span[@class='MuiBadge-root']//p"));
	int eleSize = elements.size();
	System.out.println("Element size is"+eleSize );
	boolean stopflag=false;
	boolean walletflag=false;
	boolean billsflag=false;
	boolean awardPointsflag=false;
	Iterator<WebElement> itr = elements.iterator();
	
	for(int i=0; i<eleSize; i++) {
		
		 WebElement wb = itr.next();
		 String eleText=wb.getText();
			if(eleText.equalsIgnoreCase("Wallet")) {
				if(walletflag==false)
				{
				
					click("Wallet");
					//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
					//Assert.assertEquals(true,value,"wallet test case passed");	
					Thread.sleep(4000);
					System.out.println("wallet test case passed");
					walletflag=true;
					browser_back();
					
				}
				
				else
				{	
					wb = itr.next();
					eleText=wb.getText();
				}
			
				System.out.println("Wallet");
				
			}else if(eleText.equalsIgnoreCase("Bills")) {
				if(billsflag==false)
				{
				
					click("Bills");
					//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
					//Assert.assertEquals(true,value,"wallet test case passed");	
					Thread.sleep(4000);
					System.out.println("wallet test case passed");
					billsflag=true;
					browser_back();
					
				}
				
				else
				{	
					wb = itr.next();
					eleText=wb.getText();
				}
			
				System.out.println("Bills");
			}else if(eleText.equalsIgnoreCase("Immunizations")) {
				if(walletflag==false)
				{
				
					click("Immunizations");
					//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
					//Assert.assertEquals(true,value,"wallet test case passed");	
					Thread.sleep(4000);
					System.out.println("wallet test case passed");
					walletflag=true;
					browser_back();
					
				}
				
				else
				{	
					wb = itr.next();
					eleText=wb.getText();
				}
				System.out.println("Immunization");
			}else if(eleText.equalsIgnoreCase("Award Points")) {
				if(awardPointsflag==false)
				{
				
					click("Award Points");
					//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
					//Assert.assertEquals(true,value,"wallet test case passed");	
					Thread.sleep(4000);
					System.out.println("wallet test case passed");
					awardPointsflag=true;
					browser_back();
					
				}
				
				else
				{	
					wb = itr.next();
					eleText=wb.getText();
				}
			}else if(eleText.equalsIgnoreCase("Second opinions")) {
				if(walletflag==false)
				{
				
					click("Second Opinions");
					//value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
					//Assert.assertEquals(true,value,"wallet test case passed");	
					Thread.sleep(4000);
					System.out.println("wallet test case passed");
					walletflag=true;
					browser_back();
					
				}
				
				else
				{	
					wb = itr.next();
					eleText=wb.getText();
				}
			}else  {
				System.out.println("Option not found");
			}
			
			
		
	 
	}*/
	 

	}
}











