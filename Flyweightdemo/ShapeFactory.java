package Flyweightdemo;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCirlce(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
