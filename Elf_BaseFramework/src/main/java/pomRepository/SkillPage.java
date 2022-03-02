package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillPage {

	public SkillPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//-----------------------------------FrontEnd Technologies DropDown----------------------------------//
	@FindBy(xpath="//button[text()='Skills']") private WebElement skillButton;
	@FindBy(xpath="//input[@placeholder='Frontend Technologies']") private WebElement frontEndTextField;
	
	@FindBy(xpath = "//li[text()='HTML']")private WebElement frontEndDropDown;
	
	
	//-----------------------------------BackEnd Technologies DropDown----------------------------------//
	@FindBy(xpath = "//input[@placeholder='Backend Technologies']") private WebElement backEndTextField;
	@FindBy(xpath = "//li[text()='Xml']")private WebElement Htmlbutton;
	
	
	public WebElement getSkillButton() {
		return skillButton;
	}
	public WebElement getFrontEndTextField() {
		return frontEndTextField;
	}
	public WebElement getFrontEndDropDown() {
		return frontEndDropDown;
	}
	public WebElement getBackEndTextField() {
		return backEndTextField;
	}
	public WebElement getHtmlbutton() {
		return Htmlbutton;
	}

	
	
	
}
