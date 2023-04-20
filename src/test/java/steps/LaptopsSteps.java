package steps;

import PO.categories.Laptops;
import io.cucumber.java.en.And;

public class LaptopsSteps {
    Laptops laptops = new Laptops();

    @And("Print laptop name and price of position {int}")
    public void printLaptopNameAndPriceOfPosition(int index) {
        laptops.getPrice(index);
        laptops.getDeviceName(index);

    }
}
