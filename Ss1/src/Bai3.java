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

        // xuất dữ liệu
        System.out.print("Hello"); // ko xuống dòng
        System.out.print("Hello\n"); // xuống dòng thủ công
        System.out.println("World"); // tự động xuống dòng
        // in theo định dạng
        // kí tự đại diện:  %s(string), %c(char), %d(int, byte, short, long), %f(float, double)
        // kí tự điều khiển: \n, %n (xuống dòng), \t (tab)
        System.out.printf("In định dạng: %nTen tôi là %s, năm nay tôi %d tuổi", "Tuan",18);

    }
}
