package decoratorpatterndemo;

public class ITDegree extends ProgDecorator{
    public ITDegree(Program newProgram) {
        super(newProgram);
    }
    public String prepareProg(){
        return super.prepareProg()+" IT Degree Fee in SAR is :  ";
    }
    public double progPrice()   {
        return super.progPrice()+15000.00;
    }
}

