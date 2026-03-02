package com.rikkeiedu.bt.bai4;

import com.rikkeiedu.bt.bai2.PatientQueue;

import java.util.PriorityQueue;

public class EmergencyQueue {
    PriorityQueue<EmergencyPatient> queue;
    private long counter = 0;

    public EmergencyQueue() {
        queue = new PriorityQueue<>(
                (p1, p2) -> {
                    if (p1.getPriority() != p2.getPriority()) {
                        return p1.getPriority() - p2.getPriority();
                    }
                    return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
                }
        );
    }

    public void addPatient(String id, String name, int priority) {
        counter++;
        EmergencyPatient patient = new EmergencyPatient(id, name, priority, counter);
        queue.offer(patient);
        System.out.println("da them benh nhan: " + name);
    }

    public EmergencyPatient callNextPatient() {
        if(queue.isEmpty()) {
            System.out.println("khong con benh nhan nao");
            return null;
        }
        return queue.poll();
    }

    public void displayQueue() {
        if(queue.isEmpty()) {
            System.out.println("khong co benh nhan nao");
            return;
        }

        System.out.println("Danh sach cho");
        for(EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}
