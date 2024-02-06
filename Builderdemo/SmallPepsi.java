package Builderdemo;

public class SmallPepsi extends Pepsi{
    @Override
    public String name(){
        return "300 ml Pepsi";
    }

    @Override
    public String size() {
        return "Small Size";
    }

    @Override
    public int price() {
        return 25;
    }
}
