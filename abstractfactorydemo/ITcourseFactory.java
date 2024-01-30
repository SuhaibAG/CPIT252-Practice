package abstractfactorydemo;

public class ITcourseFactory implements AbstractFactory{

    @Override
    public Degree calculateTotolFee() {
        return new ITDegree();
    }

    @Override
    public Diploma calculatetotalFee(){
        return new ITDiploma();
    }
}
