public class Bai2 {
    public static void main(String[] args) {
        String description= "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        // contains ktra có chứa kệ không
        if(description.contains("Kệ:")){
            //indexOf vi tri bắt đầu
            int strat= description.indexOf("Kệ:")+4;

            //tìm dấu , sau kệ
            int end= description.indexOf(",", strat);

            String pos;

            // substring cắt chuỗi (k có , thì lấy đến hết chuỗi)
            if(end==-1){
                pos=description.substring(strat).trim();
            }else {
                pos=description.substring(strat,end).trim();
            }

            System.out.println("Vị trí tìm thấy: "+ pos);

            // thay kệ thành 'vị trí lưu trữ'
            String newDesc= description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: "+ newDesc);
        }else {
            System.out.println("Không tìm thấy thông tin");
        }
    }
}
