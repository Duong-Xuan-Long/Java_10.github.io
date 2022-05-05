package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Movie extends Father {
    int durationByMinute;

    public Movie(int id, String name, String slug, String description, ArrayList<String> type, long view, LocalDate publishDate, int durationByMinute) {
        super(id, name, slug, description, type, view, publishDate);
        this.durationByMinute = durationByMinute;
    }

    public int getDurationByMinute() {
        return durationByMinute;
    }

    public void setDurationByMinute(int durationByMinute) {
        this.durationByMinute = durationByMinute;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", view=" + view +
                ", publishDate=" + Datee.changeDate(publishDate) +
                ", durationByMinute=" + durationByMinute +
                '}';
    }
}
