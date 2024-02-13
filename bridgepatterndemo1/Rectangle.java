package bridgepatterndemo1;

public class Rectangle implements Shape{
    @Override
    public void area() {
        System.out.println("the area of the circle is: " + 3 * 3 );
    }

    @Override
    public void volume() {
        System.out.println("the volume of the rectangle is: " + 3 * 3 * 3);
    }
}


