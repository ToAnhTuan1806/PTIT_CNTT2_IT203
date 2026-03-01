package com.rikkedu.bt;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bai1 {
    public static void main(String[] args) {
        Set<String> list=new LinkedHashSet<>();
        list.add("Nguyen Van A - Yen Bai");
        list.add("Tran Thi B - Hung Yen");
        list.add("Nguyen Van A - Yen Bai");
        list.add("Tran Van C - Thai Binh");

        System.out.println("Ds goi kham:");
        for (String name:list){
            System.out.println(name);
        }
    }
}
