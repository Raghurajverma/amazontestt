package factoryPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElement {
	
	  @FindBy(xpath="//h1[text()='Welcome to Prime Video']") private static WebElement category;
	  
	  public static String Assert() 
		{  
			return category.getText();
		}
}
