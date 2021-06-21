//package org.stepic.java.shapes;

import java.awt.*;

public class Shapes {
    public final Color color;
    public Shapes(Color color){this.color=color;}
    public Color getColor() {return color;}
    public double getArea() {return  Double.NaN;}

    public enum Color{
        BLACK,
        WHITE,
        RED,
        GREEN,
        BLUE
    }

}
