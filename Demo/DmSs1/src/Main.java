//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // qui tắc đặt tên biến đúng
        String studentName= "To Anh Tuan";
        boolean isCheckPrime= false;

        // Nhóm kiểu nguyên thuỷ: boolean, double, float, byte, short, int, long, char
        boolean isCheck= true;
        float f= 0.5f;
        double d= 0.5;
        char c= 'A';
        byte b= 100;
        short s= 100;
        int i= 100000;
        long l= 10000000000L;

        // Nhóm kiểu dữ liệu tham chiếu
        int[] arr= {1,2,3,4}; //array
        String str= "12334";

        // Ngoài ra còn Class, oject, interface, enum

        // Biến hằng
        final float PI= 3.14f;

        // Ép kiểu ngầm định
//        int intValue= sh; // ko gây mất dữ liệu
        // Ép kiểu tường minh
//        short shortVAlue;

        System.out.print("Hleee");
        System.out.println("Hleeeoo");

        System.out.println("Ho ten: %s- Ngay sinh:%s - SDT: %s");

        // nhaập dữ liệu
        Scanner input = new Scanner(System.in);
        int nhap= input.nextInt();
        System.out.println(nhap);
        String line = input.nextLine();
        System.out.println(line);


    }
}