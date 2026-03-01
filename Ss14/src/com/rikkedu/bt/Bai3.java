package com.rikkedu.bt;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> thuoc=new LinkedHashSet<>();
        thuoc.add("Aspirin");
        thuoc.add("Caffeine");
        thuoc.add("Paracetamol");

        Set<String> diUng=new LinkedHashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        //tim giao (canh bao di ung)
        Set<String> canhBao=new LinkedHashSet<>(thuoc);
        canhBao.retainAll(diUng);
        //tim hieu (thanh phan an toan)
        Set<String> anToan=new LinkedHashSet<>(thuoc);
        anToan.removeAll(diUng);

        System.out.println("Canh bao di ung: "+canhBao);
        System.out.println("Thanh phan an toan: "+anToan);
    }
}
