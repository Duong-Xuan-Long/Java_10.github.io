package com.company;

public class Movie extends Film{
     double duration;

    public Movie(int id, String title, String type, String director, String publicationDate, double duration) {
        super(id, title, type, director, publicationDate);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Movie() {

    }

}
