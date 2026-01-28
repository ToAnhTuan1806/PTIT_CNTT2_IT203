import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ: ");
        String cardID = sc.nextLine();

        //2 chữ cái viết hoa
        if (!Pattern.matches("^[A-Z]{2}.*$", cardID)) {
            System.out.println("Thiếu tiền tố 2 chữ cái viết hoa");
            return;
        }

        //ktra đúng định dạng + tách năm và 5 số cuối
        Pattern full = Pattern.compile("^([A-Z]{2})(\\d{4})(\\d{5})$");
        Matcher m = full.matcher(cardID);

        if (!m.matches()) {
            // sai năm
            if (!Pattern.matches("^[A-Z]{2}\\d{4}.*$", cardID)) {
                System.out.println("Năm không hơpj lệ");
                return;
            }
            //sai 5 số cuối
            if (!Pattern.matches("^[A-Z]{2}\\d{4}\\d{5}$", cardID)) {
                System.out.println("5 số cuối không hợp lệ (phải có đúng 5 chữ số)");
                return;
            }
        }
        // kieem tra tính hợp lệ
        String prefix = m.group(1);   // 2 chữ cái
        String yearStr = m.group(2);  // 4 số năm
        String tail = m.group(3);     // 5 số cuối

        if (!prefix.equals("TV")) {
            System.out.println("Thiếu tiền tố TV.");
            return;
        }

        System.out.println("Mã thẻ hợp lệ!");
    }
}
