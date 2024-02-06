package Builderdemo;

public class LargeNonVegPizza extends NonVegPizza{
    @Override
    public int price(){
        return 220;
    }
    @Override
    public String name(){
        return "Large NonVeg Pizza";
    }
    @Override
    public String size(){
        return "Large Size";
    }
}
