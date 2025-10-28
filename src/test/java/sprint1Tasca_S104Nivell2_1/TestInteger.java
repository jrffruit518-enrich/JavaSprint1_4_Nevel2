package sprint1Tasca_S104Nivell2_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestInteger {
    @Test
    void testInteger() {
        Integer number = 18;
        Integer number1 = 18;
        Integer number2 = 38;
        assertThat(number).isEqualTo(number1);
        assertThat(number).isNotEqualTo(number2);
    }
}
