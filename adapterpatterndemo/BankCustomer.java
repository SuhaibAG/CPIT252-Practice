package adapterpatterndemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{
    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name: ");
            String customer = br.readLine();
            System.out.println();

            System.out.println("Enter the account number: ");
            long accno = Long.parseLong(br.readLine());
            System.out.println();

            System.out.println("Enter the bank name: ");
            String bankname = br.readLine();

            setAccHolderName(customer);
            setAccNumber(accno);
            setBankName(bankname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getCreditCard(){
    long accno = getAccNumber();
    String accholdername = getAccHolderName();
    String bname = getBankName();
    return "The Account Number " +accno +" accholdername "
            + accholdername +" bname " + bname +" bank is and authenticated for issuin the credit card ";
    }
}
