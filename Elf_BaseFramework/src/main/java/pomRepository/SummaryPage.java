package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.Base_Class;

public class SummaryPage extends Base_Class {
	
	public SummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//------------------------SummaryButton----------------------------------//
	@FindBy(xpath="//button[text()='Summary']") private WebElement SummaryButton;
	public WebElement getSummaryTextField() {
		return SummaryTextField;
	}
	//------------------------SummaryTextField----------------------------------//
	@FindBy(xpath="//div[@class='input-data']") private WebElement SummaryTextField;
	public WebElement getSummaryButton() {
		return SummaryButton;
	}
	
	

}
