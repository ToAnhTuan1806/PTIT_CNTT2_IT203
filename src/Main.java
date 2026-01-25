
public class Main {
    public static void main(String[] args) {
        // sô học
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a % b);

        // gán
        int x = 5;
        x += 3;
        x *= 2;

        // so sánh
        int c = 7, d= 9;


        int num = 10;
        System.out.println("RS= "+ (++num*2-num---num++*2));
        // 11 * 2 -11 - 10 * 2 = 22 - 11 - 20 = -9
        System.out.println("Final = " + num);

        // xuất dữ liệu
        System.out.print("Hello"); // ko xuống dòng
        System.out.print("Hello\n"); // xuống dòng thủ công
        System.out.println("World"); // tự động xuống dòng
        // in theo định dạng
        // kí tự đại diện:  %s(string), %c(char), %d(int, byte, short, long), %f(float, double)
        // kí tự điều khiển: \n, %n (xuống dòng), \t (tab)
        System.out.printf("In định dạng: %nTen tôi là %s, năm nay tôi %d tuổi", "Tuan",18);
    }
}