package Workshop;

import visitorpatterndemo.Bike;
import visitorpatterndemo.Engine;
import visitorpatterndemo.FuelTank;
import visitorpatterndemo.Visitor;

public class PartsOperator implements Visitor {
    @Override
    public void visit(FuelTank fuelTank) {
        System.out.println("Releasing fuel from tank to Engine");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Accepting fuel from fuel tank and running engine");
    }

    @Override
    public void visit(Bike bike) {
        System.out.println("New going to start bike");
    }
}
