import com.rikkeiedu.th.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int n = 0;
        int choice;

        do {
            showMenu();
            choice = readInt(sc);

            switch (choice) {
                case 1:
                    n = inputStudents(sc, students);
                    break;
                case 2:
                    showStudents(students, n);
                    break;
                case 3:
                    searchByRank(sc, students, n);
                    break;
                case 4:
                    sortByRankDesc(students, n);
                    System.out.println("Da sap xep xong!");
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

            System.out.println();
        } while (choice != 5);

        sc.close();
    }

    private static void showMenu() {
        System.out.println("===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo Học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.println("==================================");
        System.out.print("Chọn chức năng: ");
    }

    //ham doc so nguyen
    private static int readInt(Scanner sc) {
        int x;
        while (true) {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                sc.nextLine();
                return x;
            }
            sc.nextLine();
            System.out.print("Nhap so hop le: ");
        }
    }

    //ham doc so thuc
    private static double readDouble(Scanner sc) {
        double x;
        while (true) {
            if (sc.hasNextDouble()) {
                x = sc.nextDouble();
                sc.nextLine();
                return x;
            }
            sc.nextLine();
            System.out.print("Nhap so thuc hop le: ");
        }
    }

    //ktra ma sinh vien bat dau bang "SV" va co 3 chu so
    private static boolean isValidId(String id) {
        if (!id.startsWith("SV")) {
            return false;
        }
        if (id.length() != 5){
            return false;
        }
        String num = id.substring(2);
        for (int i = 0; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //chuc nang 1: nhap danh sach
    private static int inputStudents(Scanner sc, Student[] students) {
        System.out.print("Nhap so luong sinh vien: ");
        int count = readInt(sc);

        for (int i = 0; i < count; i++) {
            System.out.println("--- Sinh vien " + (i + 1) + " ---");

            String id;
            do {
                System.out.print("Nhap ma SV (SV001): ");
                id = sc.nextLine();
            } while (!isValidId(id));

            System.out.print("Nhap ho ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap diem TB: ");
            double score = readDouble(sc);

            // Tạo đối tượng sinh viên
            students[i] = new Student(id, name, score);
        }
        return count;
    }

    //chuc nang 2: hien thi danh sach
    private static void showStudents(Student[] students, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(students[i]);
        }
    }

    //chuc nang 3: tim theo hoc luc
    private static void searchByRank(Scanner sc, Student[] students, int n) {
        System.out.print("Nhap hoc luc can tim: ");
        String key = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (students[i].getRank().equalsIgnoreCase(key)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    //quy doi hoc luc ra so
    private static int rankValue(Student s) {
        String rank = s.getRank();

        switch (rank) {
            case "Gioi":
                return 4;
            case "Kha":
                return 3;
            case "Trung Binh":
                return 2;
            default:
                return 1;
        }
    }

    //chuc nang 4: sap xep giam dan gian
    private static void sortByRankDesc(Student[] students, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (rankValue(students[j]) > rankValue(students[i])) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
