package pomRepository;
/***
 * Pooja R Bangera
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectDetailsPage {

	public ProjectDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//-------------------------ProjectDetailButton---------------------------------//
	@FindBy(xpath="//button[text()='ProjectDetails']") private WebElement ProjectDetailButton;
	public WebElement getProjectDetailButton() {
		return ProjectDetailButton;
	}

	//-------------------------ProjectNameTextField---------------------------------//
	@FindBy(xpath="//label[text()='Project Name']") private WebElement ProjectNameTextField;
	public WebElement getProjectNameTextField() {
		return ProjectNameTextField;
	}

}
