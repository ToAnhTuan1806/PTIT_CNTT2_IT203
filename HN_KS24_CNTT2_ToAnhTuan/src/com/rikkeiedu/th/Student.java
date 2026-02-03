package com.rikkeiedu.th;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // xep loai hoc luc
    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else if (score >= 5.0) {
            return "Trung Binh";
        } else {
            return "Yeu";
        }
    }

    public String toString() {
        return String.format("Ma: %s | Ten: %s | Diem: %.2f | Hoc luc: %s",
                id, name, score, getRank());
    }
}
