package com.rikkeiedu.bt;

public class ClassRoom {
    private static double classFund = 0;
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    //dong tien vao quy lop
    public void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount);
        }
    }

    //tong quy lop
    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}
