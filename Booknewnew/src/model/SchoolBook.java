package model;

public class SchoolBook extends Library {
    int sotrang;
    int tinhtrang;
    int soluongmuon;

    public SchoolBook(int masach, String tensach, String nhaxuatban, String namxuatban, int soluong, int sotrang, int tinhtrang, int soluongmuon) {
        super(masach, tensach, nhaxuatban, namxuatban, soluong);
        this.sotrang = sotrang;
        this.tinhtrang = tinhtrang;
        this.soluongmuon = soluongmuon;
    }

    public SchoolBook() {}

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }

    public int getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getSoluongmuon() {
        return soluongmuon;
    }

    public void setSoluongmuon(int soluongmuon) {
        this.soluongmuon = soluongmuon;
    }
}
