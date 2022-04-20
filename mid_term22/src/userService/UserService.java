package userService;

import com.company.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService implements Service{
    Scanner scanner=new Scanner(System.in);
    ArrayList<User> list=new ArrayList<User>();
    String choice;
    public void service(){
        list.add(new User("user_1","user1@gmail.com","USER1-11"));
        list.add(new User("user_2","user2@gmail.com","USER2-22"));

        boolean flag=true;
        do{
            display1();
            System.out.println("Nhập lựa chọn bạn muốn: ");
            choice=scanner.nextLine();
            switch (choice){
                case "1" :
                            signIn();
                    break;
                case"2"  :signUp()
                //flag=false;
                ;break;
                default:
                    System.out.println("Không hợp lệ, yêu cầu nhập lại !");
            }
        }while(flag);
        //(!choice.equals("1"))||(!choice.equals("2"))
    }

    @Override
    public void signIn() {
       boolean count3=false;

       boolean count4=false;
        String usi;
        do{
            if(count3=true){
                count3=false;
            }
            System.out.println("Nhập tên đăng nhập(UserName)");
            usi=scanner.nextLine();
            for(User i:list){
                if(i.getUserName().equals(usi)){
                    count3=true;
                }

            }
            if(count3==false){
                System.out.println("Kiểm tra lại username");
            }

        }while (count3==false);
        System.out.println("Nhập mật khẩu của bạn: ");
        String mk= scanner.nextLine();
        if(count4==true){
            count4=false;
        }
        for(User i:list){
            if(i.getPassWord().equals(mk)){
             count4=true;
        }
        }

        if(count4==true){
            String choice2;
            do{
                display2();
                System.out.println("Nhập lựa chọn của bạn ");
                choice2= scanner.nextLine();
                switch (choice2){
                    case "1":
                        changeUserName(usi);
                        break;
                    case "2":
                        changeEmail(usi);
                        break;
                    case "3":
                        changePassWord(usi);
                        break;
                    case "4":
                        logOut();
                        break;
                    case "0":
                        System.out.println("thoát!");
                        System.exit(0);
                        
                        break;
                    default:
                        System.out.println("Nhập lại");
                }
            }while(!choice2.equals("0"));
        }
        if(count4==false){
            boolean f=true;
            String choice3;
            do{
                display3();
                System.out.println("Nhập lựa chọn của bạn");
                choice3= scanner.nextLine();
                switch(choice3){
                    case "1":
                        signInAgain();
                        f=false;
                        break;
                    case "2":
                        fogotPassWord();
                        break;
                }
            }while(f);
        }
    }

    @Override
    public void signInAgain() {
            service();
    }

    @Override
    public void fogotPassWord() {
        System.out.println("Nhập email của bạn:  ");
        String e2=scanner.nextLine();
        boolean k=false;
        for(User i:list){
            if(i.getEmail().equals(e2)){
                changePassWord(i.getUserName());
                k=true;
            }
        }
        if(k=false){
            System.out.println("Không có tài khoản có email này");
        }
    }

    @Override
    public void changeUserName(String usi) {
        boolean count5=false;
        String u;
        do{
            System.out.println("Nhập tên đăng nhập bạn muốn đổi (UserName): ");
            u=scanner.nextLine();
            if(count5==true){
                count5=false;
            }
            for(User i:list) {
                if(i.getUserName().equals(u)){
                    System.out.println("Trùng tên username,yêu cầu nhập lại! ");
                }
                else{
                    count5=true;
                }
            }

        }while(count5==false);
        for(User i:list) {
            if(i.getUserName().equals(usi)){
                i.setUserName(u);
                //System.out.println(i.toString());
            }

        }

    }

    @Override
    public void changeEmail(String usi) {
        boolean count6=false;
        String e1;
        Pattern pattern1;
        Matcher matcher1;
        boolean ee=true;
        do{
            System.out.println("Nhập email bạn muốn đổi (Email): ");
            e1=scanner.nextLine();
            if(count6==true){
                count6=false;
            }

            for(User i:list) {
                if(i.getEmail().equals(e1)){
                    System.out.println("Trùng tên username,yêu cầu nhập lại! ");
                }
                else{
                    count6=true;
                }
            }
            String regexEmail="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
            pattern1=Pattern.compile(regexEmail);
            matcher1=pattern1.matcher(e1);
            if(matcher1.find()){
                System.out.println("email hợp lệ");
            }
            else{
                System.out.println("email ko hợp lệ nhập lại !");
            }

        }while((count6==false)||(!matcher1.find()));
        for(User i:list) {
            if(i.getUserName().equals(usi)){
                i.setEmail(e1);
                //System.out.println(i.toString());
            }
        }
    }

    @Override
    public void changePassWord(String usi) {
        String pw;
        Pattern pattern2;
        Matcher matcher2;
        do{
            System.out.println("Nhập mật khẩu bạn muốn(Mật khẩu dài từ 7 " +
                    "đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ )");
            pw= scanner.nextLine();

            String regexPassWord="^(?=.*[A-Z])(?=.*[\\(\\.\\,\\-\\_]).{7,15}$";
            pattern2=Pattern.compile(regexPassWord);
            matcher2=pattern2.matcher(pw);
            if(matcher2.find()){
                System.out.println(pw+" đạt yêu cầu");
            }
            else{
                System.out.println("Mật khẩu ko đạt tiêu chuẩn nhập lại : ");
            }
        }while(!matcher2.find());
        for(User i:list) {
            if(i.getUserName().equals(usi)){
                i.setPassWord(pw);
                //System.out.println(i.toString());
            }
        }
    }

    @Override
    public void logOut() {
        service();
    }

    @Override
    public User signUp() {
        User uNew=new User();
        System.out.println("Đăng kí");
        boolean count=false;
        String u;
        do{
            System.out.println("Nhập tên đăng nhập bạn muốn (UserName): ");
            u=scanner.nextLine();
            if(count==true){
                count=false;
            }
            for(User i:list) {
                if(i.getUserName().equals(u)){
                    System.out.println("Trùng tên username,yêu cầu nhập lại! ");
                    ;
                }
                else{
                    count=true;
                }
            }

        }while(count==false);
        uNew.setUserName(u);
        //password
        String pw;
        boolean p=true;
        Pattern pattern2;
        Matcher matcher2;
        do{
            System.out.println("Nhập mật khẩu bạn muốn(Mật khẩu dài từ 7 " +
                    "đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ )");
           pw= scanner.nextLine();
           uNew.setPassWord(pw);
            String regexPassWord="^(?=.*[A-Z])(?=.*[\\(\\.\\,\\-\\_]).{7,15}$";
            pattern2=Pattern.compile(regexPassWord);
            matcher2=pattern2.matcher(pw);
            if(matcher2.find()){
                System.out.println(pw+" đạt yêu cầu");
                p=false;
            }
            else{
                System.out.println("Mật khẩu ko đạt tiêu chuẩn nhập lại : ");
            }
        }while(p==true);
        uNew.setPassWord(pw);
                //email
        Pattern pattern;
        Matcher matcher;
        boolean count1=false;
        //boolean ee=true;
        String e;
        do{
            System.out.println("Nhập email bạn muốn (Email): ");
             e=scanner.nextLine();
            if(count1==true){
                count1=false;
            }
            for(User i:list) {
                if(i.getEmail().equals(e)){
                    System.out.println("Trùng tên email,yêu cầu nhập lại! ");
                }
                else{
                    count1=true;
                }
            }
            String regexEmail="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
            pattern=Pattern.compile(regexEmail);
            matcher=pattern.matcher(e);
//            if(ee==false){
//                ee=true;
//            }
            if(matcher.find()){
                System.out.println("email hợp lệ");
                //ee=false;
            }
            else{
                System.out.println("email ko hợp lệ nhập lại !");
            }

        }while((count1==false)||(!matcher.find()));
        uNew.setEmail(e);
        System.out.println("Đăng kí thành công !");
        list.add(uNew);
        return uNew;
    }

    @Override
    public void display1() {
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
    }

    @Override
    public void display2() {
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)");
        System.out.println(" 0 - Thoát chương trình");
    }

    @Override
    public void display3() {
        System.out.println(" 1 - Đăng nhập lại");
        System.out.println(" 2 - Quên mật khẩu");
    }
}
