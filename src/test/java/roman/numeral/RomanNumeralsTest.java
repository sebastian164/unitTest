package roman.numeral;

import org.junit.Test;

import static org.junit.Assert.*;
import static roman.numeral.RomanNumerals.arabicToRoman;

public class RomanNumeralsTest {

    @Test
    public void validateArabicToRoman() {
        assertEquals("I", arabicToRoman(1));
        assertEquals("II", arabicToRoman(2));
        assertEquals("III", arabicToRoman(3));
        assertEquals("V", arabicToRoman(5));
        assertEquals("VI", arabicToRoman(6));
        assertEquals("VII", arabicToRoman(7));
        assertEquals("X", arabicToRoman(10));
        assertEquals("XI", arabicToRoman(11));
        assertEquals("XV", arabicToRoman(15));
        assertEquals("XVI", arabicToRoman(16));
        assertEquals("L", arabicToRoman(50));
        assertEquals("LI", arabicToRoman(51));
        assertEquals("LV", arabicToRoman(55));
        assertEquals("LVI", arabicToRoman(56));
        assertEquals("LX", arabicToRoman(60));
        assertEquals("LXX", arabicToRoman(70));
        assertEquals("LXXX", arabicToRoman(80));
        assertEquals("LXXXI", arabicToRoman(81));
        assertEquals("LXXXV", arabicToRoman(85));
        assertEquals("LXXXVI", arabicToRoman(86));
        assertEquals("CXXVI", arabicToRoman(126));
        assertEquals("MMDVII", arabicToRoman(2507));
    }
}