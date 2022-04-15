package com.company;

public class Product {
   private int id;
    private String tenSanPham;
    private String moTa;
    private int soLuong;
    private  double gia;
    private String donViTinh;

    public Product(int id, String tenSanPham, String moTa, int soLuong, double gia, String donViTinh) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.gia = gia;
        this.donViTinh = donViTinh;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                ", donViTinh='" + donViTinh + '\'' +
                '}';
    }
}
