package sprint1Tasca_S104Nivell2_5;
import  static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMapKey {
    @Test
    void testMapKey() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"good");
        map.put(2,"nice");
        assertThat(map).containsKey(1);



    }
}
