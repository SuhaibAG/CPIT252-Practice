package compositepatterndemo1;

public class PlanDirectory implements Plan {
    public void add(Plan p) {
        p.show();
    }
    public void show()
    {
        System.out.println("PlanDirectiory is a COMPOSITE Class \n Domestic Plan and Commercial Plan are examples of Leaf Classes");
    }
}


