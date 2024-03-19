package proxydemo2;

public class ProxyDesignPatternDemo {
    public static void main(String[] args) {
        ProxyPizza pp = new ProxyPizza();
        pp.name();
        pp.size();
        pp.price();
    }
}
