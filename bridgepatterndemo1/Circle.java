package bridgepatterndemo1;

public class Circle implements Shape{
    @Override
    public void area() {
        System.out.println("the area of the circle is: " + 3.14 * 2 * 2);
    }

    @Override
    public void volume() {
        System.out.println("the volume of the circle can not be calculated");
    }
}
