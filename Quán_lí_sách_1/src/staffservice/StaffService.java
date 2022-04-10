package staffservice;

import com.company.Gender;
import com.company.Staff;

import java.util.Scanner;

public class StaffService {
    Gender gender1 = Gender.MALE;
    Gender gender2 = Gender.FEMALE;
    Staff staff1 = new Staff("NV01", "Nguyễn Thị Lan", "03/05/1992", 12345678,
            gender2.name(), "lan@gmail.com", "Hà Nội");
    Staff staff2 = new Staff("NV02", "Nguyễn Văn Linh", "08/02/1994", 3598797,
            gender1.name(), "linh@gmail.com", "Hà Nam");
    Staff staff3 = new Staff("NV03", "Trần Chung Đức", "06/08/1996", 4565454,
            gender1.name(), "duc@gmail.com", "Hà Nội");
    Staff staff4 = new Staff("NV04", "Lê Thị Lan", "07/02/1999", 3787878,
            gender2.name(), "lanthi@gmail.com", "Hà Tĩnh");
    Staff staff5 = new Staff("NV05", "Trần VĂn Bắc", "05/01/1999", 7879468,
            gender1.name(), "bac@gmail.com", "Hải Dương");
    Staff[] staff = new Staff[5];
    Scanner scanner = new Scanner(System.in);
public void service() {
    staff[0] = staff1;
    staff[1] = staff2;
    staff[2] = staff3;
    staff[3] = staff4;
    staff[4] = staff5;
    String choose;
    do {
        display();
        System.out.println("Nhập lựa chọn của bạn : ");

        choose = " ";
        choose = scanner.nextLine();
//                    scanner.nextLine();

        switch (choose) {
            case "1":
                findStaff();
                break;
            case "2":
                findName();
                break;
            case "3":
                listStaff();
                break;
            case "4":
                findAddress();
                break;
            case "5":
                System.out.println("Exit! ");
                break;
            default:
                System.out.println("Chon lại số");
        }

    } while (!choose.equalsIgnoreCase("5"));

}
public static void display(){
        System.out.println("1.Tìm nhân viên theo id");
        System.out.println("2.Tìm nhân viên theo tên");
        System.out.println("3.Liệt kê nhân viên theo giới tính");
        System.out.println("4.Tìm các nhân viên có địa chỉ ở Hà Nội");
        System.out.println("5.Exit");
    }

public void findStaff(){
    System.out.println("Nhập id nhân viên muốn tìm : ");
    String id = scanner.nextLine();
    for (Staff i : staff) {
        if (id.equals(i.id)) {
            System.out.println(i.toString());
        }
    }
}
public void findName(){
    System.out.println("Nhập tên nhân viên muốn tìm : ");
    String ten = scanner.nextLine();
    for (Staff i : staff) {
        if (ten.equalsIgnoreCase(i.name)) {
            System.out.println(i.toString());
        }
    }
}
public void listStaff(){
    System.out.println("Nhân viên nam: ");
    for (Staff i : staff) {
        if (i.genderr == "MALE") {

            System.out.println(i.toString());
        }
    }
    System.out.println("Nhân viên nữ: ");
    for (Staff i : staff) {
        if (i.genderr == "FEMALE") {

            System.out.println(i.toString());
        }
    }
}
public void findAddress(){
    for (Staff i : staff) {
        if (i.address.equalsIgnoreCase("Hà Nội")) {
            System.out.println("Các nhân viên ở Hà Nội là :");
            System.out.println(i.toString());
        }
    }
}
    }

