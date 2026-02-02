package com.rikkeiedu.bt;

public class Student {
    private String stdId;
    private String stdName;

    private static int totalStudent=0;

    public Student(String stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã SV: " + stdId);
        System.out.println("Tên SV: " + stdName);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }
}
