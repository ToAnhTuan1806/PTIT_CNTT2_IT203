import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prestigeScore= 100;
        int daysLate;

        System.out.println("--- HỆ THỐNG ĐÁNH GIÁ ĐỘC GIẢ ---");
        System.out.println("Nhập số ngày trễ. Nhập 999 để kết thúc");
        while(true){
            System.out.print("Số lần trễ của lần này: ");
            daysLate = sc.nextInt();

            if(daysLate==999){
                break;
            }

            if(daysLate<=0){
                prestigeScore+=5;
                System.out.println("Trả đúng hạn +5 điểm");
            } else {
                int minus=daysLate*2;
                prestigeScore-=minus;
                System.out.println("Trả trễ " + daysLate + " ngày: -" + minus + " điểm");
            }
            System.out.println();
        }
        System.out.println("Tổng điểm uy tín: " +  prestigeScore);

        if (prestigeScore>120){
            System.out.println("-> Độc giả Thân thiết");
        } else if (prestigeScore>=80) {
            System.out.println("-> Độc giả Tiêu chuẩn");
        } else {
            System.out.println("-> Độc giả cần lưu ý");
        }
    }
}
