package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Queue<Integer> linkedList=new LinkedList<>();
//        linkedList.add(3);
//        linkedList.add(1);
//        linkedList.add(9);
//        linkedList.offer(9);
//        linkedList.offer(6);
//        linkedList.offer(4);
//        System.out.println(linkedList);
//
//        linkedList.remove();
//        System.out.println(linkedList);
//        Queue<Integer> priorityQueue=new PriorityQueue<>();
//        priorityQueue.add(4);
//        priorityQueue.add(5);
//        priorityQueue.add(1);
//        priorityQueue.add(9);
//        priorityQueue.add(2);
//
//        System.out.println(priorityQueue);
//        HashSet<Integer> hashSet=new HashSet<>();
//        hashSet.add(5);
//        hashSet.add(7);
//        hashSet.add(6);
//        hashSet.add(1);
//        hashSet.add(9);
//        hashSet.add(5);
//        System.out.println(hashSet);
//
//        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
//        linkedHashSet.add(5);
//        linkedHashSet.add(1);
//        linkedHashSet.add(4);
//        linkedHashSet.add(8);
//        linkedHashSet.add(7);
//        linkedHashSet.add(5);
//        System.out.println(linkedHashSet);
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(1,"ngoc");
        hashMap.put(2,"Tung");
        hashMap.put(3,"Linh");
        hashMap.put(4,"Anh");
        hashMap.put(5,"Hoa");

        System.out.println(hashMap);
        hashMap.put(3,"QUan");
        System.out.println(hashMap);
        System.out.println(hashMap.get(1));

        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}