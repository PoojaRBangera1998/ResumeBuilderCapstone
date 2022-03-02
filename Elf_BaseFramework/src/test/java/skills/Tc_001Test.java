package skills;

import java.awt.Desktop.Action;
import java.util.Set;

import org.apache.tools.ant.Main;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.EducationPage;
import pomRepository.MainPage;
import pomRepository.ProfilePage;
import pomRepository.ProjectDetailsPage;
import pomRepository.SkillPage;
import pomRepository.SummaryPage;

public class Tc_001Test extends Base_Class {
	@Test 
	public void Profile() {
		String firstName=excelUtil.readStringDataFromExcel("Sheet1",0, 0);
		String summaryText=excelUtil.readStringDataFromExcel("Sheet1", 0, 1);
		String  ProjectName=excelUtil.readStringDataFromExcel("Sheet1",0 , 2);
		String assertLastName=excelUtil.readStringDataFromExcel("Sheet1",0 , 3);
		
		//-----------------------------------Profile-----------------------------------//
		ProfilePage profilepage=new ProfilePage(driver);
		profilepage.getFirstName().click();
		profilepage.getFirstName().clear();
		profilepage.getFirstName().sendKeys(firstName);
		
		//-----------------------------------Assert-----------------------------------//
		String actualFname=profilepage.getAssertLastName().getText();
		String expectedFname=excelUtil.readStringDataFromExcel("Sheet1", 0, 3);
		Assert.assertEquals(actualFname, expectedFname,"First Name Has Not Been Added into Profile Category");
		Reporter.log("FirstName Is Updated Successfully in Profile Category",true);
		
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
		
		//-----------------------------------Education----------------------------------//
		EducationPage educationPage=new EducationPage(driver);
		educationPage.getEducationButton().click();
		educationPage.loginToApp();
		
		//----------------------------------MainPage-----------------------------------//
		MainPage mainPage=new MainPage(driver);
		mainPage.getDownloadButton().click();
		mainPage.getPdfButton().click();
		
		
	}

}
