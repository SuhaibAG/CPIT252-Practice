package Workshop;

public class WebinarRegistrationProcessor extends RegistrationProecessor{
    @Override
    public void CollectData() {
        System.out.println("Collecting data for the webinar registration");
    }

    @Override
    public boolean validateData() {
        System.out.println("Validating webinar registration data");
        return true;
    }

    @Override
    public void register() {
        System.out.println("Registering user for the webinar");
    }
}
