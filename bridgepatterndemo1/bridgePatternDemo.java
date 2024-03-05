package bridgepatterndemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bridgePatternDemo {
    static int choice;

    public static void main(String[] args) throws IOException {
    Shape obj1 = new Circle();
    Shape obj2 = new Rectangle();
    Shape obj3 = new Sphere();


        do {
        System.out.println("Shape options");
        System.out.println("1- Circle");
        System.out.println("2- Rectangle");
        System.out.println("3- Sphere");
        System.out.println("4- Exit");
        System.out.println("Enter your choice");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        choice = Integer.parseInt(br.readLine());

        switch (choice) {
            case 1: {
                obj1.area();
                obj1.volume();
            }
            break;

            case 2: {
                obj2.area();
                obj2.volume();
            }
            break;
            case 3: {
                obj3.area();
                obj3.volume();
            }
            break;
            default: {
                System.out.println("Nothing you select");
            }
            return;
        }

    } while (choice != 4);
}

}

