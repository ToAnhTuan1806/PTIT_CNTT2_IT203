package com.rikkeiedu.bt.bai4;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();
        queue.addPatient("P01", "Nguyen Van A", 2);
        queue.addPatient("P02", "Tran Thi B", 1);
        queue.addPatient("P03", "Le Van C", 2);
        queue.addPatient("P04", "Pham Van D", 1);

        System.out.println();

        System.out.println("Thu tu kham:");
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
        System.out.println(queue.callNextPatient());
    }
}
