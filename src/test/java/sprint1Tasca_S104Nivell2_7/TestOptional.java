package sprint1Tasca_S104Nivell2_7;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;

/**
 * ClassName: TestOptional
 * Package: sprint1Tasca_S104Nivell2_7
 * Description:
 * Author: Rong Jiang
 * Create:27/10/2025 - 16:31
 * Version:v1.0
 */
public class TestOptional {
    @Test
    void TestOptionalIsEmpty() {
        Optional<String> optional = Optional.empty();
        assertThat(optional).isEmpty();
    }
}
