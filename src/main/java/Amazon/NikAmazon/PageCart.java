package Amazon.NikAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCart {

	@FindBy(xpath="//span[text()='Account & Lists']")private WebElement signclick;
	@FindBy(xpath="//input[@type='email']")private WebElement username;
	@FindBy(xpath="//input[@type='submit']")private WebElement continueclick;
	@FindBy(xpath="//input[@type='password']")private WebElement password;
	@FindBy(xpath="//input[@id='signInSubmit']")private WebElement clicksubmit;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement search;
	@FindBy(xpath="//input[@id='nav-search-submit-button']")private WebElement submit;
	@FindBy(xpath="//span[text()='Samsung Galaxy S23 5G (Green, 8GB, 256GB Storage)']")private WebElement product;
    @FindBy(xpath="//input[@id='add-to-cart-button']")private WebElement cart;
    
    //Intialization
    public PageCart(WebDriver driver) {
    	PageFactory.initElements(driver,this);
    }
    
    //Usage
    
    public void Verifysignclick() {
    	signclick.click();
    }
    
    public void SetUsername() {
    	username.sendKeys("9623827145");
    }
    
    public void Verifyclickcontinue() {
    	continueclick.click();
    }
    
    public void SetPassword() {
    	password.sendKeys("123456789");
    }
    
    public void VerifyClicksubmit() {
    	clicksubmit.click();
    }
    
    public void VerifySearch() {
    	search.sendKeys("Samsung Galaxy S23");
    }
    
    public void VerifySearchbtn() {
    	submit.click();
    }
    
    public void VerifyClickonProduct() {
    	product.click();
    }
    
    public void Verifyclickoncart() {
    	cart.click();
    }    
}
