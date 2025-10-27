package sprint1Tasca_S104Nivell2_6;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestAccessArray {
    @Test
    void testIndexOutOfBoundsException() {
        assertThatThrownBy(()-> ArrayHandler.accessArray(5)).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }
}
