package studentService;

import com.company.Student;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StudentService implements StService {
ArrayList<Student> list=new ArrayList<>();
Scanner scanner=new Scanner(System.in);

    public void service(){
        list.add(new Student(123,"B",15,"Ha Noi",9.1,"10A"));
        list.add(new Student(133,"A",14,"Hai Phong",8.9,"9B"));
        list.add(new Student(128,"E",15,"Bac Giang",8.1,"10A"));
        list.add(new Student(183,"D",13,"Hai Duong",8.6,"9B"));
        list.add(new Student(183,"C",14,"Hai Duong",8.6,"9C"));
        String choice;
        do{
            display();
            System.out.println("Enter your choice: ");
             choice=scanner.nextLine();
            switch(choice){
                case "1":showAll();
                break;
                case "2":addNew();
                    break;
                case "3":pointUpdate();
                    break;
                case "4":clear();
                    break;
                case "5":showWithClass();
                    break;
                case "6":sortAccordingToName();
                    break;
                case "7":sortAccordingToAge();
                    break;
                case "8":sortAccordingToPoint();
                    break;
                case "9":
                    System.out.println("you exited");
                    break;
              
                default:
                    System.out.println("Enter again");

            }
        }while(!choice.equals("9"));

    }

    @Override
    public void showAll() {


        for(Student i: list){
            System.out.println(i.toString());
        }
        System.out.println("<=================================================================>");

    }

    @Override
    public Student addNew() {
        Student s=new Student();
        System.out.println("Enter id: ");
        s.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter name: ");
        s.setName(scanner.nextLine());
        System.out.println("enter age: ");
        s.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter address: ");
        s.setAddress(scanner.nextLine());
        System.out.println("Enter point");
        s.setPoint(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("Enter classRoom");
        s.setClassRoom(scanner.nextLine());
        list.add(s);

        return s;
    }

    @Override
    public void pointUpdate() {
        System.out.println("Enter the student's id that you want to update the point: ");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new point: ");
        double newPoint= scanner.nextDouble();
        for(Student i: list){
            if(i.getId()==id){
                i.setPoint(newPoint);
            }
        }
        System.out.println("the list after updating: ");
        for(Student i: list){
            System.out.println(i.toString());
        }
        System.out.println("<=================================================================>");
    }

    @Override
    public void clear() {
        System.out.println("Enter the student's id that you want to remove: ");
        int id=scanner.nextInt();
        scanner.nextLine();

        //list.removeIf(i -> i.getId() == id);
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i);
            }
        }

        System.out.println("the list after removing : ");
        for(Student i: list){
            System.out.println(i.toString());
        }
        System.out.println("<=================================================================>");
    }

    @Override
    public void showWithClass() {
        System.out.println("the students of class 10A: ");
        for(Student i: list){
            if(i.getClassRoom().equals("10A")){
                System.out.println(i.toString());
            }
        }
        System.out.println("the students of class 9B: ");
        for(Student i: list){
            if(i.getClassRoom().equals("9B")){
                System.out.println(i.toString());
            }
        }
        System.out.println("the students of class 9C: ");
        for(Student i: list){
            if(i.getClassRoom().equals("9C")){
                System.out.println(i.toString());
            }
        }

    }

    @Override
    public void sortAccordingToName() {
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//        for(Student i: list){
//            System.out.println(i.toString());
//        }
        List<Student> newS2=list.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        newS2.forEach(System.out::println);
        System.out.println("<=================================================================>");
    }

    @Override
    public void sortAccordingToAge() {
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        for(Student i: list){
//            System.out.println(i.toString());
//        }
        List<Student> newS=  list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());
        newS.forEach(System.out::println);
        System.out.println("<=================================================================>");
    }

    @Override
    public void sortAccordingToPoint() {
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.getPoint()<o2.getPoint())
//                    return -1;
//                if(o1.getPoint()>o2.getPoint())
//                return 1;
//
//                return 0;
//            }
//        });
//        for(Student i: list){
//            System.out.println(i.toString());
//        }
        List<Student> newS1=list.stream().sorted(Comparator.comparing(Student::getPoint)).collect(Collectors.toList());
        newS1.forEach(System.out::println);
        System.out.println("<=================================================================>");

    }

    @Override
    public void display() {
        System.out.println("1.Xem danh sách học sinh");
        System.out.println("2.Thêm học sinh mới");
        System.out.println("3.Cập nhập điểm học sinh");
        System.out.println("4.Xóa học sinh");
        System.out.println("5.Xem danh sách học sinh theo lớp");
        System.out.println("6.Sắp xếp theo tên");
        System.out.println("7.Sắp xếp theo tuổi");
        System.out.println("8.Sắp xếp theo điểm");
        System.out.println("9.thoat");
    }

}
