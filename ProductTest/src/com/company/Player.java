package com.company;

public class Player {
    int shirtNumber;
    String full_name;
    Position position;

    public Player(int shirtNumber, String full_name, Position position) {
        this.shirtNumber = shirtNumber;
        this.full_name = full_name;
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "shirtNumber=" + shirtNumber +
                ", full_name='" + full_name + '\'' +
                ", position=" + position +
                '}';
    }
}
