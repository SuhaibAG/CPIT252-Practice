package Interpretordemo;

public class IntToHex implements Expression{
    private int i;
    public IntToHex(int c){
        this.i = c;
    }
    @Override
    public String interpret(InterpreterContext ic){
        return  ic.getHexdecimalFormat(this.i);
    }
}
