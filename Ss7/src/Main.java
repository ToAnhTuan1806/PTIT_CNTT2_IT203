import com.rikkeiedu.bt.*;

public class Main {
    public static void main(String[] args) {
        // Bai 1
        Student s1 = new Student("SV01", "Nguyễn Văn A");
        Student s2 = new Student("SV02", "Trần Thị B");
        Student s3 = new Student("SV03", "Lê Văn C");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
        System.out.println();
        Student.displayTotalStudent();
        System.out.println("------------------------------\n");


        // Bai 2
        // bien nguyen thuy
        int a = 5;
        int b = a;   // sao chep gtri
        b = 10;

        System.out.println("Bien nguyen thuy:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // bien tham chieu
        Box box1 = new Box();
        box1.value = 5;
        Box box2 = box1;
        box2.value = 10;

        System.out.println("Bien tham chieu:");
        System.out.println("box1.value = " + box1.value);
        System.out.println("box2.value = " + box2.value);
        System.out.println("------------------------------\n");


        //Bai3
        double[] scores = {6.5, 8.0, 4.5};
        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println();
        System.out.println("Kết quả xử lý:");

        //tinh diem tbinh
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println("- Điểm trung bình cả lớp: " + String.format("%.2f", avg));

        // ktra tung diem
        for (double score : scores) {
            boolean pass = ScoreUtils.checkPass(score);
            System.out.println("- Điểm " + score + ": " + (pass ? "Đạt" : "Trượt"));
        }
        System.out.println("------------------------------\n");


        //Bai 4
        ClassRoom std1 = new ClassRoom("Nguyễn Văn A");
        ClassRoom std2 = new ClassRoom("Trần Thị B");
        ClassRoom std3 = new ClassRoom("Lê Văn C");

        std1.contribute(100_000);
        std2.contribute(150_000);
        std3.contribute(200_000);

        System.out.println();
        ClassRoom.showClassFund();
        System.out.println("------------------------------\n");


        //Bai5
        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm không hợp lệ");
        }
        //co tinh thay doi hang so
        //Config.MAX_SCORE = 20.0;
        System.out.println("------------------------------\n");



        //Bai6
        User u1 = new User(1, "dev_a", "123456");
        User u2 = new User(2, "dev_b", "abcdef");
        User u3 = new User(3, "dev_c", "999999");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        //in tbao
        System.out.println(">> Đã thêm 3 user vào hệ thống.");
        System.out.println("Danh sách hiện tại:");
        for (int i = 0; i < UserManager.users.size(); i++) {
            System.out.println((i + 1) + ". " + UserManager.users.get(i));
        }

        System.out.println();
        System.out.println(">> Kiểm tra đăng nhập:");

        // dang nhap dung/sai
        boolean login1 = UserManager.checkLogin("dev_a", "123456");
        System.out.println("- Login (\"dev_a\", \"123456\"): " + (login1 ? "Thành công!" : "Thất bại!"));
        boolean login2 = UserManager.checkLogin("dev_b", "sai_pass");
        System.out.println("- Login (\"dev_b\", \"sai_pass\"): " + (login2 ? "Thành công!" : "Thất bại!"));

    }
}