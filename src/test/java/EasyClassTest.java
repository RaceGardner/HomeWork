/**
 * simple class taking in 3 attributes with setters and getters to generate a UML file
 * @author Race Gardner
 * @version 0.1.0
 * @since 09/06/2026
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyClassTest {

    EasyClass class1;
    EasyClass class2;
    String bob = "bob";
    int count = 5;
    Double num = 3.5;

    @BeforeEach
    void setUp() {
        class1 = new EasyClass("matt",10,2.2);
        class2 = new EasyClass(bob, count, num);
    }

    @AfterEach
    void tearDown() {
        class1 = null;
        class2 = null;
    }

    @Test
    void getScore() {
        assertEquals(2.2, class1.getScore());
    }

    @Test
    void setScore() {
        class1.setScore(5.5);
        assertEquals(5.5, class1.getScore());
    }

    @Test
    void getCount() {
        assertEquals(10, class1.getCount());
    }

    @Test
    void setCount() {
        class1.setCount(7);
        assertEquals(7, class1.getCount());
    }

    @Test
    void getName() {
        assertEquals("matt", class1.getName());
    }

    @Test
    void setName() {
        class1.setName("Hope");
        assertEquals("Hope", class1.getName());
    }
}