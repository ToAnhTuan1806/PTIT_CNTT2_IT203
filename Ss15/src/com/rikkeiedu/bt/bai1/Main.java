package com.rikkeiedu.bt.bai1;

public class Main {
    public static void main(String[] args) {
        MedicalRecordHistory history=new MedicalRecordHistory();
        history.addEdit(new EditAction("Them trieu chung sot", "10:00"));
        history.addEdit(new EditAction("Cap nhat huyet ap", "10:15"));
        history.addEdit(new EditAction("Them ket qua xet nghiem", "10:30"));

        history.displayHistory();

        System.out.println("\nundo: ");
        EditAction undone=history.undoEdit();
        if(undone!=null){
            System.out.println("da undo: "+undone);
        }

        System.out.println("\n sau khi undo: ");
        history.displayHistory();

        System.out.println("\nchinh sua gan nhat: ");
        System.out.println(history.getLatestEdit());
    }
}
