package disccounts;

import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorTest {
    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(15.3);
        assertEquals(25.5, priceCalculator.getTotal(), 0);
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(10.0);
        priceCalculator.addPrice(15.0);
        priceCalculator.setDiscount(50);
        assertEquals(12.5, priceCalculator.getTotal(), 0);
    }
}