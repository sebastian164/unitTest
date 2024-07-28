package disccounts;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class PriceCalculator {

    private final List<Double> listPrice = new ArrayList<>();
    private double discount=0;

    public PriceCalculator(){//default implementation
    }

    public double getTotal() {
        return listPrice.stream().mapToDouble(Double::doubleValue).sum() * ((100-getDiscount())/100);
    }

    public void addPrice(double price) {
        listPrice.add(price);
    }

}
