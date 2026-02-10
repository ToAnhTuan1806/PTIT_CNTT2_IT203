package com.rikkeiedu.bai5;

// nv văn phòng: không có thưởng KPI
public class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

