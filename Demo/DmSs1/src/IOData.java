import java.util.Scanner;

public class IOData {
    public static void main(String[] args) {
        // Nhập dữ liệu
        Scanner input; // không có vùng nhớ: null
        input = new Scanner(System.in);// cấp phát động
        // Nhập chuỗi
        String name;
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.println("Your name is: " + name);
        System.out.println("Nhập 1 kí tự: ");
        char ch = input.next().charAt(0); // nhập từng kí tự

        // Nhập khác chuỗi: boolean, byte, short, long, int, float, double
        System.out.print("Nhập tuổi của bạn: ");
        int age = input.nextInt();
        System.out.println("Tuổi của bạn là: " + age);

        //Lưu ý:
        input.nextLine(); // đọc bỏ dòng mới còn thừa sau khi nhập số
        System.out.print("Nhâp sđt: ");
        String phone=  input.nextLine(); // đọc bỏ dòng mới
        System.out.println(phone);


    }
}
