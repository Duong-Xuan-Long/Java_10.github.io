package user;

import com.company.User;
import com.company.UserHistory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {
    ArrayList<User> list=new ArrayList<>();
ArrayList<UserHistory> list1=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public void service(){
        list.add(new User("user_1","123","12345678",200000));
        list.add(new User("user_2","234","89345678",30000));

        signIn(list);
    }

    public void signIn(ArrayList<User> list){
        boolean t=false;
        do{
            System.out.println("Nhập tên đăng nhập của bạn : ");
            String userName=scanner.nextLine();
            System.out.println("Nhập mật khẩu của bạn : ");
            String password=scanner.nextLine();
            t=false;
            for(User u:list){
                if(u.getUserName().equals(userName)&&u.getPassword().equals(password)){
                    System.out.println("Bạn đã đăng nhập thành công mời chọn các lựa chọn sau");
                    t=true;
                   pick(list,u);
                }

            }
            if(t==false){
                System.out.println("Đăng nhập không thành công đăng nhập lại: ");
            }
        }while(t==false);
    }
    public void pick(ArrayList<User> list,User u){
        String choice;
        do{
            display();
            System.out.println("Lựa chọn của bạn: ");
            choice=scanner.nextLine();
            switch(choice){
                case "1":
                    System.out.println("Số dư tài khoản của bạn là: "+u.getBalance());
                    break;
                case "2":
                    String stk;
                    boolean t=false;
                    do{
                        System.out.println("Nhập số tài khoản của bạn: ");
                         stk=scanner.nextLine();
                         if(stk.equals(u.getAccountNumber())){
                             t=true;
                         }
                         else{
                             System.out.println("Số tài khoản không khớp mời nhập lại");
                         }
                    }while(t==false);

                    boolean l=true;
                    String stk1=null;
                    String password_pattern = "^[0-9]{8,16}$";
                    Pattern pattern = Pattern.compile(password_pattern);
                    do{
                        System.out.println("nhập số tài khoản thụ hưởng: ");
                        stk1 = scanner.nextLine();
                        Matcher matcher = pattern.matcher(stk1);
                        if (matcher.find()) {
                            l =false;
                        }
                        else{
                            System.out.println("số tài khoản phải từ 8-16 kí tự");
                        }

                    } while(l==true);

                    long number;
                    boolean k=false;
                    do{
                        System.out.println("Nhập số tiền bạn muốn chuyển: ");
                        number=scanner.nextLong();
                        scanner.nextLine();
                        if(number>50000){
                            if((u.getBalance()-number)>50000){
                                k=true;
                            }
                            else{
                                System.out.println("tài khoản của bạn sau khi rút phải lớn hơn hoặc bằng 50000");
                            }
                        }
                        else{
                            System.out.println("Tài khoản của bạn không đủ để thực hiện dao dịch");
                        }

                    }while(k==false);
                    System.out.println("Nhập mô tả");
                    String d=scanner.nextLine();
                    list1.add(new UserHistory(u, LocalDate.now(),d,stk1,number));
                    break;
                case "3":
                        for(UserHistory uk:list1){
                            if(uk.getU()!=null){
                                if(uk.getU().getUserName().equals(u.getUserName())){
                                    System.out.println(uk.toString());
                                }
                            }
                            else{
                                System.out.println("Lịch sử trống ");
                            }

                        }
                    break;
                case "4":
                    System.out.println("thoát!");break;
                case "5":
                    service();break;
                default:
                    System.out.println("Nhập lại");
            }
        }while(!choice.equals("5"));
    }
    public void display(){
        System.out.println("1.Truy vấn số dư tài khoản");
        System.out.println("2.Chuyển tiền");
        System.out.println("3.Xem lịch sử giao dịch");
        System.out.println("4.Quay lại");
        System.out.println("5.Thoát");

    }
}
