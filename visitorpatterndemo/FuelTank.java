package visitorpatterndemo;

public class FuelTank implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
