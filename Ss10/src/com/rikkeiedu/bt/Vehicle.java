package com.rikkeiedu.bt;

public abstract class Vehicle {
    protected String brand;
    //khởi tạo hãng xe
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public abstract void move();
}
