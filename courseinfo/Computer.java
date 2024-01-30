package courseinfo;

public class Computer extends Course{
    public void getDuration(){
        duration = 8;
        System.out.println(duration);
    }

    public void getFeePerSemester(){
        fee = 3000;
        System.out.println(fee);
    }
}
