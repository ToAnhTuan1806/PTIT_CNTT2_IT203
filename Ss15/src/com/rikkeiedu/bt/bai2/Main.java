package com.rikkeiedu.bt.bai2;

public class Main {
    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("P01", "Nguyen Van A", 30));
        patientQueue.addPatient(new Patient("P02", "Tran Thi B", 25));
        patientQueue.addPatient(new Patient("P03", "Le Van C", 40));

        System.out.println();
        patientQueue.displayQueue();

        System.out.println();

        System.out.println("Benh nhan tiep theo se duoc kham:");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println();

        System.out.println("Dang goi benh nhan vao kham:");
        System.out.println(patientQueue.callNextPatient());

        System.out.println();

        System.out.println("Danh sach con lai:");
        patientQueue.displayQueue();
    }
}
