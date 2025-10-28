package sprint1Tasca_S104Nivell2_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestInteger {
    @Test
    void testIntegerBeEqual() {
        Integer number = 18;
        Integer number1 = 18;
        assertThat(number).isEqualTo(number1);
    }

    @Test
    void testIntegerNotBeEqual() {
        Integer number = 18;
        Integer number1 = 12;
        assertThat(number).isNotEqualTo(number1);
    }
}
