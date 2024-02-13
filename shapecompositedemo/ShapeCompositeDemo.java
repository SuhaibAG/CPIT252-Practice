package shapecompositedemo;
public class ShapeCompositeDemo {
    public static void main(String[] args) {
        Drawing drawing=new Drawing();
        Shape circle=new Circle();
        Shape rectangle=new Rectangle();

        drawing.draw();
        drawing.add(circle);
        drawing.add(rectangle);

    }

}
