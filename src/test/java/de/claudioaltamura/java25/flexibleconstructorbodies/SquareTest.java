package de.claudioaltamura.java25.flexibleconstructorbodies;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void flexibleConstructorBodies() {
        Square square = new Square(Color.RED, 4);
        assertEquals(Color.RED, square.getColor());
        assertEquals(4.0, square.getWidth());
        assertEquals(4.0, square.getHeight());
    }

}