package com.rikkeiedu.bt;

public class ScoreUtils {
    //Ktra Dat/Truot
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    //tinh diem tbinh
    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
}
