package service;

import com.company.Father;
import com.company.Movie;
import com.company.Serial;

import java.util.ArrayList;

public interface Interface {
    void service();
     void show(ArrayList<Father> list);
    void findName(ArrayList<Father> list);
    void findType(ArrayList<Father> list);
    void listMovie(ArrayList<Father> list);
     void listState(ArrayList<Serial> list1);
    void listMovieThisYear(ArrayList<Father> list);
    void findSpecialType(ArrayList<Father> list);
    void display();

}
