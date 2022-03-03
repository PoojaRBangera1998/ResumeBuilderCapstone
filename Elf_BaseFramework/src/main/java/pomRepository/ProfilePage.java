package pomRepository;
/***
 * Pooja R Bangera
 */
import javax.xml.xpath.XPath;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {

	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//-------------------------FirstName TextField----------------------------//
	@FindBy(xpath = "//input[@value='FirstName']")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}

	//--------------------------LastNamae TextField-----------------------------//
	@FindBy(xpath = "//input[@value='LastName']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}

	//------------------------------Technology DropDown---------------------------//
	@FindBy(xpath="//select[@id='Technology']")
	private WebElement TechnologyDropDown;

	public WebElement getTechnologyDropDown() {
		return TechnologyDropDown;
	}

	public void technologyDropDown() {
		Select select = new Select(TechnologyDropDown);
		select.selectByVisibleText("React JS");
	}

	//---------------------------Total Exp(Year)-----------------------------------//
	@FindBy(xpath="//label[text()='Total Exp(year)']/..//select[@id='Total Experience']")
	private WebElement TotalYearExpDropDown;
	
	public WebElement getTotalYearExpDropDown() {
		return TotalYearExpDropDown;
	}
	public void totalYearExpDropDown() {
		Select select = new Select(TotalYearExpDropDown);
		select.selectByValue("3");
	}
	
	//------------------------------Total Exp(Month)-------------------------------//
	@FindBy(xpath="//label[text()='Total Exp(month)']/..//select[@id='Total Experience']")
	private WebElement TotalExpMonthDropDown;
	
	public WebElement getTotalExpMonthDropDown() {
		return TotalExpMonthDropDown;
	}
	public void totalExpMonthDropDown() {
		Select select = new Select(TotalExpMonthDropDown);
		select.selectByValue("9");
	}
	

	// --------Assert--------//
	@FindBy(xpath = "//div[contains(text(),'Rama')]")
	private WebElement assertLastName;

	public WebElement getAssertLastName() {
		return assertLastName;
	}

}
