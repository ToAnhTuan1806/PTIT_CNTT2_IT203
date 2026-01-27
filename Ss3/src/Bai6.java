public class Bai6 {
    // In mảng
    public static void display(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1) System.out.print(", ");
        }
        System.out.println();
    }

    //gộp 2 mảng đã tăng dần + lọc trùng + giữ tăng dần
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0;
        int[] temp = new int[a.length + b.length];
        int k = 0;

        while (i < a.length && j < b.length) {
            int value;

            if (a[i] < b[j]) {
                value = a[i];
                i++;
            } else if (a[i] > b[j]) {
                value = b[j];
                j++;
            } else {
                // a[i] == b[j] -> lấy 1 lần
                value = a[i];
                i++;
                j++;
            }
            //lọc trùng khi thêm vào temp
            if (k == 0 || temp[k - 1] != value) {
                temp[k] = value;
                k++;
            }
        }

        //nếu còn dư phần tử ở a
        while (i<a.length) {
            int value=a[i];
            i++;
            if (k == 0 || temp[k - 1] != value) {
                temp[k] = value;
                k++;
            }
        }

        //nếu còn dư phần tử ở b
        while (j<b.length) {
            int value = b[j];
            j++;
            if (k == 0 || temp[k - 1] != value) {
                temp[k] = value;
                k++;
            }
        }

        //tạo mảng kết quả đúng kích thước k
        int[] result = new int[k];
        for (int t=0; t<k; t++) {
            result[t] = temp[t];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cũ: ");
        display(arrayFirst);

        System.out.print("Lô mới: ");
        display(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho tổng (đã gộp & lọc trùng): ");
        display(arrayMerge);
    }
}
