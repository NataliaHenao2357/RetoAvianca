package test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.StepsAvianca;
import org.testng.annotations.Test;

public class TestAvianca {

    @Steps
    StepsAvianca stepsAvianca = new StepsAvianca();

    @BeforeMethod
    public void before()  {

        SeleniumWebDriver.ChromeWebDriver("https://www.avianca.com/co/es/");
    }
    @Test
    public void test() {
    	stepsAvianca.buscarVuelo();
    }
    @AfterMethod
    public void after()  {
        SeleniumWebDriver.driver.close();
    }
}