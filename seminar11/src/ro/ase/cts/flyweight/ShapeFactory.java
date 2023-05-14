package ro.ase.cts.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

// clasa flyweight pt creare si gestionare forme
public class ShapeFactory {
    private static Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String key, Color color, int thickness) {
        Shape shape = shapes.get(key);

        if(shape == null) {
            shape = new Circle(color, thickness);
            shapes.put(key, shape);
        }

        return shape;
    }
}
