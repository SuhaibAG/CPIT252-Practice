package Interpretordemo;

public class InterpeterClient {
    public InterpreterContext ic;
    public InterpeterClient(InterpreterContext i){
        this.ic= i;
    }

    public String interpet(String str){
        Expression exp = null;
        if(str.contains("Hexadecimal")){
            exp = new IntToHex(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if (str.contains("Binary")) {
            exp = new IntToBinary(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }
        else return str;
        return exp.interpret(ic);
    }
    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in hexadecimal";

        InterpeterClient ec = new InterpeterClient(new InterpreterContext());
        System.out.println(str1 + " = " + ec.interpet(str1));
        System.out.println(str2 + " = " + ec.interpet(str2));
    }
}
