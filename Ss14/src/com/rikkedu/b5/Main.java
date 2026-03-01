package com.rikkedu.b5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //comparator theo quy tac uu tien
        Comparator<Patient> triageComparator=new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.severity!=p2.severity){
                    return p1.severity-p2.severity;
                }
                return p1.arrivalTime-p2.arrivalTime;
            }
        };
        TreeSet<Patient> queue=new TreeSet<>(triageComparator);

        queue.add(new Patient("Benh nhan A", 3, 800));
        queue.add(new Patient("Benh nhan B", 1, 815));
        queue.add(new Patient("Benh nhan C", 1, 805));

        System.out.println("Thứ tự xử lý:");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
