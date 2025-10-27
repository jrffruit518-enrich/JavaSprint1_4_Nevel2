package sprint1Tasca_S104Nivell2_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sprint1Tasca_S104Nivell2_2.Person;
import static org.assertj.core.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

    private List<Object> list;
    private Person person;
    private Person personNotAdded;
    private Integer num;
    private String str;

    @BeforeEach
    void setUp() {
        num = 35;
        str = "hello";
        person = new Person("Rong", 48);
        personNotAdded = new Person("Lina",42);
        list = new ArrayList<>(Arrays.asList(num, str, person));
    }


    @Test
    void testArrayListOrder() {
        assertThat(list).containsExactly(num, str, person);
    }

    @Test
    void testArrayListAnyOrder() {
        assertThat(list).containsExactlyInAnyOrder(num, str, person);
    }

    @Test
    void testContainsOnlyOnce() {
        assertThat(list).containsOnlyOnce(person);
    }

    @Test
    void testDoesNotContain() {
        assertThat(list).doesNotContain(personNotAdded);

    }
}
