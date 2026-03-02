package com.rikkeiedu.bt.bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    Queue<Patient> queue;
    PatientQueue() {
        queue=new LinkedList<>();
    }

    public void addPatient(Patient p){
        queue.offer(p); //them vao cuoi hang
        System.out.println("da them benh nhan vao cuoi hang");
    }

    public Patient callNextPatient(){
        if(!queue.isEmpty()){
            return queue.poll();//lay va xoa dau
        }else {
            System.out.println("khoing con benh nhan nao");
            return null;
        }
    }

    public Patient peekNextPatient(){
        if(!queue.isEmpty()){
            return queue.peek();
        }else {
            System.out.println("hang doi rong");
            return null;
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void displayQueue(){
        if(queue.isEmpty()){
            System.out.println("khong con benh nhan nao dang cho");
            return;
        }
        System.out.println("Danh sach benh nhan");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
