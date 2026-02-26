import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai2 {
    public static List<String> xuLyDSThuoc(List<String> input){
        List<String> dsKhongTrung=new ArrayList<String>();
        for(String thuoc: input){
            if(!dsKhongTrung.contains(thuoc)){
                dsKhongTrung.add(thuoc);
            }
        }
        Collections.sort(dsKhongTrung);
        return dsKhongTrung;
    }
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Paracetamol");
        input.add("Ibuprofen");
        input.add("Panadol");
        input.add("Paracetamol");
        input.add("Aspirin");
        input.add("Ibuprofen");
        System.out.println("Input: " + input);
        List<String> output = xuLyDSThuoc(input);
        System.out.println("Output: " + output);
    }
}
