package shapecompositedemo;

public class Drawing implements Shape{
    public void add(Shape s){
        s.draw();
    }
    @Override
    public void draw() {
        System.out.println("This is a composite Class");
    }

}
