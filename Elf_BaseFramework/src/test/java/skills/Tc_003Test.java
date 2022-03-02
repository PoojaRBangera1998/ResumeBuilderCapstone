package skills;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.EducationPage;
import pomRepository.MainPage;
import pomRepository.ProfilePage;
import pomRepository.SkillPage;
import pomRepository.SummaryPage;

public class Tc_003Test extends Base_Class{
	@Test 
	public void Profile() throws InterruptedException{
		String firstName=excelUtil.readStringDataFromExcel("Sheet1",0, 0);
		String LastName=excelUtil.readStringDataFromExcel("Sheet1", 1, 0);
		String summaryText=excelUtil.readStringDataFromExcel("Sheet1", 0, 1);
		double YearOfPassedOut=excelUtil.readNumberDataFromExcel("Sheet1", 1, 1);
		String  ProjectName=excelUtil.readStringDataFromExcel("Sheet1",0 , 2);
		String actualName=excelUtil.readStringDataFromExcel("Sheet1",0 , 4);
		
		//-----------------------------------Profile-----------------------------------//
		ProfilePage profilepage=new ProfilePage(driver);
		profilepage.getFirstName().click();
		profilepage.getFirstName().clear();
		profilepage.getFirstName().sendKeys(firstName);
		profilepage.getLastName().click();
		profilepage.getLastName().clear();
		profilepage.getLastName().sendKeys(LastName);
		profilepage.getTechnologyDropDown().click();
		profilepage.technologyDropDown();
		profilepage.getTotalYearExpDropDown().click();
		profilepage.totalYearExpDropDown();
		profilepage.getTotalExpMonthDropDown().click();
		profilepage.totalExpMonthDropDown();
	
	
		//-----------------------------------Assert-----------------------------------//
		String expectedName=excelUtil.readStringDataFromExcel("Sheet1", 0, 4);
		Assert.assertEquals(actualName, expectedName,"FirstName and LastName Has Not Been Added into Profile Category");
		Reporter.log("FirstName and LastName Is Updated Successfully in Profile Category",true);
		
		//-----------------------------------Summary----------------------------------//
		SummaryPage summaryPage=new SummaryPage(driver);
		summaryPage.getSummaryButton().click();
		summaryPage.getSummaryTextField().click();
		Actions actions=new Actions(driver);
		actions.sendKeys(summaryText).click().perform();
		
		//-----------------------------------Skills----------------------------------//
		SkillPage skillPage=new SkillPage(driver);
		skillPage.getSkillButton().click();
		skillPage.getFrontEndTextField().click();
		skillPage.getFrontEndDropDown().click();
		skillPage.getBackEndTextField().click();
		skillPage.getHtmlbutton().click();
		
		//-----------------------------------Education----------------------------------//
		EducationPage educationPage=new EducationPage(driver);
		educationPage.getEducationButton().click();
		educationPage.loginToApp();
		
		
		//----------------------------------MainPage-----------------------------------//
		MainPage mainPage=new MainPage(driver);
		actions.moveToElement(mainPage.getProfilePiccheckBox()).click().perform();
		mainPage.getDownloadButton().click();
		mainPage.getPdfButton().click();
		Thread.sleep(5000);
		
		
	}

}
