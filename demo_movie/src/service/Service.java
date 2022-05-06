package service;

import com.company.Father;
import com.company.Movie;
import com.company.Serial;
import com.company.State;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Service implements Interface{
ArrayList<Father> list=new ArrayList<Father>();
ArrayList<Serial> list1=new ArrayList<>();
String choice;
Scanner scanner=new Scanner(System.in);
    @Override
    public void service() {
            list.add(new Movie(123,"Spider man 1","spider-man-1",
                    "good", new ArrayList<>(Arrays.asList("Action", "fiction")),1000000, LocalDate.of(2002,5,3),120));
        list.add(new Movie(183,"Iron Man 1","iron-man-1",
                " quite good",new ArrayList<>(Arrays.asList("Action", "fiction")),3000000,LocalDate.of(2008,5,16),130));
        list.add(new Movie(163,"Candyman","candyman",
                " ok",new ArrayList<>(Arrays.asList("Horror", "fiction")),900000,LocalDate.of(2021,8,27),118));
        list.add(new Movie(465,"Hotel Transylvania: Transformania","hotel-transylvania-transformania",
                " amazing",new ArrayList<>(Arrays.asList("fiction","Animation","Comedy")) ,4000000,LocalDate.of(2022,1,14),117));
        list.add(new Serial(111,"the wheel of time","the-wheel-of-time",
                " quite ok",new ArrayList<>(Arrays.asList("fiction","Adventure")) ,950000,LocalDate.of(2021,11,19),8, State.UNFINISHED));
        list.add(new Serial(131,"Harry Potter","harry-potter",
                " really good",new ArrayList<>(Arrays.asList("Action","fiction","Adventure")),10000000,LocalDate.of(2001,11,14),8, State.FINISHED));
        list.add(new Serial(231,"Teen Wolf","teen-wolf",
                " watchable",new ArrayList<>(Arrays.asList("Action","fiction","Adventure","Horror")) ,2000000,LocalDate.of(2011,5,6),100, State.FINISHED));
            list1.add((Serial) list.get(4));
        list1.add((Serial) list.get(5));
        list1.add((Serial) list.get(6));

        do{
            display();
                System.out.println("Enter your choice: ");
                choice= scanner.nextLine();
                switch(choice){
                    case "1": show(list);break;
                    case "2":findName(list);break;
                    case "3":findType(list);break;
                    case "4":listMovie(list);break;
                    case "5":listState(list1);break;
                    case "6": listMovieThisYear(list);break;
                    case "7":findSpecialType(list);break;
                    case "8":
                        System.out.println("Exit");break;
                    default:
                        System.out.println("Invalid input");
                }
            }while(!choice.equals("7"));


    }

    @Override
    public void show(ArrayList<Father> list) {
        list.stream().sorted((o1,o2)->{
            if (o1.getPublishDate().isBefore(o2.getPublishDate())) {
                return 1;
            }
            return -1;}).forEach(i-> System.out.println(i.toString()));
    }

    @Override
    public void findName(ArrayList<Father> list) {
        System.out.println("Nhập tên bạn muốn tìm :");
        String ten= scanner.nextLine();
        boolean t=true;
        for(int i=0;i<list.size();i++){
            for(int j=0;j<=list.size();j++){
                for(int k=j+1;k<=list.size();k++){
                    if(list.get(i).getName().substring(j,k).equalsIgnoreCase(ten)){
                        System.out.println(list.get(i).toString());
                        t=false;
                    }
                }
                if(t==false) break;
            }

        }
    }

    @Override
    public void findType(ArrayList<Father> list) {
        System.out.println("Nhập loại phim bạn muốn tìm :");
        String ten= scanner.nextLine();

        ArrayList<Father> ok1=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            for(int l=0;l<list.get(i).getType().size();l++){
                 for(int j=0;j<=list.get(i).getType().get(l).length();j++){
                        for(int k=j+1;k<=list.get(i).getType().get(l).length();k++){
                        if(list.get(i).getType().get(l).substring(j,k).equalsIgnoreCase(ten)){
                            if(!ok1.contains(list.get(i))){
                                ok1.add(list.get(i));
                            }}}}}}
        ok1.stream().forEach(i-> System.out.println(i.toString()));
    }

    @Override
    public void listMovie(ArrayList<Father> list) {
        list.stream().sorted((o1,o2)->{
            if(o1.getView()>o2.getView())
            return -1 ;
            return 1;

        }).limit(3).forEach(i-> System.out.println(i.toString()));
    }

    public void listState(ArrayList<Serial> list1) {
        list1.stream().filter(i->i.getState()==State.FINISHED).forEach(i-> System.out.println(i.toString()));
    }

    @Override
    public void listMovieThisYear(ArrayList<Father> list) {
        list.stream().filter(i->i.getPublishDate().getYear()==LocalDate.now().getYear()).forEach(i-> System.out.println(i.toString()));
    }

    @Override
    public void findSpecialType(ArrayList<Father> list) {
        System.out.println("Nhập thể loại phim thứ nhất bạn muốn tìm :");
        String t1= scanner.nextLine();
        System.out.println("Nhập thể loại phim thứ hai bạn muốn tìm :");
        String t2= scanner.nextLine();
        ArrayList<Father> nk1=new ArrayList<>();
        ArrayList<Father> nk2=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            for(int l=0;l<list.get(i).getType().size();l++){
                for(int j=0;j<=list.get(i).getType().get(l).length();j++){
                    for(int k=j+1;k<=list.get(i).getType().get(l).length();k++){
                        if(list.get(i).getType().get(l).substring(j,k).equalsIgnoreCase(t1)){
                        if(!nk1.contains(list.get(i))){
                            nk1.add(list.get(i));
                        }
                    }
                }
            }
        }}
        for(int i=0;i<list.size();i++){
            for(int l=0;l<list.get(i).getType().size();l++){
                for(int j=0;j<=list.get(i).getType().get(l).length();j++){
                    for(int k=j+1;k<=list.get(i).getType().get(l).length();k++){
                        if(list.get(i).getType().get(l).substring(j,k).equalsIgnoreCase(t2)){
                            if(!nk2.contains(list.get(i))){
                                nk2.add(list.get(i));
                            }}}}}}
        int count=0;

        for(int i=0;i<nk1.size();i++){
            for(int j=i+1;j<nk2.size();j++){
                if(nk1.get(i).getId()==nk2.get(j).getId()){
                    System.out.println(nk1.get(i).toString());
                    count++;
                }
            }
        }
        if(count==0) System.out.println("Không có phim cùng hai thể loại trên");
    }


    @Override
    public void display() {
        System.out.println("1.xem danh sách tất cả các phim(xem danh sách theo ngày công chiếu)");
        System.out.println("2.tìm phim theo tên");
        System.out.println("3.Tìm phim theo thể loại");
        System.out.println("4.Liệt kê ba bộ phim được xem nhiều nhất");
        System.out.println("5.Liệt kê các phim thuộc serial đã hoàn thành");
        System.out.println("6.Liệt kê các phim được công chiếu trong năm nay");
        System.out.println("7.Tìm phim theo thể loại (từ 2 thể loại trở lên)");
        System.out.println("8.Thoát");
    }
}
