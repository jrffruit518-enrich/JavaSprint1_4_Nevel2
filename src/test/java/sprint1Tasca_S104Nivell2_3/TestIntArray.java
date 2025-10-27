package sprint1Tasca_S104Nivell2_3;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestIntArray {
    @Test
    void testArraysAreIdentical() {
        int [] expectedArray = {18, 38, 58};
        int [] actualArray = {18, 38, 58};
        assertThat(expectedArray).isEqualTo(actualArray);

    }
}
