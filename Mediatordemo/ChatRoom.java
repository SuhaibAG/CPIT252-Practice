package Mediatordemo;

import java.util.Date;

public class ChatRoom {
    public static void ShowMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "]: " + message);
    }
}
