package facadepatternphone;

public class ShopKeeper {
    private MobileShop Iphone;
    private MobileShop samsung;
    private MobileShop Blackberry;

    public ShopKeeper(){
        Iphone = new IPhone();
        samsung = new Samsung();
        Blackberry = new Blackberry();
    }

    public void iphoneSale(){
        Iphone.modelNo();
        Iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void blackberrySale(){
        Blackberry.modelNo();
        Blackberry.price();
    }
}
