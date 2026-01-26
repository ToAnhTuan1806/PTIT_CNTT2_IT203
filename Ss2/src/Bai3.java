import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn: ");
        int n=sc.nextInt();
        int total=0;
        int finePerDay= 5000;
        for(int i=1;i<=n;i++){
            System.out.print("Nhập số ngày trễ của cuốn sách thứ " + i + ": ");
            int dayLate=  sc.nextInt();

            total+= dayLate*finePerDay;
        }
        System.out.println("=> Tổng tiền phạt: " + total);
    }
}
