package decoratorpatterndemo;

public class ITDiploma implements Program{
    public String prepareProg(){
        return "IT Diploma fee";
    }

    public double progPrice(){
        return 5000.0;
    }
}



