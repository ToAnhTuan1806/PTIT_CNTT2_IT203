import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int max=Integer.MIN_VALUE; //số nào nhập vào cũng lớn hơn
        int min=Integer.MAX_VALUE; //số nào nhập vào cũng nhỏ hơn
        int count=0;
        int sum=0;

        // thứ 2-> chủ nhật
        for(int i=2; i<=8; i++){
            String dayName;

            if(i==8){
                dayName="Chủ Nhật";
            }else {
                dayName= "Thứ " + i;
            }

            System.out.print("Nhập lượt mượn của ngày " + dayName + ": ");
            int borrow=sc.nextInt();

            //nếu ngày đóng của
            if(borrow==0){
                continue;
            }

            if(borrow>max){
                max=borrow;
            }

            if (borrow<min){
                min=borrow;
            }
            sum+=borrow;
            count++;
        }
        System.out.println();
        System.out.println("--- KẾT QUẢ THỐNG KÊ ---");

        if(count==0){
            System.out.println("Không có ngày mở cửa");
        }else{
            double avg = (double) sum/count;
            System.out.println("Lượt mượn cao nhất: " + max);
            System.out.println("Lượt mượn thấp nhất: " + min);
            System.out.println("Trung bình lượt mượn/ngày: " + avg);
        }
    }
}
