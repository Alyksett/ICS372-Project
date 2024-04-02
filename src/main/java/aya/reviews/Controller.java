package aya.reviews;

public class Controller {
    public static void onLoginAttempt(String user, String password){
        System.out.println("Attempted Login");
        System.out.println(user);
        System.out.println(password);
    }
    public static void onRegisterAttempt(String user, String password){
        System.out.println("Attempted Register");
        System.out.println(user);
        System.out.println(password);
    }
}
