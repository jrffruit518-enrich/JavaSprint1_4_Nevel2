package sprint1Tasca_S104Nivell2_1;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestInterger {
    @Test
    void testInterger() {
        Integer number = 18;
        Integer number1 = 18;
        Integer number2 = 38;
        Assertions.assertThat(number).isEqualTo(number1);
        Assertions.assertThat(number).isNotEqualTo(number2);
    }
}
