package proxydemo2;

public class PizzaSubject implements pizza{
    @Override
    public void size() {
        System.out.println("in a standard size and price in SAR is:");
    }

    @Override
    public void price() {
        System.out.println("150");
    }

    @Override
    public void name(){
        System.out.println("Veg Pizza is available");
    }
}
