package com.rikkedu.bt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, String> danhMucThuoc=new HashMap<>();
        danhMucThuoc.put("T01", "Paracetamol");
        danhMucThuoc.put("T02", "Ibuprofen");
        danhMucThuoc.put("T03", "Amoxicillin");
        danhMucThuoc.put("T04", "Aspirin");
        danhMucThuoc.put("T05", "Vitamin C");

        // nhap ma thuoc
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma: ");
        String ma=sc.nextLine();

        //tra cuu
        if (danhMucThuoc.containsKey(ma)) {
            System.out.println("Ten thuoc: "+danhMucThuoc.get(ma));
        }else {
            System.out.println("Ten thuoc khong ton tai");
        }
    }
}
