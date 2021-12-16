package guru99.stepsDefinitions;

import guru99.pages.PaymentPage;
import guru99.utils.ConfigurationsReader;
import guru99.utils.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;


public class StepDefin {
    PaymentPage paymentPage = new PaymentPage();

    @Given("The user at the webpage")
    public void the_user_at_the_webpage() {
        Assert.assertTrue(paymentPage.verifyPaymentPage().isDisplayed());


//        Driver.getDriver().get(ConfigurationsReader.getProperty("url"))

    }
    @When("The user wants to verify text as {string}")
    public void the_user_wants_to_verify_text_as(String string) {
        Assert.assertTrue(paymentPage.verifyToyText().isDisplayed());
//        String actualText =Driver.getDriver().findElement(By.xpath("//h2")).getText();
//        String expectedText = "Mother Elephant With Babies Soft Toy";
//        Assert.assertEquals(actualText,actualText,"something is wrong");
//        System.out.println(actualText);


    }
    @When("The user wants to verify price as {string}")
    public void the_user_wants_to_verify_price_as(String string) {
        Assert.assertTrue(paymentPage.verifyPrice().getText().contains("20$"));

    }
    @When("The user wats to set quantity as {int}")
    public void the_user_wats_to_set_quantity_as(String quantity) {
        paymentPage.setSelectQuantity(quantity);


    }

    @When("The user clicks buy button")
    public void the_user_clicks_buy_button() {
        paymentPage.clickBuyButton();

    }

    @Then("The user puts credit card informations")
    public void the_user_puts_credit_card_informations() {
        paymentPage.setCardNumber();
        paymentPage.setSelectMonth();
        paymentPage.setSelectYear();
        paymentPage.setCvvCode();

    }

    @Then("The user want to verify {string}")
    public void the_user_want_to_verify(String string) {
        paymentPage.getVerifyPayment(string);



    }
    @When("The user wants to verify url contains as “payment-gateway”")
    public void the_user_wants_to_verify_url_contains_as_payment_gateway() {
        Assert.assertTrue(paymentPage.getGetDashText().isDisplayed());

    }






}
