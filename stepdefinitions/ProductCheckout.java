package org.stepdefinitions;

import java.awt.AWTException;
import java.io.IOException;

import org.base.classes.BaseClass;
import org.junit.Assert;
import org.pojo.ProductCheckoutPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductCheckout extends BaseClass{
	
	ProductCheckoutPOJO p;
	
	@When("Launch the flipkart application in browser")
	public void launch_the_flipkart_application_in_browser() throws IOException {
		launchUrl(getPropertyDatas("url")); 
		waitsUsingImplicit();
	}


	@When("Verify that the homepage loads successfully")
	public void verify_that_the_homepage_loads_successfully() throws IOException {
		
		Assert.assertEquals("User not successfully entered into homepage", getUrl(), getPropertyDatas("url"));
	    
	}
	
	

	@When("To search product by providing product name")
	public void to_search_product_by_providing_product_name() throws AWTException, IOException {
	    
		p = new ProductCheckoutPOJO();
		passText(p.getSearchBox(), getPropertyDatas("productname")); 
		pressEnter();
	}

	@When("To click any one of the product in product list page")
	public void to_click_any_one_of_the_product_in_product_list_page() throws IOException {
	    
		clickWebelement(p.getSelectProduct());
	}

	@When("To add the product into cart")
	public void to_add_the_product_into_cart() {
		
	    switchWindow(1);
	    waitsUsingImplicit();
	    clickWebelement(p.getAddToCart());
	}

	@When("To Verify that the correct item is in the cart")
	public void to_Verify_that_the_correct_item_is_in_the_cart() throws IOException {
	    
		Assert.assertTrue("In valid product got added", p.getVerifyProductInCart().getText().contains(getPropertyDatas("productname")));
	}

	@When("To check out the product from cart")
	public void to_check_out_the_product_from_cart() {
	    
		clickWebelement(p.getPlaceOrder());
	}
	
	@When("To check the login credential")
	public void to_check_the_login_credential() throws IOException {
		passText(p.getLoginSearchBox(), getPropertyDatas("phonenumber"));
		clickWebelement(p.getContinueBtn());
		
		
	}

	

	

		

		
		
		
		
	
	

}
