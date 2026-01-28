import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions= {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        //lay ngay he thong
        LocalDate today=LocalDate.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //chuyen ngay sang chuoi
        String date=today.format(formatter);

        //ghi thoi diem bat dau thuc thi
        long startSB= System.currentTimeMillis();

        StringBuilder reportSB = new StringBuilder();
        reportSB.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        reportSB.append("Ngày tạo: ").append(date).append("\n");

        //duyet tung gd va theo vao bao cao
        for(String tran: transactions){
            reportSB.append("Giao dịch: ").append(tran).append("\n");
        }

        long endSB= System.currentTimeMillis();
        // tinh thoi gian thuc thi
        long timeSB= endSB-startSB;

        // dùng String +
        long startStr= System.currentTimeMillis();
        String reportStr= "";
        reportStr+= "--- BÁO CÁO MƯỢN SÁCH ---\\n";
        reportStr+= "Ngày tạo: " + date + "\n";

        for (String tran: transactions){
            reportStr+= "Giao dịch: " + tran + "\n";
        }
        long endStr= System.currentTimeMillis();
        long timeStr= endStr-startStr;

        System.out.println(reportSB.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: " + timeSB);

        System.out.println("Số thời gian thực thi đối với String: " + timeStr);
    }

}
