import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(search)){ // equals phân biệt chữ hoa thường
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Doraemon",
                "Conan",
                "One Piece",
                "Naruto",
                "Dragon Ball"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String name= sc.nextLine();

        int result=searchBooks(books, name);
        if(result!= -1){
            System.out.println("Tìm thấy sách '" +books[result] + "' tại vị trí số: " + result);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}
