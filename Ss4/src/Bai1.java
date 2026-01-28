import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Nhap ten sach: ");
        String title =sc.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String author=sc.nextLine();

        System.out.print("Nhap the loai: ");
        String category=sc.nextLine();

        title = title.trim().replaceAll("\\s+"," ");
        author=author.trim().replaceAll("\\s+"," ");
        category=category.trim().replaceAll("\\s+"," ");

        title=title.toUpperCase();
        // tac gia viet hoa chu cai dau tien
        author=author.toLowerCase();
        String result= "";
        boolean flag=true;

        for(int i=0; i<author.length(); i++) {
            char c=author.charAt(i);
            if(flag && c!=' '){
                result+=Character.toUpperCase(c);
                flag=false;
            }else{
                result+=c;
            }
            if(c==' '){
                flag=true;
            }
        }
        System.out.println("[" +title+ "]" + " - Tác giả: " + result);

    }
}
