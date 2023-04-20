package PO.categories;

import PO.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Laptops extends BasePage {

    private String price = ".//h5[contains(text(), '$')]";

    private String deviceName = ".//h4[@class='card-title']";

    public Laptops() {
        PageFactory.initElements(getDriver(), this);
    }

    public void getPrice(int index){
        wait.until(ExpectedConditions.visibilityOf(card.get(index)));
        System.out.println("el precio es:" + card.get(index).findElement(By.xpath(price)).getText());
    }

    public void getDeviceName(int index){
        wait.until(ExpectedConditions.visibilityOf(card.get(index)));
        System.out.println("el nombre es:" + card.get(index).findElement(By.xpath(deviceName)).getText());
    }
}
