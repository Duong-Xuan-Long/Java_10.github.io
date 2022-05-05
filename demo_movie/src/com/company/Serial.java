package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Serial extends Father{
    int thenumberOfEpisodes;
    State state;

    public Serial(int id, String name, String slug, String description, ArrayList<String> type, long view, LocalDate publishDate, int thenumberOfEpisodes, State state) {
        super(id, name, slug, description, type, view, publishDate);
        this.thenumberOfEpisodes = thenumberOfEpisodes;
        this.state = state;
    }

    public int getThenumberOfEpisodes() {
        return thenumberOfEpisodes;
    }

    public void setThenumberOfEpisodes(int thenumberOfEpisodes) {
        this.thenumberOfEpisodes = thenumberOfEpisodes;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", view=" + view +
                ", publishDate=" +Datee.changeDate(publishDate) +
                ", thenumberOfEpisodes=" + thenumberOfEpisodes +
                ", state=" + state +
                '}';
    }
}
