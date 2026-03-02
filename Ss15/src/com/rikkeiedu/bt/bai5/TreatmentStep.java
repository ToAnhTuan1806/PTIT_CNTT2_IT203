package com.rikkeiedu.bt.bai5;

public class TreatmentStep {
    private String description;
    private String time;

    public TreatmentStep(String description, String time) {
        this.description = description;
        this.time = time;
    }

    @Override
    public String toString() {
        return description + " - " + time;
    }
}
