import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        System.out.print("Nhập số sách đang muốn: ");
        int numBooks = sc.nextInt();

        if (age>=18 && numBooks<3){
            System.out.println("Cho phép mượn sách");
        } else {
            System.out.println("Không đủ điều kiện");
            if(age<18){
                System.out.println("    Bạn chưa đủ tuổi");
            }
            if(numBooks>=3){
                System.out.println("    Bạn đã mượn quá số lượng cho phép");
            }
        }
    }
}
