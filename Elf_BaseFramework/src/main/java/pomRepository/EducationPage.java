package pomRepository;
/***
 * Pooja R Bangera
 */
import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import genericLibrary.Base_Class;

public class EducationPage extends Base_Class {
	
	public EducationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//-------------------------Education Button-----------------------------------//
	@FindBy(xpath="//button[text()='Education']") private WebElement EducationButton;
	public WebElement getEducationButton() {
		return EducationButton;
	}

	public void loginToApp() {
	Select select = new Select(DropDown);
	select.selectByVisibleText("BE/B.Tech");
	}

	//-------------------------Highest Education DropDown-----------------------------------//
	@FindBy(xpath = "//select[@id='Highest Education']") private WebElement DropDown;
	public WebElement getDropDown() {
		return DropDown;
	}


	
	
}
