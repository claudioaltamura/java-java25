package de.claudioaltamura.java25.flexibleconstructorbodies;

import java.awt.*;

public class Square extends Rectangle {
    public Square(Color color, int sideLength) {
        if (sideLength < 0) throw new IllegalArgumentException();
        super(color, sideLength, sideLength);
    }
}