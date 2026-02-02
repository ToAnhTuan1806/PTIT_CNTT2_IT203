package com.rikkeiedu.management;

public class Student {
    // tên trường là hằng số
    public static final String SCHOOL_NAME = "Rikkei Education";

    //static: dùng để tự tăng ID
    private static int nextId = 1;

    private final int id;        // ID không cho sửa sau khi tạo
    private String fullName;
    private double score;
    private String className;

    public Student(String fullName, double score, String className) {
        this.id = nextId++;
        this.fullName = fullName;
        this.score = score;
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void display() {
        System.out.println("ID: " + id
                + " | Họ tên: " + fullName
                + " | Điểm: " + score
                + " | Lớp: " + className
                + " | Trường: " + SCHOOL_NAME);
    }
}
