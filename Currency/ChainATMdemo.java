package Currency;

import com.sun.net.httpserver.Filter;

import java.util.Scanner;

public class ChainATMdemo {
    private DispenseChain c1;

    public ChainATMdemo(){
        this.c1 = new Riyal50Dispenser();
        DispenseChain c2 =new Riyal20Dispenser();
        DispenseChain c3 = new Riyal50Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    public static void main(String[] args) {
        ChainATMdemo atmDispenser = new ChainATMdemo();
        while(true){
            int amount = 0;
            System.out.println("Enter the amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if(amount % 10 != 0){
                System.out.println("should be multiples of ten");
                return;
            }
            atmDispenser.c1.dispense(new Currency(amount));

        }
    }
}
