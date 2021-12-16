package guru99.pages;

import guru99.utils.CommonUtils;
import guru99.utils.Driver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PaymentPage {


    public PaymentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//h2")
    private WebElement verifyPayment;


    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;

    @FindBy(id = "month")
    private WebElement selectMonth;

    @FindBy(id = "year")
    private WebElement selectYear;

    @FindBy(name = "cvv_code")
    private WebElement cvvCode;


    @FindBy(xpath = "//input[@type='submit']")
    private WebElement BuyButton;

    @FindBy(name = "quantity")
    private WebElement selectQuantity;

    @FindBy(xpath = "//Strong")
    private WebElement getDashText;

    @FindBy(xpath = "//h2")
    private WebElement toyText;

    @FindBy(xpath = "//h3")
    private WebElement priceElement;

    public WebElement verifyPrice() {
        return priceElement;
    }

    public WebElement verifyToyText() {
        return toyText;
    }

    public WebElement verifyPaymentPage() {
        return priceElement;

    }

    public void setSelectQuantity(String number) {
        Select select = new Select(selectQuantity);
        select.selectByVisibleText(number);
    }

    public void clickBuyButton() {
        CommonUtils.clickWithWait(BuyButton);
    }

    public void setCardNumber() {

        cardNumber.sendKeys("1234567890123456");
    }

    public void setSelectMonth() {
        Select slct = new Select(selectMonth);
        slct.selectByIndex(3);


    }

    public void setSelectYear() {
        Select select = new Select(selectYear);
        select.selectByIndex(3);
    }

    public void setCvvCode() {
        cvvCode.sendKeys("123");
    }

    public void getVerifyPayment(String string) {
        String expected = "Payment successfull!";
        Assert.assertEquals(expected, string);
    }
    public WebElement getGetDashText(){
        return getDashText;
    }






}
