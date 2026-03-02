package com.rikkeiedu.bt.bai3;

import java.util.Stack;

public class MedicationProcessChecker {
    Stack<String> stack;
    MedicationProcessChecker() {
        stack = new Stack<>();
    }

    public boolean checkProcess(String [] actions){
        for(int i=0;i<actions.length;i++){
            String action = actions[i];
            if(action.equals("PUSH")){
                stack.push("Medication");
            } else if (action.equals("POP")) {
                if (stack.isEmpty()){
                    System.out.println("Loi tai buoc " + (i + 1) + ": POP khi stack rong.");
                    return false;
                }
                stack.pop();
            }else {
                System.out.println("hanh dong khong hop le: "+action);
                return false;
            }
        }
        if(!stack.isEmpty()){
            System.out.println("Ket thuc ca truc nhung con thuoc chua hoan tat.");
            return false;
        }
        return true;
    }
    public void reset(){
        stack.clear();
    }

}
