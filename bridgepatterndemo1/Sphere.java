package bridgepatterndemo1;

public class Sphere implements Shape{
    @Override
    public void area() {
        System.out.println("the area of the sphere is: " + 4 * 3.14 * 2 * 2);
    }

    @Override
    public void volume() {
        System.out.println("the volume of the sphere is: " + 1.33 * 3.14 * 2 * 2 * 2);
    }
}
