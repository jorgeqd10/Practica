package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage {
    protected WebDriverWait wait;

    @FindBy(xpath = "//a[contains(text(), 'Laptops')]")
    private WebElement laptopsLink;

    @FindBy(xpath = "//div[@class='card-block']")
    protected List<WebElement> card;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    }

    public void opendevicePage(){
        getDriver().manage().window().maximize();
        getDriver().get("https://www.demoblaze.com/index.html#");
    }

    public void gotoLaptopsLink() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(laptopsLink)).click();
        Thread.sleep(2000);
    }

}
