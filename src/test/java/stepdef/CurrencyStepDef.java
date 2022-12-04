package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CurrencyConverter;

public class CurrencyStepDef {
	
	WebDriver driver = Base.driver;
	CurrencyConverter c=new CurrencyConverter(driver);
	String rate,r1;
	
	@Given("^the user is on the currency converter page$")
	public void the_user_is_on_the_currency_converter_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Currency Exchange Rates - International Money Transfer | Xe");
	    
	}

	@When("^the user convert the currency$")
	public void the_user_convert_the_currency() throws Throwable {
		c.convertCuurency();
	   
	}


	@Then("^the user should see the conversion rate$")
	public void the_user_should_see_the_conversion_rate() throws Throwable {
		r1 = c.resultCurrency();
		Assert.assertEquals(r1,"1.41");
	    
	}
	
	@When("^the user check the rate on the chart$")
	public void the_user_check_the_rate_on_the_chart() throws Throwable {
		rate = c.verifyChartRate();
	    
	}

	@Then("^the rate should match with the conversion rate$")
	public void the_rate_should_match_with_the_conversion_rate() throws Throwable {
		Assert.assertEquals(rate, r1);
	    
	}

}
