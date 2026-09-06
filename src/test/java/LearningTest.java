/**
 * simple class to use addition and subtraction to create a UML file
 * @author Race Gardner
 * @version 0.1.0
 * @since 09/06/2026
 */

import static org.junit.jupiter.api.Assertions.*;

class LearningTest {

    Learning addition;
    Learning subtraction;
    int x = 6;
    int y = 7;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        addition = new Learning(x,y,"add");
        subtraction = new Learning(x,y,"subtraction");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        addition = null;
        subtraction = null;
    }

    @org.junit.jupiter.api.Test
    void operate() {
        assertEquals(x+y, addition.operate(x,y));

    }

    @org.junit.jupiter.api.Test
    void getX() {
        assertEquals(x, addition.getX());
        assertEquals(x, subtraction.getX());
    }

    @org.junit.jupiter.api.Test
    void setX() {
        assertEquals(x,addition.getX());
        addition.setX(10);
        assertNotEquals(x,addition.getX());
        assertEquals(10,addition.getX());
        assertNotEquals(addition.getX(),subtraction.getX());
    }
}