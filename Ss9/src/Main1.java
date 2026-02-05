import com.rikkeiedu.polymorphism.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {

        // Bai 4
        Animal animal = new Dog(); // đa hình

        animal.sound(); // runtime gọi Dog.sound()

        // Không gọi được vì Animal1 không có wagTail()
        // animal.wagTail(); // lỗi biên dịch
        // kiểm tra và ép kiểu an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.wagTail();
        }
        System.out.println("---------------------\n");


        // Bai 5
        // Danh sách chung kiểu Employee (trộn nhiều loại nhân viên)
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("Nguyen Van A", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C", 150, 30_000));

        NumberFormat vn = NumberFormat.getInstance(new Locale("vi", "VN"));

        System.out.println("Danh sách lương nhân viên:");

        double totalSalary = 0;
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);

            // Gọi đúng calculateSalary() theo đối tượng thực tế (Office/Production)
            double salary = e.calculateSalary();
            totalSalary += salary;

            System.out.println((i + 1) + ". " + e.getName() + " - Lương: " + vn.format(salary));
        }
        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + vn.format(totalSalary));
        System.out.println("---------------------\n");


        // Bai 6
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));          // r = 5
        shapes.add(new Rectangle(3, 4));    // 3 x 4
        shapes.add(new Rectangle(6));       // hình vuông cạnh 6 (constructor 1 tham số)

        double total = 0;

        System.out.println("Kết quả tính toán hình học:\n");

        for (int i = 0; i < shapes.size(); i++) {
            Shape s = shapes.get(i);
            double area = s.calculateArea();
            total += area;

            if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.printf("%d. Hình tròn (r=%.0f) - Diện tích: %.2f\n",
                        i + 1, c.getRadius(), area);
            } else if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;

                if (r.getWidth() == r.getHeight()) {
                    System.out.printf("%d. Hình vuông (cạnh %.1f) - Diện tích: %.1f  <-- (Class Rectangle xử lý)\n",
                            i + 1, r.getWidth(), area);
                } else {
                    System.out.printf("%d. Hình chữ nhật (%.1f x %.1f) - Diện tích: %.1f\n",
                            i + 1, r.getWidth(), r.getHeight(), area);
                }
            }
        }

        System.out.printf("=> Tổng diện tích các hình: %.2f\n", total);
    }
}
