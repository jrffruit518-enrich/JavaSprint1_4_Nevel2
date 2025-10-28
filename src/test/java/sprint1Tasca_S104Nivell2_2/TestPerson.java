package sprint1Tasca_S104Nivell2_2;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestPerson {
    @Test
    void testPersonIsSame() {
        Person person = new Person("Rong", 48);
        Person person1 = person;
        assertThat(person).isSameAs(person1);

    }

    @Test
    void testPersonIsNotSame() {
        Person person = new Person("Rong", 48);
        Person person1 = new Person("Lina", 42);
        assertThat(person).isNotSameAs(person1);
    }
}
