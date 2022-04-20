package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BMI {

    public float bmiCalculator {
        System.out.println("Nhập chiều cao: ");
        float height = input();
        System.out.println("Nhập cân năng: ");
        float weight = input();
        float bmi = weight/(height*height);

        return bmi;
    }

    public float input(){
        Scanner sc = new Scanner(System.in);
        float number = 0;
        boolean flag = true;
        while (flag){
            try {
                number = Float.parseFloat(sc.nextLine());
                if(number<=0) throw new ArithmeticException("du lieu ban nhap phai lon hon 0");
                flag = false;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai dữ liệu, vui long nhập lại: ");
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
                System.out.println("vui long nhap lai ");
            }
        }
        try {
            FileReader reader=new FileReader("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return number;
    }
}
