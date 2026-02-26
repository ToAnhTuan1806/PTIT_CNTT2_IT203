import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class MedicineMain {
    private static final List<Medicine> cart = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            printMenu();
            choice = readInt("Chọn lựa chọn: ");

            switch (choice) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    updateQuantity();
                    break;
                case 3:
                    removeMedicine();
                    break;
                case 4:
                    printInvoiceAndClear();
                    break;
                case 5:
                    findCheapMedicines();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Vui lòng chọn 1-6.");
            }
        } while (choice!=6);
    }

    private static void printMenu() {
        System.out.println("||=========================MENU=========================||");
        System.out.println("||  1. Thêm thuốc vào đơn                               ||");
        System.out.println("||  2. Điều chỉnh số lượng                              ||");
        System.out.println("||  3. Xóa thuốc                                        ||");
        System.out.println("||  4. In hóa đơn                                       ||");
        System.out.println("||  5. Tìm thuốc giá rẻ                                 ||");
        System.out.println("||  6. Thoát                                            ||");
        System.out.println("||======================================================||");
    }

    //chuc nang 1: them thuoc
    private static void addMedicine() {
        String id = readNonEmptyString("Nhập mã thuốc: ");
        String name = readNonEmptyString("Nhập tên thuốc: ");
        double price = readDouble("Nhập giá thuốc: ");
        int qty = readInt("Nhập số lượng: ");

        //tim xem thuoic co trong gio hang chua
        Medicine existing = findById(id);

        if (existing != null) {
            existing.setQuantity(existing.getQuantity() + qty);

            existing.setDrugName(name);
            existing.setUnitPrice(price);
            System.out.println("Thuốc đã tồn tại -> cộng dồn số lượng thành công!");
        } else {
            cart.add(new Medicine(id, name, price, qty));
            System.out.println("Thêm thuốc thành công!");
        }
    }

    //chuc nang 2: dieu chinh so luong
    private static void updateQuantity() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc đang trống.");
            return;
        }

        Medicine med = null;
        while (med == null) {
            String id = readNonEmptyString("Nhập mã thuốc: ");
            med = findById(id);
            if (med == null) {
                System.out.println("Thuốc không tồn tại trong đơn.");
            }
        }

        int newQty = readInt("Nhập số lượng mới: ");

        if (newQty == 0) {
            Iterator<Medicine> it = cart.iterator();
            while (it.hasNext()) {
                Medicine m = it.next();
                if (m.getDrugId().equalsIgnoreCase(med.getDrugId())) {
                    it.remove();
                    break;
                }
            }
            System.out.println("Số lượng = 0 -> đã xóa thuốc khỏi đơn!");
        } else {
            med.setQuantity(newQty);
            System.out.println("Cập nhật thuốc thành công!");
        }
    }

    //chuc nang 3: xoa thuoc
    private static void removeMedicine() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc đang trống.");
            return;
        }

        String id = readNonEmptyString("Nhập mã thuốc cần xóa: ");
        boolean removed = false;

        Iterator<Medicine> it = cart.iterator();
        while (it.hasNext()) {
            Medicine m = it.next();
            if (m.getDrugId().equalsIgnoreCase(id)) {
                it.remove();
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Id thuốc không tồn tại !");
        } else {
            System.out.println("Đã xóa thuốc thành công!");
        }
    }

    //chuc nang 4: in hoa don + clear
    private static void printInvoiceAndClear() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc đang trống.");
            return;
        }

        System.out.println("Chọn lựa chọn: 4");
        System.out.printf("%-10s %-25s %-12s %-10s %-15s%n",
                "Mã Thuốc", "Tên Thuốc", "Đơn Giá", "Số Lượng", "Thành Tiền");

        double total = 0;
        for (Medicine m : cart) {
            double line = m.getLineTotal();
            total += line;

            System.out.printf("%-10s %-25s %-12.2f %-10d %-15.2f%n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    line);
        }

        System.out.printf("Tổng tiền: %.2f VND%n", total);

        cart.clear();
        System.out.println("Đã in hóa đơn -> đơn thuốc đã được làm trống cho lần kê tiếp theo.");
    }

    //chuc nang 5: tim thuoc gia re
    //liet ke thuoc co don gia < 50000
    private static void findCheapMedicines() {
        if (cart.isEmpty()) {
            System.out.println("Đơn thuốc đang trống.");
            return;
        }

        System.out.println("Danh sách thuốc giá rẻ (< 50000):");
        boolean found = false;

        System.out.printf("%-10s %-25s %-12s%n", "Mã Thuốc", "Tên Thuốc", "Đơn Giá");

        for (Medicine m : cart) {
            if (m.getUnitPrice() < 50000) {
                found = true;
                System.out.printf("%-10s %-25s %-12.2f%n",
                        m.getDrugId(), m.getDrugName(), m.getUnitPrice());
            }
        }

        if (!found) {
            System.out.println("(Không có thuốc nào dưới 50.000)");
        }
    }

    //ham phu: tim theo id
    private static Medicine findById(String id) {
        for (Medicine m : cart) {
            if (m.getDrugId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    private static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Không được để trống. Nhập lại!");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String raw = sc.nextLine().trim();
            try {
                return Integer.parseInt(raw);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số nguyên hợp lệ!");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String raw = sc.nextLine().trim();
            try {
                return Double.parseDouble(raw);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }
}
