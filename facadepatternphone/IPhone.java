package facadepatternphone;

public class IPhone implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println("IPhone 15");
    }

    @Override
    public void price() {
        System.out.println("5000.00 SAR");
    }
}
