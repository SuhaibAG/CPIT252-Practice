package Templatev2;

public abstract class RegistrationProcessor {
    public final void processRegistration(){
        collectData();
        if(validateData()){
            register();
            sendConfirmationEmail();

        }
        else {
            handleError();
        }
    }
    abstract void collectData();
    protected abstract boolean validateData();
    abstract void register();



    public void sendConfirmationEmail(){
        System.out.println("Confirmation email sent");
    }

    public void handleError(){
        System.out.println("Validation failed");
    }

}
