package com.company;

import service.MovieService;
import service.SerialService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MovieService ms=new MovieService();
        SerialService ss=new SerialService();

       Movie m1= ms.createMovie();
       Movie m2=ms.createMovie();
       ArrayList<Movie> arr =ms.createArr(m1,m2);
       ms.findFilmAccordingToTheTitle(arr);

       Serial s1=ss.createSerial();
       Serial s2=ss.createSerial();
       ArrayList<Serial> sarr =ss.createArr(s1,s2);
        ss.findFilmAccordingToTheTitle(sarr);

    }
}
