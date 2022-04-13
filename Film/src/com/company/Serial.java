package com.company;

public class Serial extends Film {
    public Serial(int id, String title, String type, String director, String publicationDate, int theNumberOfEpisodes, double averageDuration) {
        super(id, title, type, director, publicationDate);
        this.theNumberOfEpisodes = theNumberOfEpisodes;
        this.averageDuration = averageDuration;
    }

    public int getTheNumberOfEpisodes() {
        return theNumberOfEpisodes;
    }

    public void setTheNumberOfEpisodes(int theNumberOfEpisodes) {
        this.theNumberOfEpisodes = theNumberOfEpisodes;
    }

    public double getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(double averageDuration) {
        this.averageDuration = averageDuration;
    }

    public Serial() {

    }

    int theNumberOfEpisodes;
    double averageDuration;

}
