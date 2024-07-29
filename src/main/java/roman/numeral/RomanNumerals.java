package roman.numeral;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class RomanNumerals {

    @Getter
    enum RomanNumeral {

        M(1000), CM(900), D(500), CD(400),
        C(100), XC(90), L(50), XL(40),
        X(10), IX(9), V(5), IV(4),
        I(1);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public static List<RomanNumeral> getRomanNumerals() {
            return Arrays.asList(RomanNumeral.values());
        }

    }

    /**
     * Constructor of Class
     */
    private RomanNumerals() {
        //add default constructor
    }

    /**
     * Function to covert a decimal number to roman number
     * @param number
     * @return romanNumber
     */
    public static String arabicToRoman(int number) {

        StringBuilder collator = new StringBuilder();
        List<RomanNumeral> romanNumerals = RomanNumeral.getRomanNumerals();

        if (number > 0 && number < 4000) {

            int i = 0;
            while (number > 0 && i < romanNumerals.size()) {
                RomanNumeral currentRoman = romanNumerals.get(i);
                if (number >= currentRoman.getValue()) {
                    collator.append(currentRoman);
                    number -= currentRoman.getValue();
                } else {
                    i++;
                }

            }
            return collator.toString();
        } else {
            throw new IllegalArgumentException(number + "no está en el rango (0,4000)");
        }
    }
}
