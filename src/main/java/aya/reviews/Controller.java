package aya.reviews;

public class Controller {
    public static boolean onLoginAttempt(String user, String password){
        System.out.println("Attempted Login");
        System.out.println(user);
        System.out.println(password);
        return isLoginValid(user, password);
    }
    public static boolean onRegisterAttempt(String user, String password){
        // if either the username exists, OR the login is already valid (identical user)
        // then return false. If neither of these, then create a new user
        // and return true;
        if (doesUsernameExist(user) || isLoginValid(user, password)){
            return false;
        }
        else{
            createNewUser(user, password);
            return true;
        }
    }

    private static User createNewUser(String username, String pass){
        User newUser = new User(username, pass);
        // add user to database here
        return newUser;
    }

    private static Boolean isLoginValid(String user, String pass){
        return true;
    }

    private boolean isRegisterValid(String user, String pass){
        return false;
    }

    private static boolean doesUsernameExist(String name){
        return false;
    }
}
