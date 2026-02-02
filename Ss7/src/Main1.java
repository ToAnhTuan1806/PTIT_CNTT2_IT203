import com.rikkeiedu.management.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    private static final List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Chọn: ");
            choice = readInt(sc);

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    showAverageScore();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

            System.out.println();
        } while (choice != 0);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("===== QUẢN LÝ HỌC SINH =====");
        System.out.println("1. Thêm mới học sinh");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Tính điểm trung bình");
        System.out.println("0. Thoát");
    }

    private static void addStudent(Scanner sc) {
        System.out.print("Nhập họ tên: ");
        String fullName = sc.nextLine().trim();

        System.out.print("Nhập điểm: ");
        double score = readDouble(sc);

        System.out.print("Nhập tên lớp: ");
        String className = sc.nextLine().trim();

        students.add(new Student(fullName, score, className));
        System.out.println("Đã thêm học sinh.");
    }

    private static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.println("----- DANH SÁCH HỌC SINH -----");
        for (Student st : students) {
            st.display();
        }
    }

    private static void showAverageScore() {
        if (students.isEmpty()) {
            System.out.println("Chưa có học sinh!");
            return;
        }
        double sum = 0;
        for (Student st : students) {
            sum += st.getScore();
        }
        double avg = sum / students.size();
        System.out.println("Điểm trung bình: " + String.format("%.2f", avg));
    }

    //số nguyên
    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            if (s.matches("^\\d+$")) {
                return Integer.parseInt(s);
            }
            System.out.print("Nhập lại số nguyên: ");
        }
    }

    //số thực
    private static double readDouble(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim().replace(',', '.');
            if (s.matches("^\\d+(\\.\\d+)?$")) {
                return Double.parseDouble(s);
            }
            System.out.print("Nhập lại số thực: ");
        }
    }
}
