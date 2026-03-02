package com.rikkeiedu.bt.bai3;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();
        String[] actions1 = {"PUSH", "PUSH", "POP", "POP"};

        System.out.println("Kiem tra quy trinh 1:");
        System.out.println(checker.checkProcess(actions1) ? "Hop le" : "Khong hop le");

        checker.reset();

        System.out.println();

        //th sai (POP khi rong)
        String[] actions2 = {"PUSH", "POP", "POP"};

        System.out.println("Kiem tra quy trinh 2:");
        System.out.println(checker.checkProcess(actions2) ? "Hop le" : "Khong hop le");

        checker.reset();

        System.out.println();

        //th sai (ket thuc chua rong)
        String[] actions3 = {"PUSH", "PUSH", "POP"};

        System.out.println("Kiem tra quy trinh 3:");
        System.out.println(checker.checkProcess(actions3) ? "Hop le" : "Khong hop le");
    }
}
