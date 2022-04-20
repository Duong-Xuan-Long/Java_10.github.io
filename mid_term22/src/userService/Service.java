package userService;

import com.company.User;

public interface Service {
    public void signIn();
    public void signInAgain();
    public void fogotPassWord();
    public void changeUserName(String usi);
    public void changeEmail(String usi);
    public void changePassWord(String usi);
    public void logOut();
    public User signUp();
    public void display1();
    public void display2();
    public void display3();

}
