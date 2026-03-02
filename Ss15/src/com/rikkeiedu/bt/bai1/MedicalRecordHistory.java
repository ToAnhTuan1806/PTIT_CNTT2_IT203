package com.rikkeiedu.bt.bai1;

import java.util.Stack;

public class MedicalRecordHistory {
    Stack<EditAction> history;
    MedicalRecordHistory() {
        this.history = new Stack<>();
    }

    //them chinh sua
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Da them chinh sua");
    }

    //undo chinh sua
    public EditAction undoEdit(){
        if(!history.isEmpty()){
            return history.pop();
        }else{
            System.out.println("Khong co chinh sua de undo");
            return null;
        }
    }

    //xem ciunh sua gan nhat
    public EditAction getLatestEdit(){
        if(!history.isEmpty()){
            return history.peek();
        }else {
            System.out.println("stack rong");
            return null;
        }
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }

    //show toan bo lsu
    public void displayHistory(){
        if(history.isEmpty()){
            System.out.println("Khogn co lich su chinh sua");
            return;
        }
        for(int i=history.size()-1; i>=0; i--){
            System.out.println(history.get(i));
        }
    }
}
