package org.pojo;
import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCheckoutPOJO extends BaseClass {
	
	public ProductCheckoutPOJO() {

		PageFactory.initElements(d, this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private WebElement searchBox;
	
	@FindBy(xpath="//span[@class='_10Ermr']")
	private WebElement checkProduct;
	
	@FindBy(xpath="(//div[@class='_4rR01T'])[1]")
	private WebElement selectProduct;

	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[contains(text(),'Laptop')]")
	private WebElement verifyProductInCart;

	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrder;
	
	@FindBy(xpath="//form//child::input")
	private WebElement loginSearchBox;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//div[text()='Add a new address']")
	private WebElement addAddress;
	
	@FindBy(xpath="//form//child::label[text()='Name']")
	private WebElement name;
	
	@FindBy(xpath="//form//child::label[contains(text(),'10')]")
	private WebElement phNo;
	
	@FindBy(xpath="//form//child::label[text()='Pincode']")
	private WebElement pinCode;
	
	@FindBy(xpath="//form//child::label[text()='Locality']")
	private WebElement locality;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Address')]")
	private WebElement address;
	
	@FindBy(xpath="//form//child::label[contains(text(),'Town')]")
	private WebElement city;
	
	@FindBy(tagName="select")
	private WebElement stateDd;
	
	@FindBy(xpath="//span[contains(text(),'All day')]")
	private WebElement selectHome;
	
	@FindBy(xpath="//button[text()='Save and Deliver Here']")
	private WebElement saveAddress;
	
	@FindBy(xpath="//div[contains(text(),'Laptop')]")
	private WebElement orderSummary;
	
	@FindBy(xpath="//button[text()='CONTINUE']")
	private WebElement sumContinue;
	
	@FindBy(xpath="//button[text()='Accept & Continue']")
	private WebElement accept;
	
	public WebElement getOrderSummary() {
		return orderSummary;
	}

	public WebElement getSumContinue() {
		return sumContinue;
	}

	public WebElement getAccept() {
		return accept;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPhNo() {
		return phNo;
	}

	public WebElement getPinCode() {
		return pinCode;
	}

	public WebElement getLocality() {
		return locality;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getStateDd() {
		return stateDd;
	}

	public WebElement getSelectHome() {
		return selectHome;
	}

	public WebElement getSaveAddress() {
		return saveAddress;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getLoginSearchBox() {
		return loginSearchBox;
	}

	public WebElement getPlaceOrder() {
		return placeOrder;
	}

	public WebElement getVerifyProductInCart() {
		return verifyProductInCart;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public WebElement getCheckProduct() {
		return checkProduct;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	
	

}
