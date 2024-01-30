package abstractfactorydemo;

public class ITDiploma extends Diploma{
    public ITDiploma(){
        duration = 3;
        fee = 5000;
    }
    @Override
    public void Compute(){
        System.out.println("The IT Diploma is: " + duration*fee + " SAR\n");
    }
}
