package com.rikkeiedu.bt;

public class Student extends Person {
    private String studentId;
    private double avgScore;

    public Student(String fullName, int age, String studentId, double avgScore) {
        // Gọi constructor của lớp cha
        super(fullName, age);
        this.studentId = studentId;
        this.avgScore = avgScore;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + avgScore);
    }
}
