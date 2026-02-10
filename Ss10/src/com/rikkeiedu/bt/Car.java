package com.rikkeiedu.bt;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    @Override
    public void move() {
        System.out.println(brand + ": Di chuyển bằng động cơ");
    }
}
