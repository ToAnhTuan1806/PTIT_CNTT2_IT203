import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double total= n* m *5000;

        if (n>7 && m >=3) {
            total = total*1.2;
        }

        boolean blockCard = total >50000;

        System.out.println("\n===== KẾT QUẢ TÍNH PHẠT =====");
        System.out.println("Số ngày trễ: " + n);
        System.out.println("Số sách mượn: " + m);
        System.out.printf("Tổng tiền phạt: %.0f VND%n", total);
        System.out.println("Yêu cầu khóa thẻ: " + blockCard);

    }
}
