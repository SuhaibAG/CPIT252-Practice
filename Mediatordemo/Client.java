package Mediatordemo;

public class Client {
    public static void main(String[] args) {
        User yahya = new User("Yahya");
        User burhan = new User("Burhan");

        yahya.sendMessage("Hi Burhan");
        burhan.sendMessage("Hello! Yahya");
    }
}
