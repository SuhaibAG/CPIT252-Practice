package bridgepatterndemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BridgePatternDemo {
    static int choice;
    public static void main(String[] args) throws IOException {
        Switch obj1 = new Fan();
        Switch obj2 = new Bulb();


        do {
            System.out.println("Switch options");
            System.out.println("1- Fan");
            System.out.println("2- Bulb");
            System.out.println("3- Exit");
            System.out.println("Enter your choice");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1: {
                    obj1.switchOn();
                    obj1.switchOff();
                }
                break;

                case 2: {
                    obj2.switchOn();
                    obj2.switchOff();
                }
                break;
                default: {
                    System.out.println("Nothing you select");
                }
                return;
            }

        } while (choice != 3);
    }

}
