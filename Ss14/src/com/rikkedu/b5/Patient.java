package com.rikkedu.b5;

public class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }
    @Override
    public String toString() {
        return name + " (Muc " + severity + ", den luc " + arrivalTime + ")";
    }
}
