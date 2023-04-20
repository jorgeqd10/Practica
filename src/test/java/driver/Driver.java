package driver;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Driver extends ThucydidesWebDriverSupport {

    protected WebDriver driver;

    public Driver() {
        this.driver = getDriver();
        useDriver(getDriver());
    }
}
