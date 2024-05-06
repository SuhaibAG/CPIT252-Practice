package Workshop;

public class Registrationtemplatedemo {
    public static void main(String[] args) {
        RegistrationProecessor workshopRegistration = new WorkshopRegistrationProcessor();
        RegistrationProecessor webinarRegistration = new WebinarRegistrationProcessor();


        workshopRegistration.register();
        webinarRegistration.register();
        }
    }

