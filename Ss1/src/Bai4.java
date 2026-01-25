import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double priceUSD = sc.nextDouble();

        System.out.print("Nhập giá chính xác (float): ");
        float exchangeRate = sc.nextFloat();

        double totalVND = priceUSD * exchangeRate;
        long changeVND = (long) totalVND;

        System.out.println("Giá chính xác: " +  totalVND);
        System.out.println("Giá làm tròn để thanh toán: " + changeVND + " VND");
    }
}
