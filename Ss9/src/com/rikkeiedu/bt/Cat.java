package com.rikkeiedu.bt;

public class Cat extends Animal {

    // Ghi đè phương thức sound()
    @Override
    public void sound() {
        System.out.println("Meo meo");
    }
}
