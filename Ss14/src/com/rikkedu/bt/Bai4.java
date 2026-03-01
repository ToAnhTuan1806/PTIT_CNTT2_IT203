package com.rikkedu.bt;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        List<String> dsBenh= Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );
        //TreeMap auto sx theo Alphabet
        Map<String, Integer> thongKe=new TreeMap<>();
        for (String benh: dsBenh) {
            if(thongKe.containsKey(benh)){
                thongKe.put(benh, thongKe.get(benh));
            }else{
                thongKe.put(benh, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
