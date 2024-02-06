package Builderdemo;

public class SmallCoke extends Coke{
    @Override
    public String name() {
        return "300ml Coke";
    }

    @Override
    public String size() {
        return "Small Size";
    }

    @Override
    public int price() {
        return 20;
    }
}
