package BTTH;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        IManager<Category> categoryManager = new CategoryManager();
        IManager<Book> bookManager = new BookManager((CategoryManager) categoryManager);

        int choice;
        do {
            printMainMenu();
            choice = readInt("Chọn: ");

            switch (choice) {
                case 1:
                    categoryMenu(categoryManager);
                    break;
                case 2:
                    bookMenu(bookManager, categoryManager);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }
        } while (choice != 0);
    }

    private static void printMainMenu() {
        System.out.println("\n===== MENU CHÍNH =====");
        System.out.println("1. Quản lý Danh mục");
        System.out.println("2. Quản lý Sách");
        System.out.println("0. Thoát");
    }

    private static void categoryMenu(IManager<Category> categoryManager) {
        int c;
        do {
            System.out.println("\n--- QUẢN LÝ DANH MỤC ---");
            System.out.println("1. Thêm danh mục");
            System.out.println("2. Sửa danh mục");
            System.out.println("3. Xóa danh mục");
            System.out.println("4. Hiển thị danh mục");
            System.out.println("0. Quay lại");
            c = readInt("Chọn: ");

            switch (c) {
                case 1: {
                    int id = readInt("Nhập id: ");
                    String name = readLine("Nhập name: ");
                    String desc = readLine("Nhập description: ");
                    categoryManager.add(new Category(id, name, desc));
                    break;
                }
                case 2: {
                    int id = readInt("Nhập id cần sửa: ");
                    String name = readLine("Nhập name mới: ");
                    String desc = readLine("Nhập description mới: ");
                    categoryManager.update(new Category(id, name, desc));
                    break;
                }
                case 3: {
                    int id = readInt("Nhập id cần xóa: ");
                    categoryManager.delete(id);
                    break;
                }
                case 4:
                    categoryManager.displayAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }

        } while (c != 0);
    }

    //menu sach
    private static void bookMenu(IManager<Book> bookManager, IManager<Category> categoryManager) {
        int c;
        do {
            System.out.println("\n--- QUẢN LÝ SÁCH ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Hiển thị sách");
            System.out.println("0. Quay lại");

            c = readInt("Chọn: ");

            switch (c) {
                case 1: {
                    categoryManager.displayAll();
                    int id = readInt("Nhập id sách: ");
                    String title = readLine("Nhập title: ");
                    String author = readLine("Nhập author: ");
                    int categoryId = readInt("Nhập categoryId: ");

                    bookManager.add(new Book(id, title, author, categoryId));
                    break;
                }
                case 2: {
                    categoryManager.displayAll();
                    int id = readInt("Nhập id sách cần sửa: ");
                    String title = readLine("Nhập title mới: ");
                    String author = readLine("Nhập author mới: ");
                    int categoryId = readInt("Nhập categoryId mới: ");

                    bookManager.update(new Book(id, title, author, categoryId));
                    break;
                }
                case 3: {
                    int id = readInt("Nhập id sách cần xóa: ");
                    bookManager.delete(id);
                    break;
                }
                case 4:
                    bookManager.displayAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Chọn không hợp lệ.");
            }

        } while (c != 0);
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

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }
}
