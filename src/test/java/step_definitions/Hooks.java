package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {
    @Before
    public void setup(){
        DriverFactory.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        DriverFactory.cleanDriver();
    }
}
