package facadepatternphone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    private static int choice;

    public static void main(String[] args) throws IOException {
        do{
            System.out.println("======Mobile Shop=======");
            System.out.println("    1.IPHONE");
            System.out.println("    2.SAMSUNG");
            System.out.println("    3.BLACKBERRY");
            System.out.println("    4.EXIT");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice){
                case 1:{
                    sk.iphoneSale();
                    break;
                }
                case 2:{
                    sk.samsungSale();
                    break;
                }
                case 3:{
                    sk.blackberrySale();
                    break;
                }
                default:{
                    System.out.println("Nothing You purchased");
                }
                return;
            }

        }while(choice!=4);
    }
}
