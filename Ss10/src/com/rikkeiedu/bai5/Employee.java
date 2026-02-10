package com.rikkeiedu.bai5;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double getFinalSalary() {
        double bonus = 0;

        if (this instanceof BonusCalculator) {
            bonus = ((BonusCalculator) this).getBonus();
        }
        return baseSalary + bonus;
    }

    // mỗi vị trí có cách tính lương riêng
    public abstract double calculateSalary();
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
}
