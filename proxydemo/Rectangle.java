package proxydemo;

public class Rectangle extends Circle{
    public void display(){
        System.out.println("the rectangle acts as proxy");
        super.display();
    }
}
