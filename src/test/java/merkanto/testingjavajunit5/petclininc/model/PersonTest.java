package merkanto.testingjavajunit5.petclininc.model;

import merkanto.testingjavajunit5.petclininc.ModelTests;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest implements ModelTests {

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

    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("My Repeated Test")
    void myRepeatedTest() {
        //todo - impl
    }

    @RepeatedTest(5)
    void myRepeatedTestWithOI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 5, name = "{displayName} : {currentRepetition} | {totalRepetitions}")
    @DisplayName("My Assignment Repeated Test")
    @Test
    void myAssignmentRepeated() {
        //todo impl
    }
}