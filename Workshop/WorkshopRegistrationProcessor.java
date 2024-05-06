package Workshop;

import Templatev2.RegistrationProcessor;

public class WorkshopRegistrationProcessor extends RegistrationProecessor {
    @Override
    public void CollectData(){
        System.out.println("collect data from workshop registraion");
    }
    @Override
    public boolean validateData(){
        System.out.println("validating data");
        return true;
    }
    @Override
    public void register(){
        System.out.println("registering user for the workshop");
    }

}
