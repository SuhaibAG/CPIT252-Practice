package decoratorpatterndemo;

public class CSDegree extends ProgDecorator{

    public CSDegree(Program newProgram)    {
        super(newProgram);
    }
    public String prepareProg(){
        return super.prepareProg()+" with CS Degree in SAR is: ";
    }
    public double progPrice()   {
        return super.progPrice()+16500.0;
    }

}
