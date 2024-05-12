package Interpretordemo;

public class InterpreterContext {
    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }
    public String getHexdecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
