package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//---------------------------profile Pic checkBox---------------------------------//
	@FindBy(xpath="//label[.='Include Profile pic']/..//input[@class='checkBox']") private WebElement profilePiccheckBox;

	public WebElement getProfilePiccheckBox() {
		return profilePiccheckBox;
	}
	
	//---------------------------DownloadButton---------------------------------//
	@FindBy(xpath="//button[text()='Download as']") private WebElement DownloadButton;
	
	public WebElement getDownloadButton() {
		return DownloadButton;
	}
	
	//---------------------------pdfButton---------------------------------//
	@FindBy(xpath="//button[text()='PDF']") private WebElement pdfButton;

	public WebElement getPdfButton() {
		return pdfButton;
	}
	
	//---------------------------wordButton---------------------------------//
	@FindBy(xpath="//button[text()='WORD']") private WebElement wordButton;

	public WebElement getWordButton() {
		return wordButton;
	}
	
	
	
	
}
