package com.rikkeiedu.bt.bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    Queue<EmergencyCase> cases;
    public EmergencyCaseQueue() {
        cases=new LinkedList<>();
    }

    public void addCase(EmergencyCase c){
        cases.offer(c);
        System.out.println("da them benh nhan vao hanh doi");
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Khong con benh nhan nao");
            return null;
        }
        return cases.poll();
    }
}
