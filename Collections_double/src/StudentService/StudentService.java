package StudentService;

import com.company.Student;

import java.util.*;

public class StudentService {
    ArrayList<Student> list=new ArrayList<>();

    public ArrayList<Student> add(){
        list.add(new Student(123,"Linh","10A",8.9));
        list.add(new Student(124,"Lin","10A",8.2));
        list.add(new Student(126,"Dinh","11A",8.3));
        list.add(new Student(129,"Cinh","11A",8.4));
        list.add(new Student(256,"Finh","12A",9));
        return list;
    }
    public void compareGrades(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getGrades()>o2.getGrades())?1:-1;
            }
        });
        for(Student s:list){
            System.out.println(s.toString());
        }
    }
    public  void sortS(){
        Map<String,Integer> map=new HashMap<>();
        for(Student s:list){
            if(map.containsKey(s.getClassRoom())){
                map.put(s.getClassRoom(),map.get(s.getClassRoom())+1);
            }
            else{
                map.put(s.getClassRoom(),1);
            }
        }
        System.out.println(map);
    }

}
