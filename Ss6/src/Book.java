public class Book {
    private String bookId;
    private String bookName;
    private String author;

    //tham so trung ten thuoc tinh
    public Book(String bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Tác giả: " + author);
        System.out.println();
    }

    public static void main(String[] args) {
        Book b1 = new Book("BK01", "Lap trinh Java", "Nguyen Van A");
        Book b2 = new Book("BK02", "Co so du lieu", "Tran Thi B");
        b1.displayInfo();
        b2.displayInfo();
    }
}
