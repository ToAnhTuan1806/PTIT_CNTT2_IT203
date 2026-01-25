import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int num = sc.nextInt();

        int thousands = num/ 1000;
        int hundreds = (num/100)%10;
        int dozens = (num/10)%10;
        int units =  num%10;

        int sumOfFirstThreeNumber= thousands + hundreds + dozens;

        boolean checkDigit = (sumOfFirstThreeNumber%10) == units;
        System.out.println("Chữ số kiểm tra kỳ vọng: " + sumOfFirstThreeNumber);
        System.out.println("Kết quả kiểm tra mã sách: " + (checkDigit ? "HỢP LỆ" : "SAI MÃ"));
    }
}
