package fizzbuzz;

import org.junit.Test;

import static fizzbuzz.FizzBuzz.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    /**
     *  Si el número es divisible por 3, retorna “Fizz”
     */

    @Test
    public void return_fizz_when_number_is_divisible_by_3() {
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz(6));
    }

    /**
     *  Si el número es divisible por 5, retorna “Buzz”
     */
    @Test
    public void return_buzz_when_number_is_divisible_by_5() {
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
    }

    /**
     *  Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
     */
    @Test
    public void return_fizz_buzz_when_number_is_divisible_by_3_and_5() {
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz(30));
    }
}