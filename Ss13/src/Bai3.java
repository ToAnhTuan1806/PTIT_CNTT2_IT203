import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T>List<T> timBenhNhanTrung (List<T> listA, List<T> listB) {
        List<T> result = new ArrayList<>();
        for(T item: listA){
            if(listB.contains(item) && !result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {

        //th1 : Integer
        List<Integer> khoaNoi1 = new ArrayList<>();
        khoaNoi1.add(101);
        khoaNoi1.add(102);
        khoaNoi1.add(105);

        List<Integer> khoaNgoai1 = new ArrayList<>();
        khoaNgoai1.add(102);
        khoaNgoai1.add(105);
        khoaNgoai1.add(108);

        List<Integer> ketQua1 = timBenhNhanTrung(khoaNoi1, khoaNgoai1);
        System.out.println("truong hop 1: " + ketQua1);

        //th2: String
        List<String> khoaNoi2 = new ArrayList<>();
        khoaNoi2.add("DN01");
        khoaNoi2.add("DN02");
        khoaNoi2.add("DN03");

        List<String> khoaNgoai2 = new ArrayList<>();
        khoaNgoai2.add("DN02");
        khoaNgoai2.add("DN04");

        List<String> ketQua2 = timBenhNhanTrung(khoaNoi2, khoaNgoai2);
        System.out.println("truong hop 2: " + ketQua2);
    }
}
