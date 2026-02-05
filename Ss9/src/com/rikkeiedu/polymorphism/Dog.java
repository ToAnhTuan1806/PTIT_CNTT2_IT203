package com.rikkeiedu.polymorphism;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Gâu gâu");
    }

    public void wagTail() {
        System.out.println("Dog vẫy đuôi");
    }
}
