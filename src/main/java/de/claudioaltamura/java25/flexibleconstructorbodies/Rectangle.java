package de.claudioaltamura.java25.flexibleconstructorbodies;

import java.awt.*;

public class Rectangle {
    private final Color color;
    private final double width;
    private final double height;

    public Rectangle(Color color, double width, double height) {
        if(color == null) throw new IllegalArgumentException();
        if (width < 0) throw new IllegalArgumentException();
        if (height < 0) throw new IllegalArgumentException();
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
