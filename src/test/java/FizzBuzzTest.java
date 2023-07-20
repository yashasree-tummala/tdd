import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    @Test
    void shouldReturnFizzWhenTheNumberIsDivisibleBy3() throws NegativeNumberException {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(6);

        assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnFizzWhenTheNumberIsDivisibleBy5() throws NegativeNumberException {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(10);

        assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnFizzBuzzWhenTheNumberIsDivisibleBy3And5() throws NegativeNumberException {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(15);

        assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnSameNumberInStringWhenTheNumberIsNotDivisibleBy3Or5() throws NegativeNumberException {

        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.convert(7);

        assertEquals("7", result);
    }

    @Test
    void shouldThrowExceptionWhenTheNumberIsNegative() {

        FizzBuzz fizzBuzz = new FizzBuzz();

        assertThrows(NegativeNumberException.class, () -> { fizzBuzz.convert(-4);});

    }
}
