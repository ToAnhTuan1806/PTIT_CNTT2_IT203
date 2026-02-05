package com.rikkeiedu.bt;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double basicSalary, String department) {
        // super() PHẢI là dòng đầu tiên
        super(name, basicSalary);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // dùng lại thông tin Employee
        System.out.println("Phòng ban: " + department);
    }
}
