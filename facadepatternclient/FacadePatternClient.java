package facadepatternclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
    public static int choice;

    public static void main(String[] args) throws IOException {
        do{
            System.out.println("========PlanType========");
            System.out.println("    1.DomesticPlan");
            System.out.println("    2.CommercialPlan");
            System.out.println("    3.InstitutionalPlan");
            System.out.println("    4.Exit");
            System.out.println("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            PlanKeeper PlanObj = new PlanKeeper();

            switch (choice){
                case 1:{
                    PlanObj.domesticRate();
                    break;
                }
                case 2:{
                    PlanObj.commRate();
                    break;
                }
                case 3:{
                    PlanObj.institutionalRate();
                    break;
                }
                default:{
                    System.out.println("you selected nothing");
                }
                return;
            }

        }while(choice!=4);

    }
}
