public class Bai4 {
    public static void displayBooks(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    // bubble sort
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    // đổi chỗ
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] books = {105, 102, 109, 101, 103};

        System.out.print("Trước khi sắp xếp: ");
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sắp xếp: ");
        displayBooks(books);
    }

}
