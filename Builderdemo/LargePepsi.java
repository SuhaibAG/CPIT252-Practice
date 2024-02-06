package Builderdemo;

public class LargePepsi extends Pepsi{
    @Override
    public String name() {
        return "750ml Pepsi";
    }

    @Override
    public String size() {
        return "Large Size";
    }

    @Override
    public int price() {
        return 50;
    }
}
