package adapterpaterndemo1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculateAdapt extends PayCalculator implements ICalculate{
    public void calHourly(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the employee name: ");
            String eName = br.readLine();

            System.out.println("Enter the Rate per Hour");
            int rate = Integer.parseInt(br.readLine());
            System.out.println("\n");

            System.out.println("Enter the number of Hours: ");
            int hourly = Integer.parseInt(br.readLine());
            setCalc(rate, hourly);
            System.out.println("\n");
            setEmpName(eName);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public String show(){
        String eName = getEmpName();
        return "the employee name is: " + eName + "\n";
    }
}
