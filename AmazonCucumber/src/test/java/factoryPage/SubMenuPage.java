package factoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubMenuPage{
WebDriver driver;

public SubMenuPage(WebDriver driver ){
		 this.driver= driver;
		 PageFactory.initElements(driver, this);
	 }
  @FindBy(css=".hm-icon.nav-sprite")  private WebElement HamMenu;
  @FindBy(xpath="//div[text()='Amazon Prime Video']") private WebElement SubMenu;
  @FindBy(xpath="(//a[@class=\"hmenu-item\"][contains(@href,'https://www.primevideo.com/storefront')])[2]") private WebElement abc ;
 // @FindBy(xpath="/html/body/div[3]/div[2]/div[1]/ul[6]/li[4]") private WebElement myLocator4;
  

 
	public void OpenHamburgerMenu() 
	{  
		
		HamMenu.click();
	
	
	}	
	
	public void SelectcategoryfromHamburgermenu() {
		
		SubMenu.click();
		
		
}
	public void SelectfromSubMenu(String CategoryName)  {
		abc.click();
//		  String tabxpath = "//a[contains(text(), '" + CategoryName + "')]";
//		    	driver.findElement(By.xpath(tabxpath)).click();
//		                
		    
	
					

	
	}
	
	
}

