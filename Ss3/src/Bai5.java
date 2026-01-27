import java.util.Scanner;

public class Bai5 {
    public static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        //tìm vị trí sách
        for (int i=0; i<n; i++) {
            if (arr[i]==bookId) {
                pos=i;
                break;
            }
        }

        //không tìm thấy
        if (pos==-1) {
            System.out.println("Không tìm thấy sách mã " + bookId);
            return n;
        }

        //dồn trái
        for (int i=pos; i<n-1; i++) {
            arr[i]=arr[i+1];
        }
        System.out.println("Đã xóa sách mã " + bookId);
        return n-1;  //giảm số lượng
    }

    public static void displayBooks(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = books.length;

        while (n > 0) {
            System.out.print("\nKho sách hiện tại (" + n + " cuốn): ");
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int id = sc.nextInt();

            if (id==0){
                break;
            }
            n =deleteBook(books, n, id);
        }

    }
}
