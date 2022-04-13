package service;

import com.company.Movie;
import com.company.Serial;

import java.util.ArrayList;
import java.util.Scanner;

public class SerialService {
    Scanner scanner=new Scanner(System.in);
    public Serial createSerial(){
        Serial m=new Serial();

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
        System.out.println("Enter the AverageDuration: ");
        m.setAverageDuration(scanner.nextDouble());
        System.out.println("Enter the Number Of Episodes: ");
        m.setTheNumberOfEpisodes(scanner.nextInt());
        scanner.nextLine();
        return m;
    }

    public String toString(Serial m) {
        return "Film{" +
                "id:" + m.getId() +
                ", title:'" + m.getTitle() + '\'' +
                ", type:'" + m.getType() + '\'' +
                ", director:'" + m.getDirector() + '\'' +
                ", publicationDate:'" + m.getPublicationDate() + '\'' +"AverageDuration:" + m.getAverageDuration()+'\''+
                "TheNumberOfEpisodes:" + m.getTheNumberOfEpisodes()+'\''+
                '}';
    }
    public ArrayList<Serial> createArr(Serial...m){
        ArrayList<Serial> marr=new  ArrayList<Serial>();
        for(Serial i: m){
            marr.add(i);
        }
        return marr;
    }

    public void findFilmAccordingToTheTitle(ArrayList<Serial> marr){
        int counter=0;
        for(Serial i :marr){
            System.out.println("Enter your choice");
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
