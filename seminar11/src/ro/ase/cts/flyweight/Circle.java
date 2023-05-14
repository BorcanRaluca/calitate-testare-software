package ro.ase.cts.flyweight;

import java.awt.*;

public class Circle implements Shape {
    private Color color;
    private int thickness;

    public Circle(Color color, int thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Se deseneaza cerc la pozitia ("
        + x + ", " + y + ") cu culoarea " + this.color
        + " si grosimea conturului " + thickness);
    }
}
