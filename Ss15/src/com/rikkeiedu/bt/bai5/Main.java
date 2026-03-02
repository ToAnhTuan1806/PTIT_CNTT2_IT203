package com.rikkeiedu.bt.bai5;

import com.rikkeiedu.bt.bai2.Patient;

public class Main {
    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        Patient p1 = new Patient("P01", "Nguyen Van A", 30);
        EmergencyCase case1 = new EmergencyCase(p1);

        queue.addCase(case1);

        EmergencyCase currentCase = queue.getNextCase();

        if (currentCase != null) {

            currentCase.addStep(new TreatmentStep("Tiep nhan", "08:00"));
            currentCase.addStep(new TreatmentStep("Chan doan", "08:10"));
            currentCase.addStep(new TreatmentStep("Tiem thuoc", "08:20"));

            currentCase.displaySteps();

            System.out.println("\nUndo buoc gan nhat:");
            System.out.println(currentCase.undoStep());

            System.out.println("\nSau khi undo:");
            currentCase.displaySteps();
        }
    }
}