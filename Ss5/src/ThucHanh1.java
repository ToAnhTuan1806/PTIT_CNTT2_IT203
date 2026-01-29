import java.util.Scanner;
import java.util.regex.Pattern;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String[] studentList=new String[100];
        int studentCount=0;

        while (true) {
            printMenu();
            int choice = inputInt(sc, "Nhập lựa chọn của bạn: ");
            switch (choice) {
                case 1:
                    displayStudents(studentList, studentCount);
                    break;
                case 2:
                    studentCount = addStudent(sc, studentList, studentCount);
                    break;
                case 3:
                    updateStudent(sc, studentList, studentCount);
                    break;
                case 4:
                    studentCount = deleteStudent(sc, studentList, studentCount);
                    break;
                case 5:
                    searchStudent(sc, studentList, studentCount);
                    break;
                case 0:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.println();
        }
    }

    // ================= MENU =================
    public static void printMenu() {
        System.out.println("========== QUẢN LÝ MSSV ==========");
        System.out.println("1. Hiển thị danh sách MSSV");
        System.out.println("2. Thêm mới MSSV");
        System.out.println("3. Cập nhật MSSV theo index");
        System.out.println("4. Xóa MSSV (dồn mảng)");
        System.out.println("5. Tìm kiếm MSSV (không phân biệt hoa thường)");
        System.out.println("0. Thoát");
        System.out.println("==================================");
    }


    public static int inputInt(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } else {
                System.out.println("Vui lòng nhập số nguyên!");
                sc.nextLine();
            }
        }
    }

    //nhập mssv
    public static String inputStudentId(Scanner sc, String message) {
        //mssv: B+ đúng 7 chữ số (VD: B2101234)
        Pattern studentIdPattern = Pattern.compile("^B\\d{7}$", Pattern.CASE_INSENSITIVE);

        while (true) {
            System.out.print(message);
            String studentId = sc.nextLine().trim();

            if (studentIdPattern.matcher(studentId).matches()) {
                return studentId.toUpperCase();
            }
            System.out.println("Sai định dạng! MSSV phải dạng B + 7 chữ số (VD: B2101234)");
        }
    }

    //1. hiển thị sinh viên in ra toàn bộ sv hiện có
    public static void displayStudents(String[] studentList, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách MSSV đang rỗng!");
            return;
        }

        System.out.println("----- DANH SÁCH MSSV -----");
        for (int i=0; i<studentCount; i++) {
            System.out.printf("%02d) %s%n", i+1, studentList[i]);
        }
    }

    //2. thêm sinh viên. thêm sv mới vào cuối mảng
    public static int addStudent(Scanner sc, String[] studentList, int studentCount) {
        if (studentCount == studentList.length) {
            System.out.println("Danh sách đã đầy (100 MSSV). Không thể thêm!");
            return studentCount;
        }

        studentList[studentCount] = inputStudentId(sc, "Nhập MSSV mới: ");
        studentCount++;

        System.out.println("Thêm MSSV thành công!");
        return studentCount;
    }

    //3. cập nhật
    // sửa mssv tại vị trí index nhập vào
    public static void updateStudent(Scanner sc, String[] studentList, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        int index = inputInt(sc, "Nhập index cần sửa (0 - " + (studentCount-1) + "): ");
        if (index<0 || index>=studentCount) {
            System.out.println("Index không hợp lệ!");
            return;
        }

        studentList[index] = inputStudentId(sc, "Nhập MSSV mới: ");
        System.out.println("Cập nhật MSSV thành công!");
    }

    //4. xoá dồn mảng
    // xoá mssv và dồn mảng để lấp chỗ trống
    public static int deleteStudent(Scanner sc, String[] studentList, int studentCount) {
        if (studentCount == 0) {
            System.out.println("Danh sách rỗng!");
            return studentCount;
        }

        System.out.print("Nhập MSSV cần xóa: ");
        String targetId = sc.nextLine().trim();

        int deleteIndex = -1;
        for (int i=0; i<studentCount; i++) {
            if (studentList[i].equalsIgnoreCase(targetId)) {
                deleteIndex = i;
                break;
            }
        }

        if (deleteIndex==-1) {
            System.out.println("Không tìm thấy MSSV!");
            return studentCount;
        }

        for (int i=deleteIndex; i<studentCount-1; i++) {
            studentList[i] = studentList[i+1];
        }
        studentList[--studentCount] = null;

        System.out.println("Xóa MSSV thành công!");
        return studentCount;
    }

    // 5.tìm kiếm
    public static void searchStudent(Scanner sc, String[] studentList, int studentCount) {
        if (studentCount==0) {
            System.out.println("Danh sách MSSV đang rỗng!");
            return;
        }
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = sc.nextLine().trim();

        Pattern searchPattern = Pattern.compile(
                ".*" + Pattern.quote(keyword) + ".*",
                Pattern.CASE_INSENSITIVE
        );

        boolean found = false;
        System.out.println("----- KẾT QUẢ TÌM KIẾM -----");
        for (int i=0; i<studentCount; i++) {
            if (searchPattern.matcher(studentList[i]).matches()) {
                System.out.println("Index " + i + ": " + studentList[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có MSSV phù hợp!");
        }
    }
}
