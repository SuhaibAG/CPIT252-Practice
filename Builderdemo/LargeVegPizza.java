package Builderdemo;

public class LargeVegPizza extends VegPizza{
    @Override
    public int price(){
        return 120;
    }
    @Override
    public String name(){
        return "Small Veg Pizza";
    }
    @Override
    public String size(){
        return "Small Size";
    }

}
