import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void testGenerateListOfNumbersUpToThree() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(3);
        assertEquals("1, 2, Fizz", result);
    }

    @Test
    void testGenerateListOfNumbersUpToFive() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(5);
        assertEquals("1, 2, Fizz, 4, Buzz", result);
    }

    @Test
    void testGenerateListOfNumbersUpToFifteen() {
        FizzBuzz subject = new FizzBuzz();
        String result = subject.generate(15);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", result);
    }
}
