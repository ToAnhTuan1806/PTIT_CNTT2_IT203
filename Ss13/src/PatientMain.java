import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PatientMain {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = readInt("Chọn chức năng: ");

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    showPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn 1-6.");
            }
        }while (choice!=6);
    }

    private static void printMenu() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán");
        System.out.println("3. Xuất viện");
        System.out.println("4. Sắp xếp danh sách bệnh nhân");
        System.out.println("5. Hiển thị danh sách bệnh nhân");
        System.out.println("6. Thoát");
    }

    // chuc nang 1: them benh nhan moi vao ds
    private static void addPatient() {
        String id;
        while (true) {
            id = readString("Nhập ID: ");
            if (findById(id) != null) {
                System.out.println("ID đã tồn tại.");
            } else break;
        }
        String name = readString("Nhập tên: ");
        int age = readInt("Nhập tuổi: ");
        String diagnosis = readString("Nhập chẩn đoán: ");

        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm thành công.");
    }

    //chuc nang 2: cap nhat chan doan cho bnhan theo id
    private static void updateDiagnosis() {
        String id = readString("Nhập ID cần cập nhật: ");
        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy.");
            return;
        }
        String newDiagnosis = readString("Nhập chẩn đoán mới: ");
        p.setDiagnosis(newDiagnosis);
        System.out.println("Đã cập nhật.");
    }

    //chuc nang 3: xuat vien benh nhan
    private static void dischargePatient() {
        String id = readString("Nhập ID xuất viện: ");
        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy.");
            return;
        }
        patients.remove(p);
        System.out.println("Đã xuất viện.");
    }

    //chuc nang 4: sap xep ds benh nhan
    private static void sortPatients() {
        Collections.sort(patients, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                //ss tuoi giam dan
                int ageCompare = Integer.compare(o2.getAge(), o1.getAge());
                if (ageCompare != 0) return ageCompare;
                //tuoi = nhau thi ss ten tang dan
                return o1.getFullName().compareToIgnoreCase(o2.getFullName());
            }
        });

        System.out.println("Đã sắp xếp.");
    }

    //chuc nang 5: hien thi toan bo ds bnhan
    private static void showPatients() {
        if (patients.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    //ham phu
    //tim bnhan theo ID
    //tra ve null neu k tim thay
    private static Patient findById(String id) {
        for (Patient p : patients) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    //nhap chuoi k rong
    private static String readString(String message) {
        System.out.print(message);
        return sc.nextLine().trim();
    }

    //nhap so nguyen hop le
    private static int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập số hợp lệ.");
            }
        }
    }
}
