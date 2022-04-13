package model;

public class Library {
    int masach;
    String tensach;
    String nhaxuatban;
    String namxuatban;
    int soluong;

    public Library(int masach, String tensach, String nhaxuatban, String namxuatban, int soluong) {
        this.masach = masach;
        this.tensach = tensach;
        this.nhaxuatban = nhaxuatban;
        this.namxuatban = namxuatban;
        this.soluong = soluong;
    }

    public Library() {
    }

    public int getMasach() {
        return masach;
    }

    public void setMasach(int masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(String namxuatban) {
        this.namxuatban = namxuatban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
