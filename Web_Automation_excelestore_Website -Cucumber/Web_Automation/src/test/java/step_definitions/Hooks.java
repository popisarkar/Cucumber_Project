package step_definitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utilities.DriverSetUp.openBrowser;
import static utilities.DriverSetUp.quiteBrowser;


public class Hooks {

    public static String browserName = System.getProperty("browser", "Chrome");

    @Before
    public void startBrowser(){
        openBrowser(browserName);
    }

    @After
    public void closeBrowser(Scenario scenario){
        quiteBrowser();
    }

}
