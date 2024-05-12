package Interpretordemo;

public class IntToBinary implements Expression{
    private int i;
    public IntToBinary(int c){
        this.i = c;
    }
    @Override
    public String interpret(InterpreterContext ic){
        return  ic.getBinaryFormat(this.i);
    }
}
