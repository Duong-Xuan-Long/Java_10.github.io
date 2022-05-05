package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamAPIExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.print(i + "\t"));
        System.out.println("danh sach so chan");
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + "\t"));
        long count = list.stream().filter(i -> i % 2 == 0).count();
        System.out.println();
        System.out.println("so phan tu chan la " + count);
        Integer max = list.stream().max(Integer::compareTo).get();
        System.out.println("phan tu lon nhat: " + max);
        //Integer max=list.stream().max(Comparator).get();
        list.add(1);
        list.add(1);
        list.add(5);
        list.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        list.stream().distinct().forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        list.stream().map(i -> i * 10).forEach(i -> System.out.print(i + "\t"));
        list.stream().sorted().forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        list.stream().skip(3).limit(5).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        list.removeIf(i->i%2==0);
        list.forEach(i -> System.out.print(i + "\t"));
    }
}
