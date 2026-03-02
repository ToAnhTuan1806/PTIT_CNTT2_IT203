package com.rikkeiedu.bt.bai4;

public class EmergencyPatient {
    private String id;
    private String name;
    private int priority; //1: cap cuuu, 2: kham thuong
    private long arrivalOrder; //thu tu den

    public EmergencyPatient(String id, String name, int priority, long arrivalOrder) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }

    public int getPriority() {
        return priority;
    }

    public long getArrivalOrder() {
        return arrivalOrder;
    }

    @Override
    public String toString() {
        return "ID: "+id +
                " | Name: " + name +
                " | Priority: " + priority +
                " | Order: " + arrivalOrder;
    }
}
