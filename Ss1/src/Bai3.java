import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book1 = "Java Basic";
        String book2 = "Python Intro";

        String temp = book1;
        book1 = book2;
        book2 = temp;

        System.out.println("Trước khi hoán đổi: Book 1 = " + book1 + ", Book 2 = " + book2);
        System.out.println("Sau khi hoán đổi: Book 1 = " + book2 + ", Book 2 = " + book1);

    }
}
