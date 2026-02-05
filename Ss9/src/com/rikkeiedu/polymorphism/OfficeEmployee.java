package com.rikkeiedu.polymorphism;

public class OfficeEmployee extends Employee {
    private double baseSalary;
    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
