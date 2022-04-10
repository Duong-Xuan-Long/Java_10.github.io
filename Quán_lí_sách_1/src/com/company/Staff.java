package com.company;

public class Staff {
    public String id;
    public String name;
    public String birth;
    public int phoneNumber;
    public String genderr;
    public String email;
    public String address;

    public Staff(String id, String name, String birth, int phoneNumber, String genderr, String email, String address) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.genderr = genderr;
        this.email = email;
        this.address = address;

    }


    @Override
    public String toString() {
        return "Staff : " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", genderr='" + genderr + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ' ';
    }
}
