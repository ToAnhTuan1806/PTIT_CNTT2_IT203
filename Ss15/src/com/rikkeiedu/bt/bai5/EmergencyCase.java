package com.rikkeiedu.bt.bai5;

import com.rikkeiedu.bt.bai2.Patient;

import java.util.Stack;

public class EmergencyCase {
    Patient patient;
    Stack<TreatmentStep> steps;

    public EmergencyCase(Patient patient) {
        this.patient = patient;
        this.steps = new Stack<>();
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Da them buoc xu ly: " + step);
    }

    public TreatmentStep undoStep(){
        if(steps.isEmpty()){
            System.out.println("Khong co buoc nao de undo");
            return null;
        }
        return steps.pop();
    }

    public void displaySteps(){
        if(steps.isEmpty()){
            System.out.println("Chua co buoc xu ly");
            return;
        }

        System.out.println("Lich su xu ly cua benh nhan");
        for(int i=steps.size()-1;i>=0;i--){
            System.out.println(steps.get(i));
        }
    }
    public Patient getPatient() {
        return patient;
    }
}
