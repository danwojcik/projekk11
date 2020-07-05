import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringCalculator();
    }

    @Test
    void testEmptyStringPassed() {
        String value = "";

        int result = calculator.add(value);

        assertThat(result).isEqualTo(0);

    }

    @Test
    void testOneStringPassed() {
        String value = "1";

        int result = calculator.add(value);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void testTwoStringPassed() {
        String value = "1,2";

        int result = calculator.add(value);

        assertThat(result).isEqualTo(3);
    }
}