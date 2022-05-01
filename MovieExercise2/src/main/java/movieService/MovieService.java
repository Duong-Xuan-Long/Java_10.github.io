package movieService;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import main.Movie;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieService {

    Gson gson=new Gson();
        ArrayList<Movie> list=new ArrayList<>();

        FileReader fileReader;
            Scanner scanner=new Scanner(System.in);
    public void service(){

        try {
            fileReader = new FileReader("movie.json");
            Type type=new TypeToken<ArrayList<Movie>>(){}.getType();
            list=gson.fromJson(fileReader,type);
//            for(Movie m:list){
//                System.out.println(gson.toJson(m));
//            }
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);


//
//            for(Movie m:list){
//
//            }
            String choice;
            do{
                display();
                System.out.println("Nhập lựa chọn của bạn: ");
                choice=scanner.nextLine();
                switch(choice){
                    case "1":
                        System.out.println("Danh sách các bộ phim là: ");
                        for(Movie m:list){
                            simpleDateFormat.format(m.getRelease());
               System.out.println(gson.toJson(m));
                                   }
                        break;
                    case "2":
                        nameSort();
                        break;
                    case "3":
                        lengthSort();
                        break;
                    case "4":
                        viewSort();
                        break;
                    case "5":
                        count();
                        break;
                    case "6":
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("nhập lại");
                }
            }while(!choice.equals("6"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    public void display(){
        System.out.println("1. In thông tin các bộ phim ra màn hình");
        System.out.println("2. Sắp xếp phim theo tên");
        System.out.println("3. Sắp xếp phim theo thời lượng");
        System.out.println("4. Sắp xếp phim theo lượt xem");
        System.out.println("5. Đếm mỗi thể loại có bao nhiêu bộ phim");
        System.out.println("6. Exit");

    }
    public void nameSort(){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        System.out.println("Danh sách các bộ phim sau sắp xếp là: ");
        for(Movie m:list){
            System.out.println(gson.toJson(m));
        }
    }
    public void lengthSort(){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength()-o2.getLength();
            }
        });
        System.out.println("Danh sách các bộ phim sau sắp xếp là: ");
        for(Movie m:list){
            System.out.println(gson.toJson(m));
        }
    }
    public void viewSort(){
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                if(o1.getView()>o2.getView()) return 1;
                if(o1.getView()<o2.getView()) return -1;
                return 0;

            }
        });
        System.out.println("Danh sách các bộ phim sau sắp xếp là: ");
        for(Movie m:list){
            System.out.println(gson.toJson(m));
        }
    }
    public void count(){
        HashMap<String,Integer> map=new HashMap<>();
        for(Movie m:list){
            for(int i=0;i<m.getCategory().size();i++){
                if(map.containsKey(m.getCategory().get(i))){
                    map.put(m.getCategory().get(i),map.get(m.getCategory().get(i))+1);
                }
                else{
                    map.put(m.getCategory().get(i),1);
                }
            }

        }
        System.out.println(map);
    }
}
