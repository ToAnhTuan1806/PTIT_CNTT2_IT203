package re.edu.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // SET kế thừa COLLECTION
        // set khog lưu trữ ptu trùng lập

        // 4 lớp triển khai:
        // HashSet(ko xác định thứ tự lưu)
        // LinkedHashSet (Vị trí chèn)
        // TreeSet (cay nhị phân, đc sắp xếp)
        // EnumSet (Nhẹ và nhanh)

        Set<Integer> set= new HashSet<>();
//        Set<Integer> set= new LinkedHashSet<>();
//        Set<Integer> set= new TreeSet<>(Comparator.reverseOrder());
//        Set<Integer> set= new EnumSet<>();
        set.add(1);
        set.add(10);
        set.add(11);
        set.add(101);
        System.out.println(set);

        // Cac phuong thuc lam viec
        TreeSet<Integer> set1= new TreeSet<>();
        set.add(1);
        set.add(1);// ko dc luu

        // duyet Set
        for (Integer value : set1) {

        }

        // duyet bang iterator
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            //lm viec voi ptu
            Integer value = iterator.next();
        }
    }
}
