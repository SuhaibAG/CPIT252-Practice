package Builderdemo;

public class SmallNonVegPiza extends NonVegPizza{
    @Override
    public int price(){
        return 180;
    }
    @Override
    public String name(){
        return "Small NonVeg Pizza";
    }
    @Override
    public String size(){
        return "Small Size";
    }
}
