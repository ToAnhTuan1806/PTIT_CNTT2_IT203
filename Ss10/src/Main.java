import com.rikkeiedu.bai3.Duck;
import com.rikkeiedu.bai3.Fish;
import com.rikkeiedu.bai4.RemoteControl;
import com.rikkeiedu.bai5.BonusCalculator;
import com.rikkeiedu.bai5.Employee;
import com.rikkeiedu.bai5.Manager;
import com.rikkeiedu.bai5.OfficeStaff;
import com.rikkeiedu.bai6.Product;
import com.rikkeiedu.bt.*;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bai 1");
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        //hình tròn
        System.out.println("=== Hình tròn ===");
        System.out.println("Diện tích: " + circle.getArea());
        System.out.println("Chu vi: " + circle.getPerimeter());

        //hình chữ nhật
        System.out.println("\n=== Hình chữ nhật ===");
        System.out.println("Diện tích: " + rectangle.getArea());
        System.out.println("Chu vi: " + rectangle.getPerimeter());
        System.out.println("-------------------------------------\n");



        System.out.println("Bai 2");
        Vehicle car = new Car("Mercedes");
        Vehicle bicycle = new Bicycle("Giant");
        car.move();
        bicycle.move();
        System.out.println("-------------------------------------\n");



        System.out.println("Bai 3");
        Duck duck = new Duck("Vịt");
        Fish fish = new Fish("Cá");
        duck.swim();
        duck.fly();
        System.out.println();
        fish.swim();
        // fish.fly(); loi bien dicch
        System.out.println("-------------------------------------\n");



        System.out.println("Bai 4");
        // Anonymous Class triển khai RemoteControl
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };
        smartLight.powerOn();
        smartLight.checkBattery();
        System.out.println("-------------------------------------\n");



        System.out.println("Bai 5");
        Employee[] employees = new Employee[2];
        employees[0] = new OfficeStaff("An", 10000000);
        employees[1] = new Manager("Bình", 20000000, 0.25);

        System.out.println("===== BẢNG LƯƠNG =====");

        for (Employee e : employees) {
            double bonus = 0;
            if (e instanceof BonusCalculator) {
                bonus = ((BonusCalculator) e).getBonus();
            }
            double finalSalary = e.calculateSalary() + bonus;

            System.out.println(
                    e.getName() + " | " +
                            e.getClass().getSimpleName() + " | " +
                            "Lương cơ bản: " + e.calculateSalary() + " | " +
                            "Thưởng: " + bonus + " | " +
                            "Tổng lương: " + finalSalary
            );
        }
        System.out.println("-------------------------------------\n");


        System.out.println("Bai 6");
        Product[] products = {
                new Product("Laptop", 1500),
                new Product("Mouse", 20),
                new Product("Keyboard", 50),
                new Product("Monitor", 300)
        };

        /*
         * sắp xếp theo giá
         * BẮT BUỘC dùng Anonymous Class trong các trường hợp:
         * 1. Cần khai báo THUỘC TÍNH nội bộ (Lambda KHÔNG hỗ trợ).
         * 2. Cần logic phức tạp hoặc nhiều trạng thái.
         * 3. Cần ghi đè nhiều phương thức (nếu interface có nhiều method).
         */
        Arrays.sort(products, new Comparator<Product>() {
            // Thuộc tính nội bộ -> Lambda KHÔNG làm được
            private int compareCount = 0;

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++;
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        System.out.println("=== Sắp xếp theo giá (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }

        /*
         * sắp xếp theo tên
         *
         * Lambda phù hợp khi:
         * - Chỉ cần triển khai 1 phương thức duy nhất.
         * - KHÔNG cần thuộc tính hay trạng thái nội bộ.
         * - Code ngắn gọn, dễ đọc.
         */

        Arrays.sort(products,
                (p1, p2) -> p1.getName().compareTo(p2.getName())
        );

        System.out.println("\n=== Sắp xếp theo tên (Lambda) ===");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}