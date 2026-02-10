package com.rikkeiedu.bai5;

// quản lý: có thưởng KPI
public class Manager extends Employee implements BonusCalculator {
    private double kpiRate;
    public Manager(String name, double baseSalary, double kpiRate) {
        super(name, baseSalary);
        this.kpiRate = kpiRate;
    }

    @Override
    public double calculateSalary() {
        // Lương theo vị trí (base) - phần thưởng cộng riêng bằng getFinalSalary()
        return baseSalary;
    }
    @Override
    public double getBonus() {
        return baseSalary * kpiRate;
    }
}

