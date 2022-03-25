package com.company;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên của bạn :");
        String t=scanner.nextLine();
        System.out.println("nhập tuổi của bạn :");
        int tu=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính của bạn :");
        String gi=scanner.nextLine();
        System.out.println("Nhập địa chỉ của bạn :");
        String đ=scanner.nextLine();
        System.out.println("Bạn tên là : "+t+", bạn "+tu+" tuổi "+" ,bạn là "+gi+" ,bạn đến từ "+đ);
    }
}
