package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyConverter {

	WebDriver driver;
	String r;

	@FindBy(xpath = "//div[@class='tab-box__TabRow-sc-28io75-1 bCvmkT']//a[@href='/currencyconverter/']")
	WebElement convert;

	@FindBy(xpath = "//div[@class='base-combobox__InputWrapper-iyxb4f-4 hhBDpD']//input[@id='midmarketFromCurrency']")
	WebElement fromCurInput;

	@FindBy(id = "midmarketToCurrency")
	WebElement toCurInput;

	@FindBy(xpath = "//button[text()='Convert']")
	WebElement convertBtn;

	@FindBy(xpath = "//p[@class='result__BigRate-sc-1bsijpp-1 iGrAod']")
	WebElement result;

	@FindBy(xpath = "//div[@class='tab-box__TabRow-sc-28io75-1 bCvmkT']//a[@href='/currencycharts/']")
	WebElement chart;

	@FindBy(xpath = "//button[text()='View chart']")
	WebElement chartBtn;

	@FindBy(xpath = "//div[@class='currency-charts__ChartHeader-sc-1kf16vc-2 loAEFi']/div[2]/div/p")
	WebElement chartRes;

	public CurrencyConverter(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void convertCuurency() throws InterruptedException {
		convert.click();
		try {
			fromCurInput.sendKeys("euro", Keys.ENTER);
		} catch (StaleElementReferenceException e) {
			fromCurInput.sendKeys("euro", Keys.ENTER);

		}

		toCurInput.sendKeys("can", Keys.ENTER);

		convertBtn.submit();
		Thread.sleep(3000);

	}

	public String resultCurrency() {
		r = result.getText();
		return r.substring(0, 4);
	}

	public String verifyChartRate() throws InterruptedException {
		chart.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chartBtn);
		Thread.sleep(3000);
		r = (String) js.executeScript("return arguments[0].textContent", chartRes);
		System.out.println(r);
		return r.substring(8, 12);

	}

}
