package service;

import com.company.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieService {
    Scanner scanner=new Scanner(System.in);
    public Movie createMovie(){
        Movie m=new Movie();

        System.out.println("Enter the id : ");
        m.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter the title: ");
        m.setTitle(scanner.nextLine());
        System.out.println("Enter the type: ");
        m.setType(scanner.nextLine());
        System.out.println("Enter the director's name: ");
        m.setDirector(scanner.nextLine());
        System.out.println("Enter the publicationDate: ");
        m.setPublicationDate(scanner.nextLine());
        System.out.println("Enter the duration: ");
        m.setDuration(scanner.nextDouble());
        scanner.nextLine();
        return m;
    }

    public String toString(Movie m) {
        return "Film{" +
                "id:" + m.getId() +
                ", title:'" + m.getTitle() + '\'' +
                ", type:'" + m.getType() + '\'' +
                ", director:'" + m.getDirector() + '\'' +
                ", publicationDate:'" + m.getPublicationDate() + '\'' +"duration:" + m.getDuration()+'\''+
                '}';
    }
    public ArrayList<Movie> createArr(Movie...m){
        ArrayList<Movie> marr=new  ArrayList<Movie>();
            for(Movie i: m){
                marr.add(i);
            }
        return marr;
    }

    public void findFilmAccordingToTheTitle(ArrayList<Movie> marr){
        int counter=0;
        System.out.println("Enter the title: ");
        for(Movie i :marr){

            String yourChoice=scanner.nextLine();
            if(i.getTitle().equalsIgnoreCase(yourChoice)){
                System.out.println(toString(i));
                counter++;
            }
        }
        if(counter==0){
            System.out.println("there is no film with that title");
        }
    }
}
