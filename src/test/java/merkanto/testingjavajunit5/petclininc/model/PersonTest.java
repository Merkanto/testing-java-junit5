package merkanto.testingjavajunit5.petclininc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1L, "Miro", "Zhelezchev");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Miro"),
                () -> assertEquals(person.getLastName(), "Zhelezchev"));
    }

    @Test
    void groupedAssertionsMsgs() {
        // given
        Person person = new Person(1L, "Miro", "Zhelezchev");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Miro", "First name failed"),
                () -> assertEquals(person.getLastName(), "Zhelezchev", "Last name failed"));
    }
}