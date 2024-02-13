package compositepatterndemo1;

public class DomesticPlan implements Plan{
    private int rate=5;
    private int unit=1000;
    @Override
    public void show() {
        System.out.print("The bill of Domestic Plan is: "+unit*rate+"\n");
    }
}


