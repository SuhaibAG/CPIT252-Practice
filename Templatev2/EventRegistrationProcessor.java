package Templatev2;

public class EventRegistrationProcessor extends RegistrationProcessor{
    @Override
    void collectData() {
        System.out.println("Collecting data");
    }

    @Override
    boolean validateData() {
        System.out.println("Validating Data");
        return true;
    }

    @Override
    void register() {
        System.out.println("Registering user for the event");
    }
}
