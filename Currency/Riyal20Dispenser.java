package Currency;

public class Riyal20Dispenser implements DispenseChain{
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() >= 20){
            int num = cur.getAmount();
            int remainder = cur.getAmount() % 20;
            System.out.println("Dispensing " + num + " 20 SAR note");
            if(remainder != 0){
                this.chain.dispense(new Currency(remainder));
            }
        }
    }
}
