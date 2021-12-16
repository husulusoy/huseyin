package guru99.stepsDefinitions;

import guru99.utils.ConfigurationsReader;
import guru99.utils.Driver;
import io.cucumber.java.Scenario;
import org.apache.poi.ss.formula.functions.T;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {
    @Before
    public void setup(Scenario scenario){
          System.out.println("***TEST****");
          Driver.getDriver().manage().window().maximize();
          Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
          Driver.getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//        Driver.getDriver().manage().window().maximize();
//        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//    @After
//    public void tearDown(Scenario scenario){
//
//        if(scenario.isFailed()){
//            byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(data, "image/png", scenario.getName());
//        }
//        Driver.closeDriver();

    }



}
