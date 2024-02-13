package compositepatterndemo1;

public class CommercialPlan implements Plan{
    private int rate = 10;
    private int unit = 600;

    @Override
    public void show() {
        System.out.print("The bill of Commercial Plan is: " + unit * rate + "\n");
    }

}
