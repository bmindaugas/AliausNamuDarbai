package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<10; i++){
            a.add((int)(Math.random()*10));
        }
        System.out.println(a);
        a.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(a);
        String s = "labas";
        a.sort((Integer o1, Integer o2)->{return o2 - o1;});
        System.out.println(s);
        System.out.println(a);
    }
}
